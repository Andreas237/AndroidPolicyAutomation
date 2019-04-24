.class public Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$b;,
        Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$c;,
        Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$d;
    }
.end annotation


# instance fields
.field private A:Ljava/util/Date;

.field private B:Ljava/lang/String;

.field private C:Landroid/widget/RelativeLayout;

.field private D:Z

.field private E:Landroid/widget/RelativeLayout;

.field private F:Landroid/widget/TextView;

.field private G:Lo/emr;

.field private H:Lcom/huawei/up/model/UserInfomation;

.field private I:Landroid/widget/TextView;

.field private J:I

.field private final K:I

.field private L:Landroid/widget/LinearLayout;

.field private M:I

.field private N:I

.field private O:I

.field private P:Z

.field private Q:Z

.field private R:I

.field private S:Ljava/lang/String;

.field private T:Lcom/huawei/hwid/core/datatype/UserInfo;

.field private U:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private V:Lcom/huawei/cloudservice/CloudAccount;

.field private W:Landroid/os/Handler;

.field private X:Ljava/lang/String;

.field private Z:Lo/egn;

.field public a:Landroid/content/Context;

.field private aa:Ljava/lang/String;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/ImageView;

.field private h:Landroid/widget/ImageView;

.field private i:Landroid/widget/ImageView;

.field private j:Landroid/widget/RelativeLayout;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/ImageView;

.field private m:Lo/egd;

.field private n:Landroid/widget/ImageView;

.field private o:Landroid/widget/RelativeLayout;

.field private p:Landroid/widget/ImageView;

.field private q:Landroid/widget/RelativeLayout;

.field private r:Lcom/huawei/hihealth/HiUserInfo;

.field private s:Landroid/widget/RelativeLayout;

.field private t:Landroid/widget/RelativeLayout;

.field private u:Landroid/widget/RelativeLayout;

.field private v:Ljava/lang/String;

.field private w:Landroid/widget/ImageView;

.field private x:Landroid/app/Dialog;

.field private y:Landroid/widget/ImageView;

.field private z:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 91
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 99
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->x:Landroid/app/Dialog;

    .line 104
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->D:Z

    .line 121
    const/16 v0, 0xd

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->K:I

    .line 128
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->P:Z

    .line 129
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->Q:Z

    .line 130
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->X:Ljava/lang/String;

    .line 133
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$d;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$d;-><init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->W:Landroid/os/Handler;

    return-void
.end method

.method static synthetic A(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Z
    .locals 1

    .line 91
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->C()Z

    move-result v0

    return v0
.end method

.method static synthetic C(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V
    .locals 0

    .line 91
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->y()V

    return-void
.end method

.method private C()Z
    .locals 7

    .line 1638
    const/4 v3, 0x0

    .line 1639
    const/4 v4, 0x1

    .line 1640
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0}, Lo/afd;->d()Ljava/util/ArrayList;

    move-result-object v5

    .line 1641
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_0

    .line 1642
    const/4 v3, 0x1

    .line 1644
    :cond_0
    invoke-static {}, Lo/ahd;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1645
    const/4 v3, 0x1

    .line 1647
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    const/16 v1, 0x272f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_userinfo_age_limit_agree"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1649
    const-string v0, "false"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1650
    const/4 v4, 0x0

    .line 1652
    :cond_2
    if-eqz v4, :cond_3

    if-eqz v3, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private D()Z
    .locals 5

    .line 1659
    const/4 v4, 0x1

    .line 1660
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1661
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiUserInfo;->getGender()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_4

    .line 1662
    const/4 v4, 0x0

    .line 1663
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->me_rank_dec:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_0

    .line 1666
    :cond_0
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->p()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1667
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->T:Lcom/huawei/hwid/core/datatype/UserInfo;

    invoke-virtual {v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->getGender()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->T:Lcom/huawei/hwid/core/datatype/UserInfo;

    invoke-virtual {v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->getGender()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    .line 1668
    const/4 v4, 0x0

    .line 1669
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->me_rank_dec:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1671
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->T:Lcom/huawei/hwid/core/datatype/UserInfo;

    invoke-virtual {v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->getBirthDate()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1672
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$color;->me_rank_dec:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1673
    const/4 v4, 0x0

    goto :goto_0

    .line 1676
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->H:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->H:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v0

    if-eqz v0, :cond_3

    .line 1677
    const/4 v4, 0x0

    .line 1679
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->H:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getBirthdayStatus()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UNSETED"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1680
    const/4 v4, 0x0

    .line 1684
    :cond_4
    :goto_0
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkUserDataDone  isCompleted = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1685
    return v4
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;I)I
    .locals 0

    .line 91
    iput p1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->R:I

    return p1
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/hihealth/HiUserInfo;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;Lcom/huawei/hwid/core/datatype/UserInfo;)Lcom/huawei/hwid/core/datatype/UserInfo;
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->T:Lcom/huawei/hwid/core/datatype/UserInfo;

    return-object p1
.end method

.method private b(I)I
    .locals 1

    .line 1238
    if-nez p1, :cond_0

    .line 1239
    const/4 p1, 0x1

    goto :goto_0

    .line 1240
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 1241
    const/4 p1, 0x0

    .line 1243
    :cond_1
    :goto_0
    return p1
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;I)I
    .locals 0

    .line 91
    iput p1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->N:I

    return p1
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Landroid/os/Handler;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->W:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 91
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private b(III)Z
    .locals 6

    .line 692
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 693
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v3

    .line 694
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v4, v0, 0x1

    .line 695
    const/4 v0, 0x5

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v5

    .line 697
    if-ge p1, v3, :cond_0

    .line 698
    const/4 v0, 0x0

    return v0

    .line 700
    :cond_0
    if-ne p1, v3, :cond_1

    if-ge p2, v4, :cond_1

    .line 701
    const/4 v0, 0x0

    return v0

    .line 703
    :cond_1
    if-ne p1, v3, :cond_2

    if-ne p2, v4, :cond_2

    if-gt p3, v5, :cond_2

    .line 704
    const/4 v0, 0x0

    return v0

    .line 706
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;III)Z
    .locals 1

    .line 91
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->d(III)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;Z)Z
    .locals 0

    .line 91
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->D:Z

    return p1
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;I)I
    .locals 0

    .line 91
    iput p1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->O:I

    return p1
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;Lcom/huawei/hihealth/HiUserInfo;)Lcom/huawei/hihealth/HiUserInfo;
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    return-object p1
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Ljava/lang/String;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->S:Ljava/lang/String;

    return-object v0
.end method

.method private c(I)V
    .locals 2

    .line 1271
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    const/4 v0, 0x1

    if-ne v0, p1, :cond_0

    .line 1272
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->v:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1273
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->D:Z

    goto :goto_0

    .line 1274
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 1275
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->z:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1276
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->D:Z

    goto :goto_0

    .line 1278
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->D:Z

    .line 1279
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->B:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1280
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->l:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1283
    :goto_0
    return-void
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1423
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 1424
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1425
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1426
    const-string v0, "type"

    invoke-interface {v3, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1428
    :cond_0
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1429
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;I)I
    .locals 0

    .line 91
    iput p1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->M:I

    return p1
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Ljava/util/Map;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->U:Ljava/util/Map;

    return-object v0
