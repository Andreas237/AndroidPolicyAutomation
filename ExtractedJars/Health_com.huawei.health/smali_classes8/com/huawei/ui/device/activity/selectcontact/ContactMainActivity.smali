.class public Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/support/v4/app/ActivityCompat$OnRequestPermissionsResultCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$a;
    }
.end annotation


# static fields
.field private static u:[Ljava/lang/String;


# instance fields
.field private a:Lo/enz;

.field b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/datatype/Contact;>;"
        }
    .end annotation
.end field

.field private c:Landroid/widget/TextView;

.field d:Z

.field private e:Landroid/content/Context;

.field private f:Landroid/widget/LinearLayout;

.field private g:Landroid/widget/LinearLayout;

.field private h:Landroid/widget/LinearLayout;

.field private i:Landroid/widget/LinearLayout;

.field private k:Landroid/widget/LinearLayout;

.field private l:Landroid/widget/ListView;

.field private m:Lo/eou;

.field private n:Lo/egv;

.field private o:Lo/egd;

.field private p:Landroid/widget/ImageView;

.field private q:Lo/ems;

.field private r:J

.field private s:Landroid/os/Handler;

.field private t:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 90
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.READ_CONTACTS"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->u:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 69
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 85
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->n:Lo/egv;

    .line 95
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->r:J

    .line 99
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->d:Z

    .line 102
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->b:Ljava/util/List;

    .line 105
    const/4 v0, 0x5

    iput v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->t:I

    .line 116
    new-instance v0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$a;

    invoke-direct {v0, p0, p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$a;-><init>(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->s:Landroid/os/Handler;

    return-void
.end method

.method private a()V
    .locals 4

    .line 159
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter handleSetSuccess!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->g()V

    .line 165
    return-void
.end method

.method private a(ILandroid/content/Intent;)V
    .locals 4

    .line 525
    const/4 v0, -0x1

    if-ne v0, p1, :cond_0

    .line 526
    invoke-direct {p0, p2}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->b(Landroid/content/Intent;)V

    goto :goto_0

    .line 529
    :cond_0
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "select data from system contact error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 531
    :goto_0
    return-void
.end method

.method private a(Landroid/content/Intent;)V
    .locals 8

    .line 769
    const-string v0, "userName"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 770
    const-string v0, "contactId"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 771
    const-string v0, "selectNumber"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 772
    const-string v0, "numberType"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 774
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getIntent userName="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", contactId="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", selectNumber="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", numberType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 778
    invoke-direct {p0, v4, v5, v6, v7}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 779
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->a()V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 722
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveData2List, userName="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "userId="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "userNumber="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "numberType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 725
    new-instance v4, Lcom/huawei/datatype/PhoneNumber;

    invoke-direct {v4, p4, p3}, Lcom/huawei/datatype/PhoneNumber;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 727
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 728
    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 729
    new-instance v6, Lcom/huawei/datatype/Contact;

    invoke-direct {v6, p2, p1, v5}, Lcom/huawei/datatype/Contact;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 730
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->b:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 733
    const/4 v7, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_0

    .line 734
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveData2List get() return ContactTable["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "] = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->b:Ljava/util/List;

    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 733
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 737
    :cond_0
    return-void
.end method

.method private b()V
    .locals 4

    .line 195
    sget v0, Lcom/huawei/ui/device/R$id;->buttomview:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ems;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->q:Lo/ems;

    .line 196
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$layout;->activity_device_settings_contact_main_activity_black_bottomview:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 197
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->q:Lo/ems;

    invoke-virtual {v0, v3}, Lo/ems;->e(Landroid/view/View;)V

    .line 198
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->q:Lo/ems;

    invoke-virtual {v0, p0}, Lo/ems;->a(Landroid/app/Activity;)V

    .line 200
    sget v0, Lcom/huawei/ui/device/R$id;->contact_main_null_tv:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->c:Landroid/widget/TextView;

    .line 201
    sget v0, Lcom/huawei/ui/device/R$id;->contact_main_listview_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->g:Landroid/widget/LinearLayout;

    .line 202
    sget v0, Lcom/huawei/ui/device/R$id;->contact_main_null_layout:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->f:Landroid/widget/LinearLayout;

    .line 203
    sget v0, Lcom/huawei/ui/device/R$id;->contact_main_bottom_add_layout:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->i:Landroid/widget/LinearLayout;

    .line 204
    sget v0, Lcom/huawei/ui/device/R$id;->contact_main_bottom_orderby_layout:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->k:Landroid/widget/LinearLayout;

    .line 205
    sget v0, Lcom/huawei/ui/device/R$id;->contact_main_bottom_delete_layout:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->h:Landroid/widget/LinearLayout;

    .line 206
    sget v0, Lcom/huawei/ui/device/R$id;->contact_main_bottom_add_image:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->p:Landroid/widget/ImageView;

    .line 207
    sget v0, Lcom/huawei/ui/device/R$id;->no_contact_add_button:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->o:Lo/egd;

    .line 208
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->i:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 209
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->k:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 210
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->h:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 211
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->o:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 214
    return-void
.end method

.method private b(Landroid/content/Intent;)V
    .locals 15

    .line 537
    const-string v6, ""

    .line 538
    const-string v7, ""

    .line 539
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 540
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 542
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 543
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWhenSelectOneItemFromContact() get null data!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 544
    return-void

    .line 548
    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v10

    .line 550
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v11

    .line 551
    move-object v0, v11

    move-object v1, v10

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v12

    .line 553
    const/4 v0, 0x0

    if-eq v0, v12, :cond_1

    :try_start_0
    invoke-interface {v12}, Landroid/database/Cursor;->getCount()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_1

    .line 554
    invoke-interface {v12}, Landroid/database/Cursor;->moveToFirst()Z

    .line 555
    const-string v0, "display_name"

    invoke-interface {v12, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v12, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object v6, v0

    .line 556
    const-string v0, "_id"

    invoke-interface {v12, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v12, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object v7, v0

    goto :goto_0

    .line 558
    :cond_1
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWhenSelectOneItemFromContact get null cursor!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 559
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===wwww===have no permission ===have no cursor"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 560
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_contact_have_no_permission_to_read_health:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 566
    const/4 v0, 0x0

    if-eq v0, v12, :cond_2

    .line 567
    invoke-interface {v12}, Landroid/database/Cursor;->close()V

    .line 561
    :cond_2
    return-void

    .line 566
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v12, :cond_4

    .line 567
    invoke-interface {v12}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 563
    :catch_0
    move-exception v13

    .line 564
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleWhenSelectOneItemFromContact() Exception="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v13}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 566
    const/4 v0, 0x0

    if-eq v0, v12, :cond_4

    .line 567
    invoke-interface {v12}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 566
    :catchall_0
    move-exception v14

    const/4 v0, 0x0

    if-eq v0, v12, :cond_3

    .line 567
    invoke-interface {v12}, Landroid/database/Cursor;->close()V

    .line 569
    :cond_3
    throw v14

    .line 572
    :cond_4
    :goto_1
    invoke-direct {p0, v7, v8, v9}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->c(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 575
    const/4 v0, 0x0

    if-eq v0, v8, :cond_5

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_8

    .line 576
    :cond_5
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===wwww===have name or number"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 577
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->n:Lo/egv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 578
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->n:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 579
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDialogSetlock Already show!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 580
    return-void

    .line 585
    :cond_6
    new-instance v0, Lo/egv$b;

    invoke-direct {v0, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_contact_gemini_have_no_name_or_number_title:I

    .line 586
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_contact_gemini_have_no_name_or_number_content:I

    .line 587
    invoke-virtual {v0, v1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_common_notification_know_tips:I

    new-instance v2, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$4;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$4;-><init>(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)V

    .line 588
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v13

    .line 597
    invoke-virtual {v13}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->n:Lo/egv;

    .line 598
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->n:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 599
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->n:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->isShowing()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_7

    .line 600
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->n:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 602
    :cond_7
    goto/16 :goto_4

    .line 603
    :cond_8
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_b

    .line 604
    const/4 v13, 0x0

    :goto_2
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v13, v0, :cond_b

    .line 605
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v14, v0, -0x1

    :goto_3
    if-le v14, v13, :cond_a

    .line 606
    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 607
    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 605
    :cond_9
    add-int/lit8 v14, v14, -0x1

    goto :goto_3

    .line 604
    :cond_a
    add-int/lit8 v13, v13, 0x1

    goto :goto_2

    .line 612
    :cond_b
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===wwww===userNumbers==="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 613
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_c

    .line 614
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===wwww===have name and one number"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 615
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {p0, v6, v7, v0, v1}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    .line 618
    :cond_c
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===wwww===have name and one number"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 619
    invoke-direct {p0, v6, v7, v8, v9}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->e(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 622
    :goto_4
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->e()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)Lo/enz;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->a:Lo/enz;

    return-object v0
.end method

.method private c()V
    .locals 1

    .line 220
    iget-boolean v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->d:Z

    if-eqz v0, :cond_0

    .line 221
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->k()V

    goto :goto_0

    .line 223
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->i()V

    .line 225
    :goto_0
    return-void
.end method

.method private c(ILandroid/content/Intent;)V
    .locals 4

    .line 757
    const/4 v0, -0x1

    if-ne v0, p1, :cond_0

    .line 758
    invoke-direct {p0, p2}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->a(Landroid/content/Intent;)V

    goto :goto_0

    .line 761
    :cond_0
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "select data from select list error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 763
    :goto_0
    return-void
.end method

.method private c(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/ArrayList<Ljava/lang/String;>;Ljava/util/ArrayList<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 680
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v6

    .line 682
    move-object v0, v6

    sget-object v1, Landroid/provider/ContactsContract$CommonDataKinds$Phone;->CONTENT_URI:Landroid/net/Uri;

    const-string v3, "contact_id = ?"

    const/4 v2, 0x1

    new-array v4, v2, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v4, v2

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 686
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    :try_start_0
    invoke-interface {v7}, Landroid/database/Cursor;->getCount()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_0

    .line 687
    :goto_0
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 688
    const-string v0, "data1"

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 689
    const-string v0, "data2"

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->e(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 692
    :cond_0
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWhenSelectOneItemFromContact get null cursor!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 698
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 699
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 693
    :cond_1
    return-void

    .line 698
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v7, :cond_4

    .line 699
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 695
    :catch_0
    move-exception v8

    .line 696
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "queryContactNumber() Exception="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 698
    const/4 v0, 0x0

    if-eq v0, v7, :cond_4

    .line 699
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    goto :goto_1

    .line 698
    :catchall_0
    move-exception v9

    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    .line 699
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 701
    :cond_3
    throw v9

    .line 703
    :cond_4
    :goto_1
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)Landroid/content/Context;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->e:Landroid/content/Context;

    return-object v0
.end method

.method private d()V
    .locals 4

    .line 232
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->e:Landroid/content/Context;

    .line 234
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/enz;->b(Landroid/content/Context;)Lo/enz;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->a:Lo/enz;

    .line 237
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->a:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->e:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/enz;->c(Landroid/content/Context;)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->t:I

    .line 238
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initData() mMaxContactNumber="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->t:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    iget v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->t:I

    if-gtz v0, :cond_0

    .line 240
    const/4 v0, 0x5

    iput v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->t:I

    .line 241
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get ERROR mMaxContactNumber!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->g()V

    .line 245
    return-void
.end method

.method private e(I)Ljava/lang/String;
    .locals 4

    .line 627
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getNumberType() numberType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 628
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 630
    :pswitch_0
    const-string v0, "Home"

    return-object v0

    .line 632
    :pswitch_1
    const-string v0, "Mobile"

    return-object v0

    .line 634
    :pswitch_2
    const-string v0, "Work"

    return-object v0

    .line 636
    :pswitch_3
    const-string v0, "Work Fax"

    return-object v0

    .line 638
    :pswitch_4
    const-string v0, "Home Fax"

    return-object v0

    .line 640
    :pswitch_5
    const-string v0, "Pager"

    return-object v0

    .line 642
    :pswitch_6
    const-string v0, "Other"

    return-object v0

    .line 644
    :pswitch_7
    const-string v0, "Callback"

    return-object v0

    .line 646
    :pswitch_8
    const-string v0, "Car"

    return-object v0

    .line 648
    :pswitch_9
    const-string v0, "Company Main"

    return-object v0

    .line 650
    :pswitch_a
    const-string v0, "ISDN"

    return-object v0

    .line 652
    :pswitch_b
    const-string v0, "Main"

    return-object v0

    .line 654
    :pswitch_c
    const-string v0, "Other Fax"

    return-object v0

    .line 656
    :pswitch_d
    const-string v0, "Radio"

    return-object v0

    .line 658
    :pswitch_e
    const-string v0, "Telex"

    return-object v0

    .line 660
    :pswitch_f
    const-string v0, "TTY TDD"

    return-object v0

    .line 662
    :pswitch_10
    const-string v0, "Work Mobile"

    return-object v0

    .line 664
    :pswitch_11
    const-string v0, "Work Pager"

    return-object v0

    .line 666
    :pswitch_12
    const-string v0, "Assistant"

    return-object v0

    .line 668
    :pswitch_13
    const-string v0, "MMS"

    return-object v0

    .line 670
    :goto_0
    const-string v0, "Custom"

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_10
        :pswitch_11
        :pswitch_12
        :pswitch_13
    .end packed-switch
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;Lo/egv;)Lo/egv;
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->n:Lo/egv;

    return-object p1
.end method

.method private e()V
    .locals 4

    .line 171
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter handleSetFail!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_settings_mult_alarm_clock_synchroFailed_dialog:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 173
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->c()V

    return-void
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 710
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "send Data to Device!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 712
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 715
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->q()V

    .line 716
    return-void
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList<Ljava/lang/String;>;Ljava/util/ArrayList<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 743
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startSelectNumberDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 744
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 745
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->e:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/device/activity/selectcontact/ContactSelectNumberDialog;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 746
    const-string v0, "userName"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 747
    const-string v0, "contactId"

    invoke-virtual {v4, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 748
    const-string v0, "userNumbers"

    invoke-virtual {v4, v0, p3}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 749
    const-string v0, "numberTypes"

    invoke-virtual {v4, v0, p4}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 750
    const/4 v0, 0x2

    invoke-virtual {p0, v4, v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 751
    return-void
.end method

.method static synthetic f(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)Lo/egv;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->n:Lo/egv;

    return-object v0
.end method

.method private f()V
    .locals 1

    .line 290
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->d:Z

    .line 292
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->b:Ljava/util/List;

    .line 293
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)Landroid/os/Handler;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->s:Landroid/os/Handler;

    return-object v0
.end method

.method private g()V
    .locals 4

    .line 252
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 253
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->a:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->e:Landroid/content/Context;

    new-instance v2, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$5;

    invoke-direct {v2, p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$5;-><init>(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/enz;->d(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 271
    return-void
.end method

.method private h()V
    .locals 1

    .line 279
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->d:Z

    .line 283
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->p()V

    return-void
.end method

.method private i()V
    .locals 5

    .line 344
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->f:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 345
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->q:Lo/ems;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/ems;->setVisibility(I)V

    .line 346
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->i:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 347
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->g:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 348
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->k:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 349
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->h:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 350
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->o:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 351
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/env;->d(Landroid/content/Context;)Lo/env;

    move-result-object v0

    invoke-virtual {v0}, Lo/env;->d()Ljava/lang/String;

    move-result-object v4

    .line 352
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->c:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/device/R$string;->IDS_contact_no_contact_introduce:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 353
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->h()V

    return-void
.end method

.method private k()V
    .locals 9

    .line 300
    sget v0, Lcom/huawei/ui/device/R$id;->contact_main_listview:I

    invoke-static {p0, v0}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->l:Landroid/widget/ListView;

    .line 302
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->l:Landroid/widget/ListView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->device_settings_contact_listview_item_selector_black:I

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelector(I)V

    .line 304
    new-instance v0, Lo/eou;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->b:Ljava/util/List;

    invoke-direct {v0, p0, v1}, Lo/eou;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->m:Lo/eou;

    .line 307
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFooterViewsCount size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->l:Landroid/widget/ListView;

    invoke-virtual {v3}, Landroid/widget/ListView;->getFooterViewsCount()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 308
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->l:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getFooterViewsCount()I

    move-result v0

    if-nez v0, :cond_0

    .line 310
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFooterViewsCount size = 0======"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 312
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$layout;->activity_device_settings_contact_main_listview_bottom_item_layout_black:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    .line 313
    sget v0, Lcom/huawei/ui/device/R$id;->footer_tv:I

    invoke-static {v6, v0}, Lo/enc;->e(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    .line 314
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/env;->d(Landroid/content/Context;)Lo/env;

    move-result-object v0

    invoke-virtual {v0}, Lo/env;->d()Ljava/lang/String;

    move-result-object v8

    .line 315
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_contact_most_introduce:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v8, v1, v2

    iget v2, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->t:I

    int-to-double v2, v2

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v2, v3, v4, v5}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 316
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->l:Landroid/widget/ListView;

    invoke-virtual {v0, v6}, Landroid/widget/ListView;->addFooterView(Landroid/view/View;)V

    .line 318
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->l:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->m:Lo/eou;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 321
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->o:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 322
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->q:Lo/ems;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ems;->setVisibility(I)V

    .line 323
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->g:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 324
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->i:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 325
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    .line 326
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->k:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 328
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->k:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 330
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->t:I

    add-int/lit8 v1, v1, -0x1

    if-le v0, v1, :cond_2

    .line 331
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->p:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$mipmap;->ic_add_disable:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 333
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->p:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/device/R$drawable;->common_add_new_21:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 335
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->h:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 336
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->f:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 337
    return-void
.end method

.method static synthetic k(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->f()V

    return-void
.end method

.method private l()V
    .locals 5

    .line 436
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->e:Landroid/content/Context;

    sget-object v1, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->u:[Ljava/lang/String;

    invoke-static {v0, v1}, Lo/dbe;->c(Landroid/content/Context;[Ljava/lang/String;)Z

    move-result v4

    .line 437
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "hasPermission ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 439
    if-nez v4, :cond_0

    .line 440
    sget-object v0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->u:[Ljava/lang/String;

    new-instance v1, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$3;-><init>(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)V

    invoke-static {p0, v0, v1}, Lo/dbe;->a(Landroid/app/Activity;[Ljava/lang/String;Lo/dbs;)V

    goto :goto_0

    .line 454
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->p()V

    .line 456
    :goto_0
    return-void
.end method

.method private m()V
    .locals 3

    .line 488
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-lt v1, v0, :cond_0

    .line 490
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_contact_reach_min_contact_count:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    goto :goto_0

    .line 492
    :cond_0
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 493
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->e:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/device/activity/selectcontact/ContactDeleteActivity;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 494
    invoke-virtual {p0, v2}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->startActivity(Landroid/content/Intent;)V

    .line 496
    :goto_0
    return-void
.end method

.method private n()Z
    .locals 6

    .line 401
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 403
    iget-wide v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->r:J

    sub-long v0, v4, v0

    const-wide/16 v2, 0x3e8

    cmp-long v0, v2, v0

    if-lez v0, :cond_0

    .line 404
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, ">_< >_< click too much"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 405
    iput-wide v4, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->r:J

    .line 406
    const/4 v0, 0x1

    return v0

    .line 408
    :cond_0
    iput-wide v4, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->r:J

    .line 409
    const/4 v0, 0x0

    return v0
.end method

.method private o()V
    .locals 3

    .line 474
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-lt v1, v0, :cond_0

    .line 476
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_contact_reach_min_contact_count:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    goto :goto_0

    .line 478
    :cond_0
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 479
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->e:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/device/activity/selectcontact/ContactOrderbyActivity;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 480
    invoke-virtual {p0, v2}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->startActivity(Landroid/content/Intent;)V

    .line 482
    :goto_0
    return-void
.end method

.method private p()V
    .locals 5

    .line 420
    iget v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->t:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-gt v0, v1, :cond_0

    .line 424
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startAddContactActivity() addButtonClick() Can\'t greater than "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->t:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 427
    :cond_0
    new-instance v4, Landroid/content/Intent;

    const-string v0, "android.intent.action.PICK"

    sget-object v1, Landroid/provider/ContactsContract$Contacts;->CONTENT_URI:Landroid/net/Uri;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 428
    const/4 v0, 0x1

    invoke-virtual {p0, v4, v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 430
    :goto_0
    return-void
.end method

.method private q()V
    .locals 5

    .line 785
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->a:Lo/enz;

    if-nez v0, :cond_0

    .line 786
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mDeviceSettingsInteractors of send2Device error null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 787
    return-void

    .line 791
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/env;->d(Landroid/content/Context;)Lo/env;

    move-result-object v4

    .line 792
    invoke-virtual {v4}, Lo/env;->i()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    .line 793
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->u()V

    .line 796
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->a:Lo/enz;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->e:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->b:Ljava/util/List;

    new-instance v3, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$2;

    invoke-direct {v3, p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity$2;-><init>(Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;)V

    invoke-virtual {v0, v1, v2, v3}, Lo/enz;->d(Landroid/content/Context;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 821
    return-void
.end method

.method private u()V
    .locals 4

    .line 827
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showNoConnectedToast()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 828
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_device_not_connect:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 829
    return-void
.end method


# virtual methods
.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .line 500
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/ui/commonui/base/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 501
    const-string v0, "ContactMainActivity"

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

    .line 503
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 506
    :sswitch_0
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SYSTEM_CONTACT_ACTIVITY"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 507
    invoke-direct {p0, p2, p3}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->a(ILandroid/content/Intent;)V

    .line 508
    goto :goto_0

    .line 512
    :sswitch_1
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MORE_THAN_ONE_NUMBER_DIALOG"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 513
    invoke-direct {p0, p2, p3}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->c(ILandroid/content/Intent;)V

    .line 514
    .line 519
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 357
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 358
    return-void

    .line 361
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v5

    .line 362
    sget v0, Lcom/huawei/ui/device/R$id;->contact_main_bottom_add_layout:I

    if-ne v5, v0, :cond_1

    .line 363
    const-string v0, "03"

    const-string v1, "ContactMainActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "contact_main_bottom_add_layout"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 364
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->l()V

    goto/16 :goto_0

    .line 368
    :cond_1
    sget v0, Lcom/huawei/ui/device/R$id;->contact_main_bottom_orderby_layout:I

    if-ne v5, v0, :cond_2

    .line 369
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "contact_main_bottom_orderby_layout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 370
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->o()V

    goto/16 :goto_0

    .line 374
    :cond_2
    sget v0, Lcom/huawei/ui/device/R$id;->contact_main_bottom_delete_layout:I

    if-ne v5, v0, :cond_3

    .line 375
    const-string v0, "03"

    const-string v1, "ContactMainActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "contact_main_bottom_delete_layout"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 376
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->m()V

    .line 378
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 379
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    const-string v0, "status"

    const-string v1, "delete"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->iq:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v6, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 383
    goto :goto_0

    :cond_3
    sget v0, Lcom/huawei/ui/device/R$id;->no_contact_add_button:I

    if-ne v5, v0, :cond_4

    .line 384
    const-string v0, "03"

    const-string v1, "ContactMainActivity"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "no_contact_add_button"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 385
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->l()V

    .line 387
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 388
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    const-string v0, "status"

    const-string v1, "add"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lo/dae;->iq:Lo/dae;

    invoke-virtual {v2}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v6, v3}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 391
    goto :goto_0

    .line 392
    :cond_4
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "i = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 395
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 177
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 179
    sget v0, Lcom/huawei/ui/device/R$layout;->activity_device_settings_contact_main_activity_black:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->setContentView(I)V

    .line 181
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->b()V

    .line 184
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->d()V

    .line 188
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 843
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 844
    iget-object v0, p0, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->x(Landroid/content/Context;)V

    .line 845
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 4

    .line 466
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Activity-onRequestPermissionsResult() PermissionsManager.notifyPermissionsChange()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 467
    invoke-static {}, Lo/dbn;->c()Lo/dbn;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lo/dbn;->c([Ljava/lang/String;[I)V

    .line 468
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 833
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 834
    const-string v0, "ContactMainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===www==== onResume"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 837
    invoke-direct {p0}, Lcom/huawei/ui/device/activity/selectcontact/ContactMainActivity;->g()V

    .line 839
    return-void
.end method
