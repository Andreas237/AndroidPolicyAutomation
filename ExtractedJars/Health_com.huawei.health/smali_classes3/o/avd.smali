.class public Lo/avd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Lo/avn;

.field private c:Lcom/huawei/health/sns/model/group/Group;

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo/avn;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, Lo/avd;->e:Landroid/content/Context;

    .line 56
    iput-object p2, p0, Lo/avd;->b:Lo/avn;

    .line 57
    return-void
.end method

.method private c(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;)V"
        }
    .end annotation

    .line 198
    invoke-static {}, Lo/bpf;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 200
    const-string v0, "PushNotificationTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "GroupName:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/avd;->b:Lo/avn;

    invoke-virtual {v2}, Lo/avn;->d()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",size:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    :cond_0
    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/group/GroupMember;Lcom/huawei/health/sns/model/user/User;)Ljava/lang/String;
    .locals 3

    .line 172
    const-string v2, ""

    .line 174
    if-eqz p2, :cond_0

    .line 176
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/User;->getDisplayName()Ljava/lang/String;

    move-result-object v2

    .line 179
    :cond_0
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 181
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserNickname()Ljava/lang/String;

    move-result-object v2

    .line 184
    :cond_1
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/User;->getContactName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 186
    invoke-virtual {p2}, Lcom/huawei/health/sns/model/user/User;->getContactName()Ljava/lang/String;

    move-result-object v2

    .line 189
    :cond_2
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 191
    iget-object v0, p0, Lo/avd;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_no_nickname:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 193
    :cond_3
    return-object v2
.end method

