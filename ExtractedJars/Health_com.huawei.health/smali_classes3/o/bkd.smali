.class public Lo/bkd;
.super Lo/bfq;
.source "SourceFile"


# instance fields
.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/bfh;>;"
        }
    .end annotation
.end field

.field private h:Ljava/lang/String;

.field private k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 45
    invoke-direct {p0, p1}, Lo/bfq;-><init>(Landroid/content/Context;)V

    .line 29
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bkd;->e:Ljava/util/List;

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bkd;->k:Ljava/util/List;

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bkd;->h:Ljava/lang/String;

    .line 46
    new-instance v1, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;

    invoke-direct {v1}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;-><init>()V

    .line 47
    const/16 v0, 0x31

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setCardType(I)V

    .line 48
    sget v0, Lcom/huawei/android/sns/R$drawable;->sns_ic_sociality_scaning_normal:I

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setResID(I)V

    .line 49
    sget v0, Lcom/huawei/android/sns/R$string;->sns_menu_sweep:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setTitle(Ljava/lang/String;)V

    .line 50
    sget v0, Lcom/huawei/android/sns/R$string;->sns_add_friend_sweep_subtitle:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setSubTitle(Ljava/lang/String;)V

    .line 51
    sget-object v0, Lo/bfp$c;->c:Lo/bfp$c;

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setEventType(Lo/bfp$c;)V

    .line 52
    iget-object v0, p0, Lo/bkd;->e:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    new-instance v2, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;

    invoke-direct {v2}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;-><init>()V

    .line 55
    const/16 v0, 0x31

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setCardType(I)V

    .line 56
    sget v0, Lcom/huawei/android/sns/R$drawable;->sns_ic_friends_contacts_normal:I

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setResID(I)V

    .line 57
    sget v0, Lcom/huawei/android/sns/R$string;->sns_add_friend_contact_title:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setTitle(Ljava/lang/String;)V

    .line 58
    sget v0, Lcom/huawei/android/sns/R$string;->sns_add_friend_contact_subtitle:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setSubTitle(Ljava/lang/String;)V

    .line 59
    sget-object v0, Lo/bfp$c;->h:Lo/bfp$c;

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setEventType(Lo/bfp$c;)V

    .line 60
    iget-object v0, p0, Lo/bkd;->e:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 62
    new-instance v3, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;

    invoke-direct {v3}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;-><init>()V

    .line 63
    const/16 v0, 0x31

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setCardType(I)V

    .line 64
    sget v0, Lcom/huawei/android/sns/R$drawable;->sns_ic_friends_notification_normal:I

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setResID(I)V

    .line 65
    sget v0, Lcom/huawei/android/sns/R$string;->sns_system_notification:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setTitle(Ljava/lang/String;)V

    .line 66
    sget v0, Lcom/huawei/android/sns/R$string;->sns_get_more_info_service:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setSubTitle(Ljava/lang/String;)V

    .line 67
    sget-object v0, Lo/bfp$c;->E:Lo/bfp$c;

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/ui/user/card/LinkCard$LinkCardBean;->setEventType(Lo/bfp$c;)V

    .line 68
    iget-object v0, p0, Lo/bkd;->e:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 69
    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/user/User;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 113
    iget-object v0, p0, Lo/bkd;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 114
    iput-object p2, p0, Lo/bkd;->h:Ljava/lang/String;

    .line 115
    iput-object p1, p0, Lo/bkd;->k:Ljava/util/List;

    .line 116
    invoke-virtual {p0}, Lo/bkd;->d()V

    .line 117
    return-void
.end method

.method public b()V
    .locals 1

    .line 124
    iget-object v0, p0, Lo/bkd;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 125
    invoke-virtual {p0}, Lo/bkd;->d()V

    .line 126
    return-void
.end method

.method public d()V
    .locals 7

    .line 75
    iget-object v0, p0, Lo/bkd;->k:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bkd;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 77
    new-instance v0, Lo/bke;

    invoke-direct {v0}, Lo/bke;-><init>()V

    iget-object v1, p0, Lo/bkd;->b:Landroid/content/Context;

    iget-object v2, p0, Lo/bkd;->k:Ljava/util/List;

    iget-object v3, p0, Lo/bkd;->h:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lo/bke;->d(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    .line 79
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0x18

    const/16 v2, 0x18

    invoke-virtual {p0, v1, v2, v0, v4}, Lo/bkd;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 81
    goto :goto_0

    .line 84
    :cond_0
    iget-object v0, p0, Lo/bkd;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lo/bkd;->e:Ljava/util/List;

    const/16 v2, 0x17

    const/16 v3, 0x31

    invoke-virtual {p0, v2, v3, v0, v1}, Lo/bkd;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 85
    new-instance v4, Lo/bkr$c;

    invoke-direct {v4}, Lo/bkr$c;-><init>()V

    .line 86
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 87
    const/16 v0, 0x19

    invoke-virtual {v4, v0}, Lo/bkr$c;->setCardType(I)V

    .line 88
    sget-object v0, Lo/bfp$c;->a:Lo/bfp$c;

    invoke-virtual {v4, v0}, Lo/bkr$c;->setEventType(Lo/bfp$c;)V

    .line 89
    invoke-static {}, Lo/awj;->b()Lo/awj;

    move-result-object v0

    invoke-virtual {v0}, Lo/awj;->c()Ljava/lang/String;

    move-result-object v6

    .line 90
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 92
    invoke-virtual {v4, v6}, Lo/bkr$c;->a(Ljava/lang/String;)V

    .line 94
    :cond_1
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0x19

    const/16 v2, 0x19

    invoke-virtual {p0, v1, v2, v0, v5}, Lo/bkd;->e(IIILjava/util/List;)Lo/bfq$e;

    .line 98
    :goto_0
    invoke-virtual {p0}, Lo/bkd;->a()Lo/bfq$c;

    move-result-object v4

    .line 99
    if-eqz v4, :cond_2

    .line 101
    invoke-interface {v4}, Lo/bfq$c;->b()V

    .line 103
    :cond_2
    return-void
.end method