.end method

.method private d(I)V
    .locals 2

    .line 1253
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1254
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->B:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1255
    const/16 v0, 0x7c8

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->J:I

    .line 1256
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->M:I

    .line 1257
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->N:I

    goto :goto_0

    .line 1260
    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->h(I)Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->A:Ljava/util/Date;

    .line 1262
    :goto_0
    return-void
.end method

.method private d(III)Z
    .locals 6

    .line 674
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 675
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v3

    .line 676
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v4, v0, 0x1

    .line 677
    const/4 v0, 0x5

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v5

    .line 679
    if-le p1, v3, :cond_0

    .line 680
    const/4 v0, 0x1

    return v0

    .line 682
    :cond_0
    if-ne p1, v3, :cond_1

    if-le p2, v4, :cond_1

    .line 683
    const/4 v0, 0x1

    return v0

    .line 685
    :cond_1
    if-ne p1, v3, :cond_2

    if-ne p2, v4, :cond_2

    if-le p3, v5, :cond_2

    .line 686
    const/4 v0, 0x1

    return v0

    .line 688
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private d(Landroid/view/View;)Z
    .locals 4

    .line 1047
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initializeGenderDialogLayout()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1048
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1050
    const/4 v0, 0x0

    return v0

    .line 1053
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->settings_gender_imgview1:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->w:Landroid/widget/ImageView;

    .line 1054
    sget v0, Lcom/huawei/ui/main/R$id;->settings_gender_imgview2:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->y:Landroid/widget/ImageView;

    .line 1055
    sget v0, Lcom/huawei/ui/main/R$id;->settings_gender_view_layout1:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->j:Landroid/widget/RelativeLayout;

    .line 1056
    sget v0, Lcom/huawei/ui/main/R$id;->settings_gender_view_layout2:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->C:Landroid/widget/RelativeLayout;

    .line 1057
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->j:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$c;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$c;-><init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1058
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->C:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$b;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$b;-><init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1059
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->S:Ljava/lang/String;

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1060
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    if-eqz v0, :cond_3

    .line 1061
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiUserInfo;->getGender()I

    move-result v0

    if-nez v0, :cond_2

    .line 1062
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->y:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1063
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->w:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1064
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->D:Z

    goto/16 :goto_0

    .line 1066
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->w:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1067
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->y:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1068
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->D:Z

    goto/16 :goto_0

    .line 1071
    :cond_3
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->D:Z

    .line 1072
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->w:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1073
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->y:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto/16 :goto_0

    .line 1076
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->T:Lcom/huawei/hwid/core/datatype/UserInfo;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->V:Lcom/huawei/cloudservice/CloudAccount;

    if-eqz v0, :cond_6

    .line 1077
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->T:Lcom/huawei/hwid/core/datatype/UserInfo;

    invoke-virtual {v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->getGender()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 1078
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->y:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1079
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->w:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1080
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->D:Z

    goto/16 :goto_0

    .line 1082
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->w:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1083
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->y:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1084
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->D:Z

    goto :goto_0

    .line 1086
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->H:Lcom/huawei/up/model/UserInfomation;

    if-eqz v0, :cond_8

    .line 1087
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->H:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_7

    .line 1088
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->y:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1089
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->w:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1090
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->D:Z

    goto :goto_0

    .line 1092
    :cond_7
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->w:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1093
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->y:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1094
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->D:Z

    goto :goto_0

    .line 1097
    :cond_8
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->w:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1098
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->y:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1099
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->D:Z

    .line 1102
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;I)I
    .locals 0

    .line 91
    iput p1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->J:I

    return p1
.end method