.method private d()V
    .locals 14

    .line 85
    iget-object v0, p0, Lo/avd;->b:Lo/avn;

    invoke-virtual {v0}, Lo/avn;->c()Ljava/util/List;

    move-result-object v5

    .line 88
    iget-object v0, p0, Lo/avd;->b:Lo/avn;

    invoke-virtual {v0}, Lo/avn;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 90
    :cond_0
    invoke-direct {p0, v5}, Lo/avd;->c(Ljava/util/List;)V

    .line 91
    return-void

    .line 95
    :cond_1
    iget-object v0, p0, Lo/avd;->b:Lo/avn;

    invoke-virtual {v0}, Lo/avn;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 96
    invoke-static {}, Lo/aut;->c()Lo/aut;

    move-result-object v0

    sget-object v1, Lo/auu$b;->e:Lo/auu$b;

    iget-object v2, p0, Lo/avd;->b:Lo/avn;

    .line 97
    invoke-virtual {v2}, Lo/avn;->b()J

    move-result-wide v2

    .line 96
    invoke-virtual {v0, v1, v2, v3}, Lo/aut;->a(Lo/auu$b;J)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 99
    :cond_2
    invoke-static {}, Lo/bpf;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 101
    const-string v0, "PushNotificationTask"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isShowNotification:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/avd;->b:Lo/avn;

    invoke-virtual {v2}, Lo/avn;->h()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    :cond_3
    return-void

    .line 106
    :cond_4
    const/4 v6, 0x0

    .line 108
    iget-object v0, p0, Lo/avd;->c:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_5

    .line 110
    iget-object v0, p0, Lo/avd;->c:Lcom/huawei/health/sns/model/group/Group;

    invoke-static {v0}, Lo/bpg;->a(Lcom/huawei/health/sns/model/group/Group;)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 113
    if-eqz v6, :cond_5

    invoke-static {}, Lo/bom;->d()Z

    move-result v0

    if-nez v0, :cond_5

    .line 115
    iget-object v0, p0, Lo/avd;->c:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageDownloadUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 117
    invoke-static {v6}, Lo/boe;->d(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 122
    :cond_5
    const/4 v7, 0x0

    .line 123
    iget-object v0, p0, Lo/avd;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_group_notify_title:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lo/avd;->b:Lo/avn;

    invoke-virtual {v3}, Lo/avn;->d()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 124
    const-string v9, ""

    .line 125
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 127
    invoke-virtual {v11}, Lcom/huawei/health/sns/model/group/GroupMember;->getState()I

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {v11}, Lcom/huawei/health/sns/model/group/GroupMember;->getState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_9

    .line 129
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v11}, Lcom/huawei/health/sns/model/group/GroupMember;->getGroupId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 130
    invoke-virtual {v11}, Lcom/huawei/health/sns/model/group/GroupMember;->getState()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v7

    .line 131
    const-string v9, ""

    .line 132
    invoke-static {}, Lo/auu;->b()Lo/auu;

    move-result-object v0

    sget-object v1, Lo/auu$b;->e:Lo/auu$b;

    invoke-virtual {v0, v1, v7}, Lo/auu;->e(Lo/auu$b;I)V

    .line 133
    invoke-static {}, Lo/atf;->d()Lo/atf;

    move-result-object v0

    invoke-virtual {v11}, Lcom/huawei/health/sns/model/group/GroupMember;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v11}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v3

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/atf;->a(JJ)V

    .line 136
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v11}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v12

    .line 137
    invoke-direct {p0, v11, v12}, Lo/avd;->d(Lcom/huawei/health/sns/model/group/GroupMember;Lcom/huawei/health/sns/model/user/User;)Ljava/lang/String;

    move-result-object v13

    .line 140
    invoke-virtual {v11}, Lcom/huawei/health/sns/model/group/GroupMember;->getState()I

    move-result v0

    if-nez v0, :cond_7

    .line 142
    iget-object v0, p0, Lo/avd;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_group_new_member_notify:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v13}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    goto :goto_1

    .line 145
    :cond_7
    invoke-virtual {v11}, Lcom/huawei/health/sns/model/group/GroupMember;->getState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_8

    .line 147
    iget-object v0, p0, Lo/avd;->e:Landroid/content/Context;

    sget v1, Lcom/huawei/android/sns/R$string;->sns_group_quit_notify:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v13}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 150
    :cond_8
    :goto_1
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 152
    iget-object v0, p0, Lo/avd;->b:Lo/avn;

    invoke-virtual {v0, v7}, Lo/avn;->b(I)V

    .line 153
    iget-object v0, p0, Lo/avd;->b:Lo/avn;

    invoke-virtual {v0, v8}, Lo/avn;->a(Ljava/lang/String;)V

    .line 154
    iget-object v0, p0, Lo/avd;->b:Lo/avn;

    invoke-virtual {v0, v9}, Lo/avn;->b(Ljava/lang/String;)V

    .line 156
    iget-object v0, p0, Lo/avd;->b:Lo/avn;

    invoke-virtual {v0, v6}, Lo/avn;->c(Landroid/graphics/Bitmap;)V

    .line 158
    iget-object v0, p0, Lo/avd;->b:Lo/avn;

    iget-object v1, p0, Lo/avd;->e:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/avn;->c(Landroid/content/Context;)V

    .line 161
    :cond_9
    goto/16 :goto_0

    .line 162
    :cond_a
    return-void
.end method


# virtual methods
.method public b()V
    .locals 6

    .line 64
    iget-object v0, p0, Lo/avd;->b:Lo/avn;

    invoke-virtual {v0}, Lo/avn;->b()J

    move-result-wide v2

    .line 66
    const-string v0, "PushNotificationTask"

    const-string v1, " syncRequestMember"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    new-instance v0, Lo/avp;

    invoke-direct {v0}, Lo/avp;-><init>()V

    invoke-static {v0}, Lo/aty;->c(Lo/aud;)V

    .line 69
    new-instance v4, Lo/atg;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lo/atg;-><init>(Landroid/os/Handler;)V

    .line 70
    invoke-virtual {v4, v2, v3}, Lo/atg;->b(J)Ljava/util/ArrayList;

    move-result-object v5

    .line 71
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v0

    iput-object v0, p0, Lo/avd;->c:Lcom/huawei/health/sns/model/group/Group;

    .line 72
    iget-object v0, p0, Lo/avd;->c:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_0

    .line 74
    iget-object v0, p0, Lo/avd;->b:Lo/avn;

    iget-object v1, p0, Lo/avd;->c:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/avn;->e(Ljava/lang/String;)V

    .line 76
    :cond_0
    iget-object v0, p0, Lo/avd;->b:Lo/avn;

    invoke-virtual {v0, v5}, Lo/avn;->d(Ljava/util/List;)V

    .line 77
    invoke-direct {p0}, Lo/avd;->d()V

    .line 78
    return-void
.end method
