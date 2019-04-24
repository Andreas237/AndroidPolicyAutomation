.class public Lcom/huawei/health/sns/ui/chat/GroupChatActivity;
.super Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/chat/GroupChatActivity$c;
    }
.end annotation


# instance fields
.field private U:I

.field protected V:Landroid/text/TextWatcher;

.field private W:Ljava/lang/String;

.field private Y:Landroid/widget/ImageView;

.field private Z:Lo/bgn;

.field private aa:Lo/atg;

.field private ab:Lo/bgp;

.field private ac:Landroid/widget/TextView;

.field private ad:I

.field private ae:Lo/atb;

.field private af:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation
.end field

.field private ag:Landroid/content/BroadcastReceiver;

.field private ah:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 82
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;-><init>()V

    .line 156
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->aa:Lo/atg;

    .line 181
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->ae:Lo/atb;

    .line 191
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->ah:Ljava/lang/String;

    .line 206
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->ad:I

    .line 1016
    new-instance v0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$2;-><init>(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->ag:Landroid/content/BroadcastReceiver;

    .line 1159
    new-instance v0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;-><init>(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->V:Landroid/text/TextWatcher;

    return-void
.end method

.method private O()V
    .locals 2

    .line 427
    const-string v0, "GroupChatActivity"

    const-string v1, "init the groupChat message list\'s ListView"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 428
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->j:Lo/bdu;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 430
    sget v0, Lcom/huawei/android/sns/R$id;->chat_message_listview:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bdu;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->j:Lo/bdu;

    .line 433
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->t()V

    .line 434
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->u()V

    .line 435
    return-void
.end method

.method private P()V
    .locals 5

    .line 798
    new-instance v0, Lo/atb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->I:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->f:J

    const/16 v3, 0x149

    const/4 v4, 0x1

    invoke-virtual {v0, v3, v1, v2, v4}, Lo/atb;->a(IJZ)V

    .line 799
    return-void
.end method

.method private Q()Lo/atb;
    .locals 2

    .line 784
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->ae:Lo/atb;

    if-nez v0, :cond_0

    .line 786
    new-instance v0, Lo/atb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->I:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->ae:Lo/atb;

    .line 788
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->ae:Lo/atb;

    return-object v0
.end method

.method private R()V
    .locals 10

    .line 307
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->getIntent()Landroid/content/Intent;

    move-result-object v7

    .line 308
    if-eqz v7, :cond_6

    .line 310
    invoke-virtual {v7}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v8

    .line 311
    if-nez v8, :cond_0

    .line 313
    return-void

    .line 315
    :cond_0
    const-string v0, "groupId"

    invoke-virtual {v8, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 317
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->f:J

    const-string v2, "groupId"

    invoke-virtual {v8, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->S:Z

    .line 318
    const-string v0, "groupId"

    invoke-virtual {v8, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->f:J

    goto :goto_1

    .line 321
    :cond_2
    const-string v0, "sns_sdk_key_group_id"

    invoke-virtual {v8, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 324
    const-string v0, "sns_sdk_key_group_id"

    invoke-virtual {v8, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->f:J

    .line 325
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->q:Z

    .line 327
    :cond_3
    :goto_1
    const-string v0, "message_id"

    invoke-virtual {v8, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 329
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->m:Z

    .line 330
    const-string v0, "message_id"

    invoke-virtual {v8, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->n:I

    .line 332
    :cond_4
    const-string v0, "unreadMsgNumber"

    invoke-virtual {v8, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 334
    const-string v0, "unreadMsgNumber"

    invoke-virtual {v8, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->H:I

    .line 335
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->L()V

    .line 339
    :cond_5
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->q:Z

    invoke-static {v7, v0}, Lo/bpc;->a(Landroid/content/Intent;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->q:Z

    .line 340
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->q:Z

    if-eqz v0, :cond_6

    const-string v0, "key_sns_pkg_name"

    invoke-virtual {v8, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 343
    const-string v0, "key_sns_pkg_name"

    invoke-virtual {v7, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 344
    invoke-static {}, Lo/aow;->e()Lo/aow;

    move-result-object v0

    move-object v1, p0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->f:J

    move-object v6, v9

    invoke-virtual/range {v0 .. v6}, Lo/aow;->e(Landroid/content/Context;JJLjava/lang/String;)V

    .line 348
    :cond_6
    return-void
.end method

.method private S()V
    .locals 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ResourceAsColor",
            "InflateParams"
        }
    .end annotation

    .line 357
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v3

    .line 358
    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz v3, :cond_0

    .line 360
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 362
    :cond_0
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    .line 364
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 366
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_group_chat_action_bar_title_for_emuifive:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v4, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/RelativeLayout;

    goto :goto_0

    .line 371
    :cond_1
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_groupchatr_actionbar_title:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v4, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/RelativeLayout;

    .line 374
    :goto_0
    invoke-static {v3, v5}, Lo/bmm;->b(Landroid/app/ActionBar;Landroid/view/View;)V

    .line 375
    sget v0, Lcom/huawei/android/sns/R$id;->sns_chat_groupName:I

    invoke-virtual {v5, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->ac:Landroid/widget/TextView;

    .line 376
    sget v0, Lcom/huawei/android/sns/R$id;->sns_chat_group_isSilence:I

    invoke-virtual {v5, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->Y:Landroid/widget/ImageView;

    .line 378
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 380
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->a(Z)V

    goto :goto_1

    .line 384
    :cond_2
    sget v0, Lcom/huawei/android/sns/R$id;->sns_layout_manager:I

    invoke-virtual {v5, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->w:Landroid/widget/LinearLayout;

    .line 385
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->w:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 387
    :goto_1
    if-eqz v3, :cond_3

    .line 388
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$drawable;->toolbar_bg:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/app/ActionBar;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 391
    :cond_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_4

    .line 393
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->getWindow()Landroid/view/Window;

    move-result-object v6

    .line 394
    const/high16 v0, -0x80000000

    invoke-virtual {v6, v0}, Landroid/view/Window;->addFlags(I)V

    .line 395
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$color;->sns_toolbar_bg_end_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v6, v0}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 399
    :cond_4
    return-void
.end method

.method private T()V
    .locals 4

    .line 967
    new-instance v0, Lo/bgn;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->I:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bgn;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->Z:Lo/bgn;

    .line 968
    new-instance v0, Lo/bgp;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->I:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bgp;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->ab:Lo/bgp;

    .line 969
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$g;->a:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->Z:Lo/bgn;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 970
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$a;->b:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->ab:Lo/bgp;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 971
    return-void
.end method

.method private U()V
    .locals 3

    .line 927
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->aa:Lo/atg;

    if-nez v0, :cond_0

    .line 929
    new-instance v0, Lo/atg;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->I:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atg;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->aa:Lo/atg;

    .line 931
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->aa:Lo/atg;

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->f:J

    invoke-virtual {v0, v1, v2}, Lo/atg;->e(J)V

    .line 932
    return-void
.end method

.method private V()Landroid/support/v4/content/LocalBroadcastManager;
    .locals 1

    .line 1050
    invoke-static {p0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    return-object v0
.end method

.method private W()V
    .locals 2

    .line 978
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->ab:Lo/bgp;

    if-eqz v0, :cond_0

    .line 980
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->ab:Lo/bgp;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 982
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->Z:Lo/bgn;

    if-eqz v0, :cond_1

    .line 984
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->Z:Lo/bgn;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 986
    :cond_1
    return-void
.end method

.method private X()V
    .locals 3

    .line 1034
    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    .line 1035
    const-string v0, "QUIT_GROUP_ACTION"

    invoke-virtual {v1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1036
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->V()Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v2

    .line 1037
    if-eqz v2, :cond_0

    .line 1039
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->ag:Landroid/content/BroadcastReceiver;

    invoke-virtual {v2, v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 1041
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)I
    .locals 1

    .line 82
    iget v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->ad:I

    return v0
.end method

.method private a(Landroid/os/Message;Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)V
    .locals 3

    .line 626
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    .line 627
    if-eqz v1, :cond_0

    .line 629
    const-string v0, "bundleKeyGroupMemberList"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    .line 630
    invoke-virtual {p2, v2}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->e(Ljava/util/ArrayList;)V

    .line 632
    :cond_0
    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 2

    .line 823
    if-eqz p1, :cond_0

    .line 825
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupType()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->U:I

    .line 826
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->b(J)V

    .line 827
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->c(Lcom/huawei/health/sns/model/group/Group;)V

    .line 828
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->e(Lcom/huawei/health/sns/model/group/Group;)V

    .line 830
    :cond_0
    return-void
.end method

.method private a(Z)V
    .locals 3

    .line 406
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v2

    .line 407
    if-eqz v2, :cond_0

    .line 409
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_group_chat_detail_emui_five_selector:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v2, p1, v0, p0}, Lo/bmm;->b(Landroid/app/ActionBar;ZLandroid/graphics/drawable/Drawable;Landroid/view/View$OnClickListener;)V

    .line 411
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;Landroid/os/Message;Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)Z
    .locals 1

    .line 82
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->e(Landroid/os/Message;Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)Z

    move-result v0

    return v0
.end method

.method private a(Ljava/lang/String;)Z
    .locals 4

    .line 1305
    const/4 v1, 0x0

    .line 1306
    invoke-static {}, Lo/bgh;->a()Lo/bgh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bgh;->c()[Ljava/lang/String;

    move-result-object v2

    .line 1307
    array-length v0, v2

    if-lez v0, :cond_1

    .line 1309
    const/4 v3, 0x0

    :goto_0
    array-length v0, v2

    if-ge v3, v0, :cond_1

    .line 1311
    aget-object v0, v2, v3

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1313
    const/4 v1, 0x1

    .line 1314
    goto :goto_1

    .line 1309
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1318
    :cond_1
    :goto_1
    return v1
.end method

.method private ab()V
    .locals 2

    .line 1058
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->V()Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v1

    .line 1059
    if-eqz v1, :cond_0

    .line 1061
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->ag:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v0}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 1063
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 82
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1148
    const-string v2, ""

    .line 1149
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1151
    const-string v0, "@"

    invoke-static {p1, v0}, Lo/bqz;->c(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1153
    const-string v0, "@"

    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 1156
    :cond_0
    return-object v2
.end method

.method private b(I)V
    .locals 6

    .line 939
    const/16 v0, 0x3f0

    if-ne p1, v0, :cond_1

    .line 941
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->q:Z

    if-eqz v0, :cond_0

    .line 943
    sget v0, Lcom/huawei/android/sns/R$string;->sns_normal_group_not_exist:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 944
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->finish()V

    goto :goto_0

    .line 948
    :cond_0
    new-instance v0, Lo/asx;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/asx;-><init>(Landroid/os/Handler;)V

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->f:J

    const/4 v1, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/asx;->d(IJZZ)V

    goto :goto_0

    .line 951
    :cond_1
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->q:Z

    if-eqz v0, :cond_2

    const/16 v0, 0x3f2

    if-ne p1, v0, :cond_2

    .line 953
    sget v0, Lcom/huawei/android/sns/R$string;->sns_not_group_member:I

    invoke-static {p0, v0}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 954
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->finish()V

    goto :goto_0

    .line 958
    :cond_2
    sget v0, Lcom/huawei/android/sns/R$string;->sns_server_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 960
    :goto_0
    return-void
.end method

.method private b(Landroid/os/Message;Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)V
    .locals 4

    .line 607
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 609
    const-string v0, "GroupChatActivity"

    const-string v1, "CODE_MSG_CLEAR_CHAT_DATA. userId is null"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 613
    :cond_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    .line 614
    invoke-virtual {p2, v2, v3}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->a(J)V

    .line 616
    :goto_0
    return-void
.end method

.method private b(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 2

    .line 887
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$1;

    invoke-direct {v1, p0, p1}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$1;-><init>(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;Lcom/huawei/health/sns/model/group/Group;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 907
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;Landroid/os/Message;Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)V
    .locals 0

    .line 82
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->a(Landroid/os/Message;Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;I)I
    .locals 0

    .line 82
    iput p1, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->ad:I

    return p1
.end method

.method private c(I)V
    .locals 3

    .line 774
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->Q()Lo/atb;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->f:J

    invoke-virtual {v0, p1, v1, v2}, Lo/atb;->e(IJ)V

    .line 775
    return-void
.end method

.method private c(Landroid/os/Message;Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)V
    .locals 3

    .line 661
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    .line 662
    if-eqz v1, :cond_3

    .line 664
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/model/group/Group;

    .line 665
    invoke-virtual {p2}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->w()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 667
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/group/Group;->getState()I

    move-result v0

    if-nez v0, :cond_0

    .line 669
    invoke-direct {p2, v2}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->d(Lcom/huawei/health/sns/model/group/Group;)V

    goto :goto_0

    .line 673
    :cond_0
    const/16 v0, 0x3f0

    invoke-direct {p2, v0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->b(I)V

    goto :goto_0

    .line 678
    :cond_1
    if-eqz v2, :cond_2

    .line 680
    invoke-direct {p2, v2}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->d(Lcom/huawei/health/sns/model/group/Group;)V

    goto :goto_0

    .line 684
    :cond_2
    invoke-direct {p2}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->P()V

    .line 688
    :cond_3
    :goto_0
    return-void
.end method

.method private c(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 3

    .line 856
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->W:Ljava/lang/String;

    .line 858
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->b(Lcom/huawei/health/sns/model/group/Group;)V

    .line 861
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->Y:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getDisturbMode()I

    move-result v1

    const/4 v2, 0x1

    if-ne v2, v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 863
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 865
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getState()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->a(Z)V

    goto :goto_3

    .line 869
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->w:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getState()I

    move-result v1

    const/4 v2, 0x0

    if-ne v2, v1, :cond_3

    const/4 v1, 0x0

    goto :goto_2

    :cond_3
    const/16 v1, 0x8

    :goto_2
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 873
    :goto_3
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 875
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->Y:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 877
    :cond_4
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;Landroid/os/Message;Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)V
    .locals 0

    .line 82
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->k(Landroid/os/Message;Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)V

    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 1

    .line 916
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->ac:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 918
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->ac:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 920
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;Ljava/lang/String;)Z
    .locals 1

    .line 82
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->d(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)Ljava/lang/String;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->W:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 82
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->ah:Ljava/lang/String;

    return-object p1
.end method

.method private d(Landroid/os/Message;Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)V
    .locals 3

    .line 642
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    .line 643
    if-eqz v1, :cond_0

    .line 645
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/model/group/Group;

    .line 646
    if-eqz v2, :cond_0

    .line 648
    invoke-direct {p2, v2}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->d(Lcom/huawei/health/sns/model/group/Group;)V

    .line 651
    :cond_0
    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 3

    .line 808
    const-string v0, "GroupChatActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "buildLocalGroupInfo:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 809
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->a(Lcom/huawei/health/sns/model/group/Group;)V

    .line 810
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getState()I

    move-result v0

    if-nez v0, :cond_0

    .line 812
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->U()V

    .line 814
    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;I)V
    .locals 0

    .line 82
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->b(I)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;Landroid/os/Message;Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)V
    .locals 0

    .line 82
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->f(Landroid/os/Message;Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)V

    return-void
.end method

.method private d(Ljava/lang/String;)Z
    .locals 5

    .line 1121
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->b()Ljava/util/ArrayList;

    move-result-object v1

    .line 1122
    const/4 v2, 0x0

    .line 1123
    const/4 v0, 0x0

    if-eq v0, v1, :cond_4

    .line 1125
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 1127
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserNickname()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserNickname()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1128
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserGroupNickname()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserGroupNickname()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1130
    :cond_1
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserRemarkName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserRemarkName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1132
    :cond_2
    const/4 v2, 0x1

    .line 1133
    goto :goto_1

    .line 1135
    :cond_3
    goto :goto_0

    .line 1137
    :cond_4
    :goto_1
    return v2
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)Ljava/lang/String;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->ah:Ljava/lang/String;

    return-object v0
.end method

.method private e(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 2

    .line 840
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->s:Lo/bdj;

    if-eqz v0, :cond_1

    .line 843
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getShowNicknameMode()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->p:Z

    .line 844
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->s:Lo/bdj;

    invoke-virtual {v0}, Lo/bdj;->notifyDataSetChanged()V

    .line 846
    :cond_1
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;Landroid/os/Message;Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)V
    .locals 0

    .line 82
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->b(Landroid/os/Message;Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)V

    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 7

    .line 746
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 748
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 749
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->z:Lo/bfb;

    invoke-virtual {v0}, Lo/bfb;->getInputIndex()I

    move-result v5

    .line 750
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->z:Lo/bfb;

    invoke-virtual {v0}, Lo/bfb;->getInputEdit()Landroid/text/Editable;

    move-result-object v6

    .line 751
    if-eqz v6, :cond_0

    .line 753
    invoke-interface {v6, v5, v4}, Landroid/text/Editable;->insert(ILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 756
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->z:Lo/bfb;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v5

    invoke-virtual {v0, v1}, Lo/bfb;->setInputSelection(I)V

    .line 757
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->z:Lo/bfb;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$4;-><init>(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)V

    const-wide/16 v2, 0x32

    invoke-virtual {v0, v1, v2, v3}, Lo/bfb;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 767
    :cond_1
    return-void
.end method

.method private e(Landroid/os/Message;Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)Z
    .locals 2

    .line 567
    const/4 v1, 0x0

    .line 568
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 575
    :sswitch_0
    const/16 v0, 0x150

    invoke-direct {p2, v0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->c(I)V

    .line 576
    const/4 v1, 0x1

    .line 577
    goto :goto_0

    .line 582
    :sswitch_1
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->c(Landroid/os/Message;Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)V

    .line 583
    const/4 v1, 0x1

    .line 584
    goto :goto_0

    .line 589
    :sswitch_2
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->d(Landroid/os/Message;Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)V

    .line 590
    const/4 v1, 0x1

    .line 591
    .line 596
    :goto_0
    return v1

    :sswitch_data_0
    .sparse-switch
        0x81 -> :sswitch_0
        0x91 -> :sswitch_0
        0x148 -> :sswitch_1
        0x149 -> :sswitch_2
    .end sparse-switch
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;Ljava/lang/String;)Z
    .locals 1

    .line 82
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private f(Landroid/os/Message;Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)V
    .locals 2

    .line 698
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 699
    if-eqz v1, :cond_0

    .line 701
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->c(Ljava/lang/String;)V

    .line 703
    :cond_0
    return-void
.end method

.method private g(Landroid/os/Message;Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)V
    .locals 2

    .line 732
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 733
    if-eqz v1, :cond_0

    .line 735
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->e(Ljava/lang/String;)V

    .line 737
    :cond_0
    return-void
.end method

.method static synthetic h(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;Landroid/os/Message;Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)V
    .locals 0

    .line 82
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->g(Landroid/os/Message;Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)V

    return-void
.end method

.method private k()V
    .locals 2

    .line 261
    const-string v0, "GroupChatActivity"

    const-string v1, "getSelfSNSInfo"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 262
    new-instance v0, Lo/axf;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/axf;-><init>(Landroid/os/Handler;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/axf;->d(I)V

    .line 263
    return-void
.end method

.method private k(Landroid/os/Message;Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)V
    .locals 3

    .line 713
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    .line 714
    if-eqz v1, :cond_0

    .line 716
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/sns/model/group/Group;

    .line 717
    if-eqz v2, :cond_0

    .line 719
    invoke-direct {p2, v2}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->a(Lcom/huawei/health/sns/model/group/Group;)V

    .line 722
    :cond_0
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 1

    .line 268
    new-instance v0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$c;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$c;-><init>(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->I:Landroid/os/Handler;

    .line 269
    return-void
.end method

.method public a(Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 6

    .line 472
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 474
    const-string v0, "GroupChatActivity"

    const-string v1, "the param for sendMessage is null. there may be something wrong."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 475
    return-void

    .line 477
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->A:Z

    .line 478
    new-instance v0, Lo/bdk;

    invoke-direct {v0}, Lo/bdk;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->k:Landroid/content/Context;

    move-object v2, p1

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->f:J

    iget-object v5, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->W:Ljava/lang/String;

    invoke-virtual/range {v0 .. v5}, Lo/bdk;->d(Landroid/content/Context;Lcom/huawei/health/sns/model/chat/MessageItem;JLjava/lang/String;)V

    .line 479
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/apz;->d(Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 480
    return-void
.end method

.method public b()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation

    .line 1100
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->af:Ljava/util/ArrayList;

    return-object v0
.end method

.method protected b(J)V
    .locals 2

    .line 1072
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$5;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$5;-><init>(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;J)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 1091
    return-void
.end method

.method protected c()V
    .locals 2

    .line 442
    invoke-super {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->c()V

    .line 443
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->z:Lo/bfb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->V:Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Lo/bfb;->setCustTextInputListener(Landroid/text/TextWatcher;)V

    .line 444
    return-void
.end method

.method public e()I
    .locals 1

    .line 1323
    iget v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->U:I

    .line 1324
    return v0
.end method

.method public e(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;)V"
        }
    .end annotation

    .line 1110
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->af:Ljava/util/ArrayList;

    .line 1111
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 8

    .line 1243
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 1244
    const/4 v0, 0x1

    if-ne p1, v0, :cond_4

    const/4 v0, 0x1

    if-ne p2, v0, :cond_4

    .line 1246
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->z:Lo/bfb;

    invoke-virtual {v0}, Lo/bfb;->getInputIndex()I

    move-result v4

    .line 1247
    const/4 v5, 0x0

    .line 1248
    if-eqz p3, :cond_0

    .line 1252
    const-string v0, "userName"

    :try_start_0
    invoke-virtual {p3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v5, v0

    .line 1257
    goto :goto_0

    .line 1254
    :catch_0
    move-exception v6

    .line 1256
    const-string v0, "GroupChatActivity"

    const-string v1, "AssistantChatActivity onActivityResult get intent data exception"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1259
    :cond_0
    :goto_0
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1261
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->z:Lo/bfb;

    invoke-virtual {v0}, Lo/bfb;->getInputEdit()Landroid/text/Editable;

    move-result-object v6

    .line 1262
    if-eqz v6, :cond_3

    .line 1264
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 1265
    if-ltz v4, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->z:Lo/bfb;

    invoke-virtual {v0}, Lo/bfb;->getInputEdit()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    if-lt v4, v0, :cond_2

    .line 1267
    :cond_1
    invoke-interface {v6, v7}, Landroid/text/Editable;->append(Ljava/lang/CharSequence;)Landroid/text/Editable;

    .line 1268
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->z:Lo/bfb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->z:Lo/bfb;

    invoke-virtual {v1}, Lo/bfb;->getInputEdit()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/bfb;->setInputSelection(I)V

    goto :goto_1

    .line 1272
    :cond_2
    invoke-interface {v6, v4, v7}, Landroid/text/Editable;->insert(ILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 1273
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->z:Lo/bfb;

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v4

    invoke-virtual {v0, v1}, Lo/bfb;->setInputSelection(I)V

    .line 1278
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->z:Lo/bfb;

    new-instance v1, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$7;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$7;-><init>(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)V

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Lo/bfb;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1289
    :cond_4
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 416
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 417
    const-class v0, Lcom/huawei/health/sns/ui/group/NormalGroupActivity;

    invoke-virtual {v3, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 418
    const-string v0, "groupId"

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->f:J

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 419
    invoke-virtual {p0, v3}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->startActivity(Landroid/content/Intent;)V

    .line 420
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1294
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 1295
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 211
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->onCreate(Landroid/os/Bundle;)V

    .line 214
    invoke-static {}, Lo/aop;->e()Lo/aop;

    move-result-object v0

    invoke-virtual {v0}, Lo/aop;->c()V

    .line 216
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->l:Z

    .line 220
    :try_start_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->R()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 226
    goto :goto_0

    .line 222
    :catch_0
    move-exception v4

    .line 224
    const-string v0, "GroupChatActivity"

    const-string v1, "GroupChatActivity onCreate get intent data exception "

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->finish()V

    .line 228
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->B()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 229
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->k()V

    .line 232
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->A()V

    .line 234
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->I:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-static {v1, v0}, Lo/apf;->a(ILandroid/os/Handler;)V

    .line 236
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->S()V

    .line 238
    const/16 v0, 0x148

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->c(I)V

    .line 240
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->O()V

    .line 242
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->T()V

    .line 244
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->X()V

    .line 246
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->H()V

    .line 248
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->c()V

    .line 250
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->f:J

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->c(J)V

    .line 252
    invoke-static {}, Lo/aus;->b()Lo/aus;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->f:J

    iget-object v3, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->I:Landroid/os/Handler;

    invoke-virtual {v0, v1, v2, v3}, Lo/aus;->b(JLandroid/os/Handler;)V

    .line 254
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 991
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->aa:Lo/atg;

    if-eqz v0, :cond_0

    .line 993
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->aa:Lo/atg;

    invoke-virtual {v0}, Lo/atg;->c()V

    .line 995
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->W()V

    .line 996
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->I:Landroid/os/Handler;

    if-eqz v0, :cond_1

    .line 998
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->I:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-static {v1, v0}, Lo/apf;->c(ILandroid/os/Handler;)V

    .line 999
    invoke-static {}, Lo/aus;->b()Lo/aus;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->f:J

    iget-object v3, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->I:Landroid/os/Handler;

    invoke-virtual {v0, v1, v2, v3}, Lo/aus;->d(JLandroid/os/Handler;)V

    .line 1002
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->ab()V

    .line 1003
    invoke-super {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->onDestroy()V

    .line 1004
    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 5

    .line 274
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 275
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->setIntent(Landroid/content/Intent;)V

    .line 279
    :try_start_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->R()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 285
    goto :goto_0

    .line 281
    :catch_0
    move-exception v4

    .line 283
    const-string v0, "GroupChatActivity"

    const-string v1, "AssistantChatActivity onNewIntent get intent data exception "

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 284
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->finish()V

    .line 287
    :goto_0
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->S:Z

    if-nez v0, :cond_0

    .line 289
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->j:Lo/bdu;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/bdu;->setVisibility(I)V

    .line 290
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->E()V

    .line 291
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->l()V

    .line 292
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->S()V

    .line 293
    const/16 v0, 0x148

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->c(I)V

    .line 295
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->f:J

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->c(J)V

    .line 296
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->H()V

    .line 297
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->O:Landroid/os/Handler;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_1

    .line 301
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->O:Landroid/os/Handler;

    const/16 v1, 0x64

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 303
    :goto_1
    return-void
.end method

.method public onPause()V
    .locals 1

    .line 460
    invoke-super {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->onPause()V

    .line 461
    invoke-static {}, Lo/aut;->c()Lo/aut;

    move-result-object v0

    invoke-virtual {v0}, Lo/aut;->b()V

    .line 462
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 450
    invoke-super {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->onResume()V

    .line 451
    invoke-static {}, Lo/auv;->b()V

    .line 452
    invoke-static {}, Lo/aut;->c()Lo/aut;

    move-result-object v0

    sget-object v1, Lo/auu$b;->a:Lo/auu$b;

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->f:J

    invoke-virtual {v0, v1, v2, v3}, Lo/aut;->e(Lo/auu$b;J)V

    .line 454
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->z()V

    .line 455
    return-void
.end method

.method public onStop()V
    .locals 3

    .line 1009
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->f:J

    const/4 v2, 0x2

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->c(JI)V

    .line 1010
    invoke-super {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->onStop()V

    .line 1011
    return-void
.end method

.method protected q()V
    .locals 2

    .line 485
    invoke-super {p0}, Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;->q()V

    .line 486
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->O:Landroid/os/Handler;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 487
    return-void
.end method