.method private e()V
    .locals 7

    .line 173
    sget v0, Lcom/huawei/ui/main/R$id;->me_userInfo_titlebar:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->G:Lo/emr;

    .line 174
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_userinfo_gender_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->o:Landroid/widget/RelativeLayout;

    .line 175
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->o:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 176
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_userinfo_height_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->t:Landroid/widget/RelativeLayout;

    .line 177
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->t:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 178
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_userinfo_weight_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->s:Landroid/widget/RelativeLayout;

    .line 179
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->s:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 180
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_userinfo_birthday_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->u:Landroid/widget/RelativeLayout;

    .line 181
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->u:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 182
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_userinfo_interest_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->q:Landroid/widget/RelativeLayout;

    .line 183
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 184
    sget v0, Lcom/huawei/ui/main/R$id;->btn_left_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->E:Landroid/widget/RelativeLayout;

    .line 185
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->E:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 186
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_userinfo_gender:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->d:Landroid/widget/TextView;

    .line 187
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_userinfo_height:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->e:Landroid/widget/TextView;

    .line 188
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_userinfo_weight:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->c:Landroid/widget/TextView;

    .line 189
    sget v0, Lcom/huawei/ui/main/R$id;->hw_show_userinfo_birthday:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->b:Landroid/widget/TextView;

    .line 190
    sget v0, Lcom/huawei/ui/main/R$id;->user_info_fragment_set_gender_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->h:Landroid/widget/ImageView;

    .line 191
    sget v0, Lcom/huawei/ui/main/R$id;->user_info_fragment_set_height_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->i:Landroid/widget/ImageView;

    .line 192
    sget v0, Lcom/huawei/ui/main/R$id;->user_info_fragment_set_weight_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->g:Landroid/widget/ImageView;

    .line 193
    sget v0, Lcom/huawei/ui/main/R$id;->user_info_fragment_set_birthday_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->p:Landroid/widget/ImageView;

    .line 194
    sget v0, Lcom/huawei/ui/main/R$id;->user_info_fragment_set_interest_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->n:Landroid/widget/ImageView;

    .line 195
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_gender_not_set_prompt:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->l:Landroid/widget/ImageView;

    .line 196
    sget v0, Lcom/huawei/ui/main/R$id;->user_info_fragment_set_gender:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->F:Landroid/widget/TextView;

    .line 197
    sget v0, Lcom/huawei/ui/main/R$id;->divide_line_before_interest:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->k:Landroid/widget/TextView;

    .line 198
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->l:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 199
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->P:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->Q:Z

    if-eqz v0, :cond_1

    .line 200
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->q:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 202
    :cond_1
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->Q:Z

    if-eqz v0, :cond_2

    .line 203
    sget v0, Lcom/huawei/ui/main/R$id;->user_info_fragment_wifi_tip:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->f:Landroid/widget/TextView;

    .line 204
    sget v0, Lcom/huawei/ui/main/R$id;->user_info_fragment_wifi_device_complete_btn_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->L:Landroid/widget/LinearLayout;

    .line 205
    sget v0, Lcom/huawei/ui/main/R$id;->user_info_fragment_wifi_device_complete_btn:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->m:Lo/egd;

    .line 206
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->m:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 207
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->L:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 208
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->f:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 209
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->k:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 211
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 212
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->h:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 213
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->i:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 214
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->g:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 215
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->p:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 216
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->n:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 218
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->h:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->arrow_right_normal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 219
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->i:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->arrow_right_normal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 220
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->g:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->arrow_right_normal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 221
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->p:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->arrow_right_normal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 222
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->n:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$drawable;->arrow_right_normal:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 225
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->s(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 226
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->F:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x42700000    # 60.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setWidth(I)V

    .line 227
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->F:Landroid/widget/TextView;

    const v1, 0x800003

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 229
    :cond_4
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_default_gender_male:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->v:Ljava/lang/String;

    .line 230
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_default_gender_female:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->z:Ljava/lang/String;

    .line 231
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_me_userinfo_not_set:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->B:Ljava/lang/String;

    .line 232
    new-instance v0, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->A:Ljava/util/Date;

    .line 235
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "onboarding_skip_current_time"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 237
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "onboarding_skip"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 238
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "1"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 239
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dot dismiss"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    new-instance v6, Lo/dcy;

    invoke-direct {v6}, Lo/dcy;-><init>()V

    .line 241
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "rid_dot_dismiss"

    .line 242
    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    .line 241
    invoke-static {v0, v1, v2, v3, v6}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 244
    :cond_5
    return-void
.end method

.method private e(I)V
    .locals 10

    .line 809
    new-instance v5, Lo/egw$c;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-direct {v5, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 811
    const-string v7, ""

    .line 812
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 813
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_weight:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getString(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    .line 815
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_height:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 817
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->health_healthdata_userinfo_dialog_set_v9:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/RelativeLayout;

    .line 818
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_dialog_tips:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->I:Landroid/widget/TextView;

    .line 819
    sget v0, Lcom/huawei/ui/main/R$id;->userinfo_number_picker_v9:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/elk;

    .line 821
    const/4 v0, 0x1

    if-ne v0, p1, :cond_4

    .line 822
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->I:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_user_data_weight_tips:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 823
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->k()Ljava/util/ArrayList;

    move-result-object v9

    .line 824
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    check-cast v0, [Ljava/lang/String;

    invoke-virtual {v8, v0}, Lo/elk;->setDisplayedValues([Ljava/lang/String;)V

    .line 825
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lo/elk;->setMinValue(I)V

    .line 826
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v8, v0}, Lo/elk;->setMaxValue(I)V

    .line 828
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 829
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiUserInfo;->getWeight()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v0, v0

    const-wide/high16 v1, 0x4024000000000000L    # 10.0

    invoke-static {v1, v2}, Lo/cxh;->e(D)D

    move-result-wide v1

    double-to-int v1, v1

    if-lt v0, v1, :cond_1

    .line 830
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "LB mHiUserInfo.getHeight()="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiUserInfo;->getWeight()F

    move-result v2

    const/high16 v3, 0x41200000    # 10.0f

    sub-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 831
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiUserInfo;->getWeight()F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v0, v0

    const-wide/high16 v1, 0x4024000000000000L    # 10.0

    invoke-static {v1, v2}, Lo/cxh;->e(D)D

    move-result-wide v1

    double-to-int v1, v1

    sub-int/2addr v0, v1

    invoke-virtual {v8, v0}, Lo/elk;->setValue(I)V

    goto/16 :goto_1

    .line 833
    :cond_1
    const-wide v0, 0x4051800000000000L    # 70.0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    double-to-int v0, v0

    invoke-virtual {v8, v0}, Lo/elk;->setValue(I)V

    goto/16 :goto_1

    .line 836
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiUserInfo;->getWeight()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_3

    .line 837
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHiUserInfo.getHeight()="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiUserInfo;->getWeight()F

    move-result v2

    const/high16 v3, 0x41200000    # 10.0f

    sub-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 838
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiUserInfo;->getWeight()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    add-int/lit8 v0, v0, -0xa

    invoke-virtual {v8, v0}, Lo/elk;->setValue(I)V

    goto/16 :goto_1

    .line 840
    :cond_3
    const/16 v0, 0x46

    invoke-virtual {v8, v0}, Lo/elk;->setValue(I)V

    goto/16 :goto_1

    .line 844
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->I:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_user_data_height_tips:I

    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 845
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->o()Ljava/util/ArrayList;

    move-result-object v9

    .line 846
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    check-cast v0, [Ljava/lang/String;

    invoke-virtual {v8, v0}, Lo/elk;->setDisplayedValues([Ljava/lang/String;)V

    .line 847
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lo/elk;->setMinValue(I)V

    .line 848
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v8, v0}, Lo/elk;->setMaxValue(I)V

    .line 849
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v0

    const/16 v1, 0x32

    if-lt v0, v1, :cond_5

    .line 850
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHiUserInfo.getHeight()="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v2

    add-int/lit8 v2, v2, -0x32

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 851
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v0

    add-int/lit8 v0, v0, -0x32

    invoke-virtual {v8, v0}, Lo/elk;->setValue(I)V

    goto :goto_1

    .line 853
    :cond_5
    const/16 v0, 0x6e

    invoke-virtual {v8, v0}, Lo/elk;->setValue(I)V

    .line 857
    :goto_1
    invoke-virtual {v5, v7}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 858
    invoke-virtual {v0, v6}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_confirm:I

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$3;

    invoke-direct {v2, p0, p1, v8}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$3;-><init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;ILo/elk;)V

    .line 859
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_cancel:I

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$2;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$2;-><init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V

    .line 893
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 900
    invoke-virtual {v5}, Lo/egw$c;->e()Lo/egw;

    move-result-object v4

    .line 901
    invoke-virtual {v4}, Lo/egw;->show()V

    .line 903
    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V
    .locals 0

    .line 91
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->q()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;III)Z
    .locals 1

    .line 91
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->b(III)Z

    move-result v0

    return v0
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)I
    .locals 1

    .line 91
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->M:I

    return v0
.end method

.method private f()V
    .locals 4

    .line 247
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter initdata"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r()V

    .line 249
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$5;-><init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V

    invoke-interface {v0, v1}, Lo/clt;->a(Lo/clz;)V

    .line 286
    return-void
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)I
    .locals 1

    .line 91
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->J:I

    return v0
.end method

.method private g()V
    .locals 5

    .line 478
    new-instance v4, Lo/egv$b;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 479
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_common_dialog_title:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_about_privacy_connectting_error:I

    .line 480
    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_common_dialog_ok_button:I

    .line 481
    invoke-virtual {p0, v1}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$15;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$15;-><init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 487
    invoke-virtual {v4}, Lo/egv$b;->b()Lo/egv;

    move-result-object v3

    .line 488
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/egv;->setCanceledOnTouchOutside(Z)V

    .line 489
    invoke-virtual {v3}, Lo/egv;->show()V

    .line 490
    return-void
.end method

.method static synthetic h(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Ljava/lang/String;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->aa:Ljava/lang/String;

    return-object v0
.end method

.method private h(I)Ljava/util/Date;
    .locals 11

    .line 1384
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseInt2BirthdayDate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1385
    new-instance v4, Ljava/util/Date;

    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    .line 1386
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    .line 1387
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseInt2BirthdayDate birthday:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1388
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 1389
    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-virtual {v5, v0, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->J:I

    .line 1390
    const/4 v0, 0x4

    const/4 v1, 0x6

    invoke-virtual {v5, v0, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->M:I

    .line 1391
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x6

    invoke-virtual {v5, v1, v0}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->N:I

    .line 1392
    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-virtual {v5, v0, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuffer;

    .line 1393
    const-string v0, "/"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/4 v1, 0x4

    const/4 v2, 0x6

    invoke-virtual {v5, v1, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    .line 1394
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x6

    invoke-virtual {v5, v2, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v1

    .line 1393
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuffer;

    .line 1395
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v7

    .line 1396
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->J:I

    iget v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->M:I

    add-int/lit8 v1, v1, -0x1

    iget v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->N:I

    invoke-virtual {v7, v0, v1, v2}, Ljava/util/Calendar;->set(III)V

    .line 1397
    new-instance v8, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "yMd"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v8, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 1398
    invoke-virtual {v7}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v9

    .line 1399
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1404
    :try_start_0
    new-instance v10, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const-string v1, "yMd"

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v10, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 1405
    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 1410
    goto :goto_0

    .line 1407
    :catch_0
    move-exception v10

    .line 1409
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseInt2BirthdayDate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1411
    :goto_0
    return-object v4
.end method

.method private h()V
    .locals 7

    .line 573
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showGenderPickerDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 574
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/LayoutInflater;

    .line 575
    sget v0, Lcom/huawei/ui/main/R$layout;->hw_show_settings_gender_view:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 576
    new-instance v6, Lo/egw$c;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-direct {v6, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 577
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_gender:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 578
    invoke-virtual {v0, v5}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_cancel:I

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$24;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$24;-><init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V

    .line 579
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 583
    invoke-virtual {v6}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->x:Landroid/app/Dialog;

    .line 584
    invoke-direct {p0, v5}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->d(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 586
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showGenderPickerDialog() dialog layout fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 587
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->x:Landroid/app/Dialog;

    .line 588
    return-void

    .line 590
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->x:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 592
    return-void
.end method

.method private i()V
    .locals 8

    .line 596
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/LayoutInflater;

    .line 597
    sget v0, Lcom/huawei/ui/main/R$layout;->userinfo_date_select:I

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 598
    sget v0, Lcom/huawei/ui/main/R$id;->hw_health_datepicker:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/fgi;

    .line 600
    new-instance v7, Lo/egw$c;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-direct {v7, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 601
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_birthday:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 602
    invoke-virtual {v0, v4}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_confirm:I

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;

    invoke-direct {v2, p0, v5}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$23;-><init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;Lo/fgi;)V

    .line 603
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_cancel:I

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$22;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$22;-><init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V

    .line 659
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 665
    invoke-virtual {v7}, Lo/egw$c;->e()Lo/egw;

    move-result-object v6

    .line 666
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->J:I

    invoke-virtual {v5, v0}, Lo/fgi;->setSelectedYear(I)V

    .line 667
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->M:I

    invoke-virtual {v5, v0}, Lo/fgi;->setSelectedMonth(I)V

    .line 668
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->N:I

    invoke-virtual {v5, v0}, Lo/fgi;->setSelectedDay(I)V

    .line 669
    invoke-virtual {v6}, Lo/egw;->show()V

    .line 671
    return-void
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V
    .locals 0

    .line 91
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->g()V

    return-void
.end method

.method static synthetic j(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Ljava/lang/String;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->z:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic k(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)I
    .locals 1

    .line 91
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->N:I

    return v0
.end method

.method private k()Ljava/util/ArrayList;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 711
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 713
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 714
    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    double-to-int v5, v0

    .line 715
    const-wide v0, 0x406f400000000000L    # 250.0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    double-to-int v6, v0

    .line 716
    move v7, v5

    :goto_0
    add-int/lit8 v0, v6, 0x1

    if-gt v7, v0, :cond_0

    .line 717
    int-to-double v0, v7

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v8

    .line 718
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_weightvalue_with_unit_lb:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v8, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 716
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 720
    :cond_0
    goto :goto_2

    .line 721
    :cond_1
    const/16 v5, 0xa

    :goto_1
    const/16 v0, 0xfb

    if-ge v5, v0, :cond_2

    .line 722
    int-to-double v0, v5

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    .line 723
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_weightvalue_with_unit_kg:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 721
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 726
    :cond_2
    :goto_2
    return-object v4
.end method

.method static synthetic l(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)I
    .locals 1

    .line 91
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->R:I

    return v0
.end method

.method private l()V
    .locals 15

    .line 743
    new-instance v6, Lo/egw$c;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-direct {v6, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 744
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_height:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 745
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$layout;->health_healthdata_userinfo_dialog_inch_height_v9:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/RelativeLayout;

    .line 746
    sget v0, Lcom/huawei/ui/main/R$id;->height_ft_number_picker_v9:I

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/elk;

    .line 747
    const/16 v0, 0x8

    new-array v10, v0, [Ljava/lang/String;

    .line 748
    const/4 v11, 0x0

    :goto_0
    array-length v0, v10

    const/16 v0, 0x8

    if-ge v11, v0, :cond_0

    .line 749
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    add-int/lit8 v1, v11, 0x1

    int-to-double v1, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_ft:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v10, v11

    .line 748
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 751
    :cond_0
    invoke-virtual {v9, v10}, Lo/elk;->setDisplayedValues([Ljava/lang/String;)V

    .line 752
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lo/elk;->setMinValue(I)V

    .line 753
    array-length v0, v10

    const/4 v0, 0x7

    invoke-virtual {v9, v0}, Lo/elk;->setMaxValue(I)V

    .line 754
    sget v0, Lcom/huawei/ui/main/R$id;->height_inch_number_picker_v9:I

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/elk;

    .line 755
    const/16 v0, 0xc

    new-array v12, v0, [Ljava/lang/String;

    .line 756
    const/4 v13, 0x0

    :goto_1
    array-length v0, v12

    const/16 v0, 0xc

    if-ge v13, v0, :cond_1

    .line 757
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-double v1, v13

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_ins:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v12, v13

    .line 756
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    .line 759
    :cond_1
    invoke-virtual {v11, v12}, Lo/elk;->setDisplayedValues([Ljava/lang/String;)V

    .line 760
    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lo/elk;->setMinValue(I)V

    .line 761
    array-length v0, v12

    const/16 v0, 0xb

    invoke-virtual {v11, v0}, Lo/elk;->setMaxValue(I)V

    .line 764
    const/4 v13, 0x2

    new-array v13, v13, [I

    fill-array-data v13, :array_0

    .line 765
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v0

    const/16 v1, 0x1e

    if-le v0, v1, :cond_2

    .line 766
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Lo/cxh;->d(D)[I

    move-result-object v14

    .line 767
    const/4 v0, 0x0

    aget v0, v14, v0

    if-lez v0, :cond_2

    const/4 v0, 0x1

    aget v0, v14, v0

    if-ltz v0, :cond_2

    .line 768
    move-object v13, v14

    .line 771
    :cond_2
    const/4 v0, 0x0

    aget v0, v13, v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v9, v0}, Lo/elk;->setValue(I)V

    .line 772
    const/4 v0, 0x1

    aget v0, v13, v0

    invoke-virtual {v11, v0}, Lo/elk;->setValue(I)V

    .line 775
    invoke-virtual {v6, v7}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 776
    invoke-virtual {v0, v8}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_confirm:I

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$4;

    invoke-direct {v2, p0, v9, v11}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$4;-><init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;Lo/elk;Lo/elk;)V

    .line 777
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->b(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_cancel:I

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$1;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$1;-><init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V

    .line 795
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(ILandroid/view/View$OnClickListener;)Lo/egw$c;

    .line 801
    invoke-virtual {v6}, Lo/egw$c;->e()Lo/egw;

    move-result-object v5

    .line 802
    invoke-virtual {v5}, Lo/egw;->show()V

    .line 803
    return-void

    :array_0
    .array-data 4
        0x5
        0x7
    .end array-data
.end method

.method static synthetic m(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Landroid/widget/TextView;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->b:Landroid/widget/TextView;

    return-object v0
.end method

.method private m()V
    .locals 3

    .line 1009
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hihealth/HiUserInfo;->setCreateTime(J)V

    .line 1010
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$9;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$9;-><init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V

    invoke-interface {v0, v1, v2}, Lo/clt;->b(Lcom/huawei/hihealth/HiUserInfo;Lo/clz;)V

    .line 1029
    return-void
.end method

.method static synthetic n(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)I
    .locals 1

    .line 91
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->O:I

    return v0
.end method

.method private n()Z
    .locals 2

    .line 1226
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->S:Ljava/lang/String;

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1227
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 1229
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic o(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Landroid/widget/TextView;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->c:Landroid/widget/TextView;

    return-object v0
.end method

.method private o()Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation

    .line 730
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 731
    const/16 v5, 0x32

    :goto_0
    const/16 v0, 0xfb

    if-ge v5, v0, :cond_0

    .line 732
    int-to-double v0, v5

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v6

    .line 733
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_height_value_with_unit_cm:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 731
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 735
    :cond_0
    return-object v4
.end method

.method static synthetic p(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Landroid/widget/TextView;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->e:Landroid/widget/TextView;

    return-object v0
.end method

.method private p()Z
    .locals 1

    .line 1232
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->T:Lcom/huawei/hwid/core/datatype/UserInfo;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->V:Lcom/huawei/cloudservice/CloudAccount;

    if-eqz v0, :cond_0

    .line 1233
    const/4 v0, 0x1

    return v0

    .line 1235
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic q(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/up/model/UserInfomation;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->H:Lcom/huawei/up/model/UserInfomation;

    return-object v0
.end method

.method private q()V
    .locals 13

    .line 1298
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshView()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1299
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    invoke-virtual {v0}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->H:Lcom/huawei/up/model/UserInfomation;

    .line 1300
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->H:Lcom/huawei/up/model/UserInfomation;

    if-nez v0, :cond_0

    .line 1301
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mUserInfomation is null,new UserInfomation object"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1302
    new-instance v0, Lcom/huawei/up/model/UserInfomation;

    invoke-direct {v0}, Lcom/huawei/up/model/UserInfomation;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->H:Lcom/huawei/up/model/UserInfomation;

    .line 1304
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->H:Lcom/huawei/up/model/UserInfomation;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiUserInfo;->getWeight()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/up/model/UserInfomation;->setWeight(Ljava/lang/Float;)V

    .line 1305
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->H:Lcom/huawei/up/model/UserInfomation;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/up/model/UserInfomation;->setHeight(Ljava/lang/Integer;)V

    .line 1306
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->S:Ljava/lang/String;

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->T:Lcom/huawei/hwid/core/datatype/UserInfo;

    if-eqz v0, :cond_1

    .line 1307
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->H:Lcom/huawei/up/model/UserInfomation;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->T:Lcom/huawei/hwid/core/datatype/UserInfo;

    invoke-virtual {v1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getBirthDate()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/up/model/UserInfomation;->setBirthday(Ljava/lang/String;)V

    .line 1308
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->t()V

    .line 1309
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->u()V

    .line 1312
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->d:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1313
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->e:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1314
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->c:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1315
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->b:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1318
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "height="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " weight="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiUserInfo;->getWeight()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1319
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unitFlag="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v2}, Lcom/huawei/hihealth/HiUserInfo;->getUnitType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1321
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->n()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1322
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiUserInfo;->getGender()I

    move-result v9

    .line 1323
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiUserInfo;->getBirthday()I

    move-result v10

    goto/16 :goto_0

    .line 1325
    :cond_2
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mhw = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->T:Lcom/huawei/hwid/core/datatype/UserInfo;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1326
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->p()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1327
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mhw != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1328
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->T:Lcom/huawei/hwid/core/datatype/UserInfo;

    invoke-virtual {v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->getGender()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    .line 1329
    invoke-direct {p0, v9}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->b(I)I

    move-result v9

    .line 1330
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->s()I

    move-result v10

    .line 1331
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHwUserInfo gender="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->T:Lcom/huawei/hwid/core/datatype/UserInfo;

    invoke-virtual {v2}, Lcom/huawei/hwid/core/datatype/UserInfo;->getGender()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " birthday="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->T:Lcom/huawei/hwid/core/datatype/UserInfo;

    invoke-virtual {v2}, Lcom/huawei/hwid/core/datatype/UserInfo;->getBirthDate()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1333
    :cond_3
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mhw = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1334
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->H:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v9

    .line 1335
    invoke-direct {p0, v9}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->b(I)I

    move-result v9

    .line 1336
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->H:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v0}, Lcom/huawei/up/model/UserInfomation;->getBirthday()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v10

    .line 1337
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mUserInfomation gender="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->H:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v2}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " birthday="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->H:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v2}, Lcom/huawei/up/model/UserInfomation;->getBirthday()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1340
    :goto_0
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userinfo1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1341
    invoke-direct {p0, v9}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->c(I)V

    .line 1344
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1345
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter UNIT_IMPERIAL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1346
    .line 1347
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_weightvalue_with_unit_lb:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    .line 1348
    invoke-virtual {v3}, Lcom/huawei/hihealth/HiUserInfo;->getWeight()F

    move-result v3

    invoke-static {v3}, Lo/dbt;->e(F)I

    move-result v3

    int-to-double v3, v3

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 1347
    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 1349
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1350
    const/4 v12, 0x2

    new-array v12, v12, [I

    fill-array-data v12, :array_0

    .line 1351
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v0

    const/16 v1, 0x1e

    if-le v0, v1, :cond_4

    .line 1352
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Lo/cxh;->d(D)[I

    move-result-object v12

    .line 1354
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->e:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_ft_string:I

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aget v5, v12, v5

    int-to-double v5, v5

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-static {v5, v6, v7, v8}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v2, v3, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 1355
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_ins_string:I

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x1

    aget v5, v12, v5

    int-to-double v5, v5

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-static {v5, v6, v7, v8}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v2, v3, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1354
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1356
    goto :goto_1

    .line 1357
    :cond_5
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter UNIT_CM_KG"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1358
    .line 1359
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_weightvalue_with_unit_kg:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    .line 1360
    invoke-virtual {v3}, Lcom/huawei/hihealth/HiUserInfo;->getWeight()F

    move-result v3

    float-to-double v3, v3

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 1359
    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 1361
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1363
    .line 1364
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_height_value_with_unit_cm:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    .line 1365
    invoke-virtual {v3}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v3

    int-to-double v3, v3

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 1364
    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    .line 1366
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1369
    :goto_1
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->n()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->p()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1370
    :cond_6
    invoke-direct {p0, v10}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->d(I)V

    goto :goto_2

    .line 1372
    :cond_7
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->b:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1373
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->d:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1375
    :goto_2
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a()V

    .line 1376
    return-void

    nop

    :array_0
    .array-data 4
        0x5
        0x7
    .end array-data
.end method

.method private r()V
    .locals 4

    .line 1435
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->Z:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1436
    new-instance v0, Lo/egn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$style;->app_update_dialogActivity:I

    invoke-direct {v0, v1, v2}, Lo/egn;-><init>(Landroid/content/Context;I)V

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->Z:Lo/egn;

    .line 1438
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->Z:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1439
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->Z:Lo/egn;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_sns_waiting:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 1440
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->Z:Lo/egn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egn;->setCancelable(Z)V

    .line 1441
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->Z:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 1442
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->Z:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->show()V

    .line 1443
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showLoadingDialog...mLoadingDialog.show()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1445
    :cond_1
    return-void
.end method

.method static synthetic r(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V
    .locals 0

    .line 91
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r()V

    return-void
.end method

.method private s()I
    .locals 3

    .line 1286
    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->T:Lcom/huawei/hwid/core/datatype/UserInfo;

    invoke-virtual {v1}, Lcom/huawei/hwid/core/datatype/UserInfo;->getBirthDate()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1287
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->T:Lcom/huawei/hwid/core/datatype/UserInfo;

    invoke-virtual {v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->getBirthDate()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    goto :goto_0

    .line 1289
    :cond_0
    const/4 v2, 0x0

    .line 1291
    :goto_0
    return v2
.end method

.method static synthetic s(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Lcom/huawei/hwid/core/datatype/UserInfo;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->T:Lcom/huawei/hwid/core/datatype/UserInfo;

    return-object v0
.end method

.method static synthetic t(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->w:Landroid/widget/ImageView;

    return-object v0
.end method

.method private t()V
    .locals 2

    .line 1264
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->T:Lcom/huawei/hwid/core/datatype/UserInfo;

    invoke-virtual {v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->getBirthDate()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1265
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->H:Lcom/huawei/up/model/UserInfomation;

    const-string v1, "UNSETED_USER_SEE"

    invoke-virtual {v0, v1}, Lcom/huawei/up/model/UserInfomation;->setBirthdayStatus(Ljava/lang/String;)V

    goto :goto_0

    .line 1267
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->H:Lcom/huawei/up/model/UserInfomation;

    const-string v1, "SETED"

    invoke-virtual {v0, v1}, Lcom/huawei/up/model/UserInfomation;->setBirthdayStatus(Ljava/lang/String;)V

    .line 1269
    :goto_0
    return-void
.end method

.method private u()V
    .locals 3

    .line 1246
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->T:Lcom/huawei/hwid/core/datatype/UserInfo;

    invoke-virtual {v0}, Lcom/huawei/hwid/core/datatype/UserInfo;->getGender()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 1247
    if-eqz v2, :cond_0

    const/4 v0, 0x1

    if-eq v2, v0, :cond_0

    .line 1248
    const/4 v2, -0x1

    .line 1250
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->H:Lcom/huawei/up/model/UserInfomation;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/up/model/UserInfomation;->setGender(Ljava/lang/Integer;)V

    .line 1251
    return-void
.end method

.method static synthetic u(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V
    .locals 0

    .line 91
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->m()V

    return-void
.end method

.method static synthetic v(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Landroid/widget/TextView;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->d:Landroid/widget/TextView;

    return-object v0
.end method

.method private v()V
    .locals 5

    .line 1463
    new-instance v4, Lo/egv$b;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 1464
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_other_onboarding_about_gender_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hwh_home_gender_change_remind_content:I

    .line 1465
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_common_notification_know_tips:I

    .line 1466
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$7;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$7;-><init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 1473
    invoke-virtual {v4}, Lo/egv$b;->b()Lo/egv;

    move-result-object v3

    .line 1474
    invoke-virtual {v3}, Lo/egv;->show()V

    .line 1475
    return-void
.end method

.method static synthetic w(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Ljava/lang/String;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->v:Ljava/lang/String;

    return-object v0
.end method

.method private w()V
    .locals 8

    .line 1481
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showModifyConfirmDialog() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1482
    sget v0, Lcom/huawei/ui/main/R$layout;->dialog_confirm_user_info:I

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 1483
    sget v0, Lcom/huawei/ui/main/R$id;->confirm_userinfo_dialog_box:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/CheckBox;

    .line 1484
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$13;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$13;-><init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V

    invoke-virtual {v5, v0}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1500
    new-instance v6, Lo/egw$c;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-direct {v6, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 1501
    invoke-virtual {v6, v4}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_cancel:I

    .line 1503
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$14;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$14;-><init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V

    .line 1502
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_common_ui_dialog_confirm:I

    .line 1516
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$11;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$11;-><init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V

    .line 1515
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    .line 1529
    invoke-virtual {v6}, Lo/egw$c;->e()Lo/egw;

    move-result-object v7

    .line 1530
    invoke-virtual {v7}, Lo/egw;->show()V

    .line 1531
    return-void
.end method

.method static synthetic x(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->y:Landroid/widget/ImageView;

    return-object v0
.end method

.method private x()Z
    .locals 2

    .line 1563
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->U:Ljava/util/Map;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->U:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1564
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 1566
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->U:Ljava/util/Map;

    const-string v1, "gender"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiUserInfo;->getGender()I

    move-result v1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->U:Ljava/util/Map;

    const-string v1, "birthday"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiUserInfo;->getBirthday()I

    move-result v1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->U:Ljava/util/Map;

    const-string v1, "height"

    .line 1567
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v1

    if-eq v0, v1, :cond_3

    .line 1568
    :cond_2
    const/4 v0, 0x1

    return v0

    .line 1570
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic y(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->l:Landroid/widget/ImageView;

    return-object v0
.end method

.method private y()V
    .locals 12

    .line 1581
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showWeightAgeLimitDialog() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1582
    sget v0, Lcom/huawei/ui/main/R$layout;->dialog_wifiweight_age_limit:I

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 1583
    new-instance v6, Lo/egw$c;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-direct {v6, v0}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    .line 1584
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

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

    .line 1585
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->Q:Z

    if-eqz v0, :cond_0

    .line 1586
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_device_wifi_wifiweight_age_mainuser_tips:I

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

    .line 1588
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

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

    .line 1589
    sget v0, Lcom/huawei/ui/main/R$id;->wifiweight_age_one_text:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/TextView;

    .line 1590
    sget v0, Lcom/huawei/ui/main/R$id;->wifiweight_age_two_text:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/TextView;

    .line 1591
    invoke-virtual {v9, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1592
    invoke-virtual {v10, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1593
    invoke-virtual {v6, v5}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_device_ui_dialog_no:I

    .line 1595
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$18;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$18;-><init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V

    .line 1594
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_device_ui_dialog_yes:I

    .line 1612
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$12;

    invoke-direct {v2, p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$12;-><init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V

    .line 1611
    invoke-virtual {v0, v1, v2}, Lo/egw$c;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    .line 1629
    invoke-virtual {v6}, Lo/egw$c;->e()Lo/egw;

    move-result-object v11

    .line 1630
    invoke-virtual {v11}, Lo/egw;->show()V

    .line 1631
    return-void
.end method

.method static synthetic z(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Landroid/app/Dialog;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->x:Landroid/app/Dialog;

    return-object v0
.end method

.method private z()Z
    .locals 7

    .line 1538
    const/4 v3, 0x0

    .line 1539
    const/4 v4, 0x1

    .line 1540
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0}, Lo/afd;->d()Ljava/util/ArrayList;

    move-result-object v5

    .line 1541
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_0

    .line 1542
    const/4 v3, 0x1

    .line 1545
    :cond_0
    invoke-static {}, Lo/ahd;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1546
    const/4 v3, 0x1

    .line 1549
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    const/16 v1, 0x272f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_userinfo_modify_agree"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1551
    const-string v0, "false"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1552
    const/4 v4, 0x0

    .line 1555
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


# virtual methods
.method public a()V
    .locals 4

    .line 1451
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->Z:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1452
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->Z:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->cancel()V

    .line 1453
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->Z:Lo/egn;

    .line 1454
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "destroy mLoadingDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1456
    :cond_0
    return-void
.end method

.method public a(I)V
    .locals 3

    .line 996
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$8;

    invoke-direct {v1, p0, p1}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$8;-><init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;I)V

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/fjb;->d(ILandroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1005
    return-void
.end method

.method public a(II)V
    .locals 2

    .line 908
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;

    invoke-direct {v1, p0, p2, p1}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$6;-><init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;II)V

    invoke-static {p2, v0, v1}, Lo/fjb;->d(ILandroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 992
    return-void
.end method

.method public b()V
    .locals 4

    .line 471
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a()V

    .line 472
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserInfoError()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 473
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->g()V

    .line 474
    return-void
.end method

.method public b(F)V
    .locals 3

    .line 1033
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$10;

    invoke-direct {v1, p0, p1}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$10;-><init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;F)V

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/fjb;->d(ILandroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1043
    return-void
.end method

.method public c()V
    .locals 4

    .line 531
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->S:Ljava/lang/String;

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 532
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserInfomation isthirdlogin.equals(1)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 533
    return-void

    .line 535
    :cond_0
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mUserInfomation="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->H:Lcom/huawei/up/model/UserInfomation;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 536
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->H:Lcom/huawei/up/model/UserInfomation;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/dnm;->c(Landroid/content/Context;Lcom/huawei/up/model/UserInfomation;Lo/cyx;)V

    .line 537
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter setUserInfomation"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 541
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 542
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->H:Lcom/huawei/up/model/UserInfomation;

    new-instance v3, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$17;

    invoke-direct {v3, p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$17;-><init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V

    invoke-virtual {v0, v1, v2, v3}, Lo/dnm;->c(Landroid/content/Context;Lcom/huawei/up/model/UserInfomation;Lo/cyx;)V

    goto :goto_0

    .line 554
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->H:Lcom/huawei/up/model/UserInfomation;

    new-instance v3, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$19;

    invoke-direct {v3, p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$19;-><init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V

    invoke-virtual {v0, v1, v2, v3}, Lo/dnm;->c(Landroid/content/Context;Lcom/huawei/up/model/UserInfomation;Lo/cyx;)V

    .line 569
    :goto_0
    return-void
.end method

.method public d()V
    .locals 4

    .line 493
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$20;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$20;-><init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V

    invoke-virtual {v0, v1}, Lo/dnm;->d(Lcom/huawei/up/callback/CommonCallback;)V

    .line 502
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUserInfo() account = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->V:Lcom/huawei/cloudservice/CloudAccount;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 503
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->S:Ljava/lang/String;

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 504
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->W:Landroid/os/Handler;

    const/16 v1, 0x67

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 506
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->V:Lcom/huawei/cloudservice/CloudAccount;

    if-eqz v0, :cond_2

    .line 507
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->V:Lcom/huawei/cloudservice/CloudAccount;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    const-string v2, "1000"

    new-instance v3, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$16;

    invoke-direct {v3, p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$16;-><init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/cloudservice/CloudAccount;->getUserInfo(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    goto :goto_0

    .line 525
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->W:Landroid/os/Handler;

    const/16 v1, 0x67

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 528
    :goto_0
    return-void
.end method

.method public onBackPressed()V
    .locals 3

    .line 1691
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onBackPressed()V

    .line 1692
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1693
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->w()V

    goto :goto_0

    .line 1695
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->J:I

    add-int/lit8 v0, v0, 0x42

    iget v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->M:I

    iget v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->N:I

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->b(III)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->C()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1696
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->y()V

    goto :goto_0

    .line 1698
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->finish()V

    .line 1701
    :goto_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 18

    .line 300
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->o:Landroid/widget/RelativeLayout;

    move-object/from16 v1, p1

    if-ne v1, v0, :cond_0

    .line 301
    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->h()V

    .line 304
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->t:Landroid/widget/RelativeLayout;

    move-object/from16 v1, p1

    if-ne v1, v0, :cond_2

    .line 305
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 306
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showInchDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 307
    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->l()V

    goto :goto_0

    .line 309
    :cond_1
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showValueSetDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 310
    move-object/from16 v0, p0

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->e(I)V

    .line 314
    :cond_2
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->s:Landroid/widget/RelativeLayout;

    move-object/from16 v1, p1

    if-ne v1, v0, :cond_3

    .line 316
    move-object/from16 v0, p0

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->e(I)V

    .line 318
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->u:Landroid/widget/RelativeLayout;

    move-object/from16 v1, p1

    if-ne v1, v0, :cond_4

    .line 320
    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->i()V

    .line 322
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->q:Landroid/widget/RelativeLayout;

    move-object/from16 v1, p1

    if-ne v1, v0, :cond_5

    .line 323
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 324
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    const-class v1, Lcom/huawei/ui/main/stories/me/activity/interest/InterestAndConcernActivity;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 325
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 327
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->l:Landroid/widget/ImageView;

    move-object/from16 v1, p1

    if-ne v1, v0, :cond_6

    .line 328
    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->v()V

    .line 330
    :cond_6
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->Q:Z

    if-eqz v0, :cond_15

    .line 331
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->m:Lo/egd;

    move-object/from16 v1, p1

    if-ne v1, v0, :cond_15

    .line 334
    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->D()Z

    move-result v0

    if-nez v0, :cond_7

    .line 335
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_complete_privacy_wifi_tip:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/emv;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 336
    return-void

    .line 340
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->X:Ljava/lang/String;

    invoke-static {v0}, Lo/ahd;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_8

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->X:Ljava/lang/String;

    invoke-static {v0}, Lo/ahd;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 341
    :cond_8
    const-string v4, ""

    goto :goto_1

    .line 343
    :cond_9
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->X:Ljava/lang/String;

    invoke-static {v0}, Lo/ajq;->b(Ljava/lang/String;)Lo/aja;

    move-result-object v5

    .line 344
    if-nez v5, :cond_a

    .line 346
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wiFiDevice is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 347
    return-void

    .line 349
    :cond_a
    invoke-virtual {v5}, Lo/aja;->g()Ljava/lang/String;

    move-result-object v4

    .line 353
    :goto_1
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 354
    const-string v0, "id"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    const-string v0, "uid"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 356
    const-string v0, "gender"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiUserInfo;->getGender()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 357
    const-string v0, "age"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiUserInfo;->getAge()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    const-string v0, "height"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v1}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 359
    const-string v0, "isDelete"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 360
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lo/ahu;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 361
    if-eqz v6, :cond_b

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_b

    .line 362
    invoke-static {v6}, Lo/ahu;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 363
    invoke-static {v6}, Lo/ahu;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 364
    const-string v0, "currentWeight"

    invoke-interface {v5, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 365
    const-string v0, "bodyRes"

    invoke-interface {v5, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 367
    :cond_b
    const-string v0, "userInfo1"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-static {v5, v4, v0, v1}, Lo/ahu;->e(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    .line 369
    const/4 v7, 0x0

    .line 370
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_11

    .line 371
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->e()Ljava/util/List;

    move-result-object v8

    .line 373
    const/4 v9, 0x1

    :goto_2
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_10

    .line 374
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 375
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/acu;

    .line 376
    const/16 v12, 0x7c8

    .line 377
    const/4 v13, 0x1

    .line 378
    const/4 v14, 0x1

    .line 379
    invoke-virtual {v11}, Lo/acu;->g()I

    move-result v0

    const v1, 0x98967f

    if-le v0, v1, :cond_c

    .line 380
    invoke-virtual {v11}, Lo/acu;->g()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v15

    .line 381
    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-virtual {v15, v0, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v12

    .line 382
    const/4 v0, 0x4

    const/4 v1, 0x6

    invoke-virtual {v15, v0, v1}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v13

    .line 383
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x6

    invoke-virtual {v15, v1, v0}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v14

    .line 386
    :cond_c
    add-int/lit8 v0, v12, 0x12

    move-object/from16 v1, p0

    invoke-direct {v1, v0, v13, v14}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->b(III)Z

    move-result v0

    if-nez v0, :cond_d

    add-int/lit8 v0, v12, 0x42

    move-object/from16 v1, p0

    invoke-direct {v1, v0, v13, v14}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->b(III)Z

    move-result v0

    if-nez v0, :cond_e

    .line 387
    :cond_d
    const/4 v7, 0x1

    .line 389
    :cond_e
    const-string v0, "id"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v10, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    const-string v0, "uid"

    invoke-virtual {v11}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v10, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 391
    const-string v0, "gender"

    invoke-virtual {v11}, Lo/acu;->c()B

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v10, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 392
    const-string v0, "age"

    invoke-virtual {v11}, Lo/acu;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v10, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    const-string v0, "height"

    invoke-virtual {v11}, Lo/acu;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v10, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 394
    const-string v0, "isDelete"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v10, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 395
    invoke-virtual {v11}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lo/ahu;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 396
    if-eqz v15, :cond_f

    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_f

    .line 397
    invoke-static {v15}, Lo/ahu;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 398
    invoke-static {v15}, Lo/ahu;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    .line 399
    const-string v0, "currentWeight"

    move-object/from16 v1, v16

    invoke-interface {v10, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 400
    const-string v0, "bodyRes"

    move-object/from16 v1, v17

    invoke-interface {v10, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 402
    :cond_f
    invoke-virtual {v11}, Lo/acu;->m()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-static {v10, v4, v0, v1}, Lo/ahu;->e(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    .line 373
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_2

    .line 404
    :cond_10
    goto :goto_3

    .line 405
    :cond_11
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Oversea is no child user"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 406
    const/4 v7, 0x1

    .line 410
    :goto_3
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->J:I

    add-int/lit8 v0, v0, 0x42

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->M:I

    move-object/from16 v2, p0

    iget v2, v2, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->N:I

    move-object/from16 v3, p0

    invoke-direct {v3, v0, v1, v2}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->b(III)Z

    move-result v0

    if-eqz v0, :cond_12

    if-eqz v7, :cond_14

    .line 411
    :cond_12
    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->C()Z

    move-result v0

    if-eqz v0, :cond_13

    .line 412
    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->y()V

    goto :goto_4

    .line 414
    :cond_13
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->finish()V

    goto :goto_4

    .line 417
    :cond_14
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->finish()V

    .line 422
    :cond_15
    :goto_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->E:Landroid/widget/RelativeLayout;

    move-object/from16 v1, p1

    if-ne v1, v0, :cond_18

    .line 423
    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->z()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->x()Z

    move-result v0

    if-eqz v0, :cond_16

    .line 424
    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->w()V

    goto :goto_5

    .line 426
    :cond_16
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->J:I

    add-int/lit8 v0, v0, 0x42

    move-object/from16 v1, p0

    iget v1, v1, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->M:I

    move-object/from16 v2, p0

    iget v2, v2, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->N:I

    move-object/from16 v3, p0

    invoke-direct {v3, v0, v1, v2}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->b(III)Z

    move-result v0

    if-nez v0, :cond_17

    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->C()Z

    move-result v0

    if-eqz v0, :cond_17

    .line 427
    invoke-direct/range {p0 .. p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->y()V

    goto :goto_5

    .line 429
    :cond_17
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->finish()V

    .line 433
    :cond_18
    :goto_5
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 142
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 143
    iput-object p0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    .line 144
    new-instance v0, Lcom/huawei/hihealth/HiUserInfo;

    invoke-direct {v0}, Lcom/huawei/hihealth/HiUserInfo;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->r:Lcom/huawei/hihealth/HiUserInfo;

    .line 145
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->U:Ljava/util/Map;

    .line 146
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    invoke-virtual {v0}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->H:Lcom/huawei/up/model/UserInfomation;

    .line 147
    invoke-static {}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->getAccount()Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->V:Lcom/huawei/cloudservice/CloudAccount;

    .line 148
    sget v0, Lcom/huawei/ui/main/R$layout;->hw_show_userinfo_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->setContentView(I)V

    .line 149
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_app_third_login"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->S:Ljava/lang/String;

    .line 151
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->P:Z

    .line 152
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getAccountType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->aa:Ljava/lang/String;

    .line 153
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    .line 154
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    .line 155
    const-string v0, "isBleScale"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v4

    .line 156
    if-eqz v4, :cond_0

    .line 157
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->Q:Z

    .line 166
    :cond_0
    const-string v0, "productId"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->X:Ljava/lang/String;

    .line 168
    :cond_1
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->e()V

    .line 169
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->f()V

    .line 170
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1416
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 1417
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->W:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 1418
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->W:Landroid/os/Handler;

    .line 1420
    :cond_0
    return-void
.end method
