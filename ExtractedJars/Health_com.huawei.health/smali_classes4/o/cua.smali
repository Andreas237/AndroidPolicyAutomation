.class public Lo/cua;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ctj;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lo/ctk;

.field private c:Lo/czg;

.field private d:I

.field private e:Lo/cqs;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/hihealth/HiSyncOption;II)V
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/huawei/hihealth/HiSyncOption;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    const-string v0, "HiH_HiSyncUserData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HiSyncUserData create"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/cua;->a:Landroid/content/Context;

    .line 66
    iput p3, p0, Lo/cua;->d:I

    .line 67
    invoke-direct {p0}, Lo/cua;->c()V

    .line 68
    return-void
.end method

.method private a(Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;)V
    .locals 5

    .line 107
    iget-object v0, p0, Lo/cua;->b:Lo/ctk;

    invoke-virtual {v0, p1}, Lo/ctk;->e(Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v4

    .line 108
    if-nez v4, :cond_0

    .line 109
    const-string v0, "HiH_HiSyncUserData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveUserInfoToDB no userBasicInfo can change to hiUserInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    return-void

    .line 112
    :cond_0
    iget-object v0, p0, Lo/cua;->e:Lo/cqs;

    iget v1, p0, Lo/cua;->d:I

    const/4 v2, 0x1

    invoke-virtual {v0, v4, v1, v2}, Lo/cqs;->a(Lcom/huawei/hihealth/HiUserInfo;II)I

    move-result v0

    if-lez v0, :cond_1

    .line 113
    iget-object v0, p0, Lo/cua;->a:Landroid/content/Context;

    const/16 v1, 0x2716

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Lo/cnt;->c(Landroid/content/Context;II)V

    .line 115
    iget-object v0, p0, Lo/cua;->a:Landroid/content/Context;

    const/4 v1, 0x5

    invoke-static {v0, v1}, Lo/cnt;->c(Landroid/content/Context;I)V

    .line 116
    invoke-static {}, Lo/cun;->e()Lo/cun;

    move-result-object v0

    const-string v1, "HiSyncUserData"

    const/16 v2, 0x64

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/cun;->d(ILjava/lang/String;Lo/crd;)V

    .line 118
    :cond_1
    const-string v0, "HiH_HiSyncUserData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveUserInfoToDB setIfUserFirstSync false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    iget-object v0, p0, Lo/cua;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/csk;->a(Landroid/content/Context;)Lo/csk;

    move-result-object v0

    iget v1, p0, Lo/cua;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/csk;->d(Ljava/lang/String;Z)V

    .line 120
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/userprofile/UserGoalsInfo;>;)V"
        }
    .end annotation

    .line 94
    iget-object v0, p0, Lo/cua;->b:Lo/ctk;

    invoke-virtual {v0, p1}, Lo/ctk;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    .line 95
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 96
    :cond_0
    const-string v0, "HiH_HiSyncUserData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveUserGoalsToDB no userGoalsInfos can change to hiGoalInfos"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    return-void

    .line 99
    :cond_1
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealth/HiGoalInfo;

    .line 100
    iget v0, p0, Lo/cua;->d:I

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiGoalInfo;->setOwnerId(I)V

    .line 101
    iget-object v0, p0, Lo/cua;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cqi;->b(Landroid/content/Context;)Lo/cqi;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v6, v1}, Lo/cqi;->b(Lcom/huawei/hihealth/HiGoalInfo;I)Z

    .line 102
    goto :goto_0

    .line 103
    :cond_2
    invoke-static {}, Lo/cun;->e()Lo/cun;

    move-result-object v0

    const-string v1, "HiSyncUserData"

    const/16 v2, 0x65

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/cun;->d(ILjava/lang/String;Lo/crd;)V

    .line 104
    return-void
.end method

.method private a(Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 123
    iget-object v0, p0, Lo/cua;->b:Lo/ctk;

    invoke-virtual {v0, p1}, Lo/ctk;->c(Ljava/util/Map;)Ljava/util/List;

    move-result-object v4

    .line 124
    if-eqz v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 125
    :cond_0
    return-void

    .line 127
    :cond_1
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealth/HiUserPreference;

    .line 128
    iget v0, p0, Lo/cua;->d:I

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiUserPreference;->setUserId(I)V

    .line 129
    iget-object v0, p0, Lo/cua;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cqp;->b(Landroid/content/Context;)Lo/cqp;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/cqp;->d(Lcom/huawei/hihealth/HiUserPreference;)Z

    .line 130
    goto :goto_0

    .line 131
    :cond_2
    iget-object v0, p0, Lo/cua;->a:Landroid/content/Context;

    const/4 v1, 0x7

    invoke-static {v0, v1}, Lo/cnt;->c(Landroid/content/Context;I)V

    .line 132
    invoke-static {}, Lo/cun;->e()Lo/cun;

    move-result-object v0

    const-string v1, "HiSyncUserData"

    const/16 v2, 0x66

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Lo/cun;->d(ILjava/lang/String;Lo/crd;)V

    .line 133
    return-void
.end method

.method private b()Lcom/huawei/hihealth/HiUserInfo;
    .locals 5

    .line 81
    iget-object v0, p0, Lo/cua;->e:Lo/cqs;

    iget v1, p0, Lo/cua;->d:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/cqs;->d(II)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v4

    .line 82
    if-nez v4, :cond_0

    .line 83
    const-string v0, "HiH_HiSyncUserData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadUserBasic no userInfo get"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    const/4 v0, 0x0

    return-object v0

    .line 86
    :cond_0
    return-object v4
.end method

.method private c()V
    .locals 1

    .line 71
    iget-object v0, p0, Lo/cua;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cqs;->b(Landroid/content/Context;)Lo/cqs;

    move-result-object v0

    iput-object v0, p0, Lo/cua;->e:Lo/cqs;

    .line 72
    new-instance v0, Lo/ctk;

    invoke-direct {v0}, Lo/ctk;-><init>()V

    iput-object v0, p0, Lo/cua;->b:Lo/ctk;

    .line 73
    iget-object v0, p0, Lo/cua;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    iput-object v0, p0, Lo/cua;->c:Lo/czg;

    .line 74
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cua;->h:Ljava/util/List;

    .line 76
    return-void
.end method

.method private c(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiUserPreference;>;)V"
        }
    .end annotation

    .line 265
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/hihealth/HiUserPreference;

    .line 266
    iget-object v0, p0, Lo/cua;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cqp;->b(Landroid/content/Context;)Lo/cqp;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v3, v1}, Lo/cqp;->e(Lcom/huawei/hihealth/HiUserPreference;I)I

    .line 267
    goto :goto_0

    .line 268
    :cond_0
    return-void
.end method

.method private e(Lcom/huawei/hihealth/HiUserInfo;)V
    .locals 3

    .line 251
    iget-object v0, p0, Lo/cua;->e:Lo/cqs;

    iget v1, p0, Lo/cua;->d:I

    const/4 v2, 0x1

    invoke-virtual {v0, p1, v1, v2}, Lo/cqs;->a(Lcom/huawei/hihealth/HiUserInfo;II)I

    .line 252
    return-void
.end method

.method private e(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiGoalInfo;>;)V"
        }
    .end annotation

    .line 255
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealth/HiGoalInfo;

    .line 256
    if-nez v5, :cond_0

    .line 257
    goto :goto_0

    .line 259
    :cond_0
    iget-object v0, p0, Lo/cua;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cqi;->b(Landroid/content/Context;)Lo/cqi;

    move-result-object v0

    iget v1, p0, Lo/cua;->d:I

    .line 260
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalType()I

    move-result v2

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/cqi;->b(III)I

    .line 261
    goto :goto_0

    .line 262
    :cond_1
    return-void
.end method

.method private e(Z)V
    .locals 8

    .line 173
    new-instance v4, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileReq;

    invoke-direct {v4}, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileReq;-><init>()V

    .line 174
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 175
    const/16 v0, 0x63

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 176
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 177
    invoke-virtual {v4, v5}, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileReq;->setProfileType(Ljava/util/List;)V

    .line 178
    iget-object v0, p0, Lo/cua;->c:Lo/czg;

    invoke-virtual {v0, v4}, Lo/czg;->d(Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileReq;)Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileRsp;

    move-result-object v6

    .line 180
    const/4 v0, 0x0

    :try_start_0
    invoke-static {v6, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 181
    const-string v0, "HiH_HiSyncUserData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadHealthSettingInfo rsp is fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lo/csq; {:try_start_0 .. :try_end_0} :catch_0

    .line 182
    return-void

    .line 184
    :cond_0
    :try_start_1
    iget-object v0, p0, Lo/cua;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/csk;->a(Landroid/content/Context;)Lo/csk;

    move-result-object v0

    iget v1, p0, Lo/cua;->d:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/csk;->b(Ljava/lang/String;Z)V

    .line 185
    invoke-virtual {v6}, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileRsp;->getCustomDefine()Ljava/util/Map;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/cua;->a(Ljava/util/Map;)V

    .line 186
    invoke-virtual {v6}, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileRsp;->getGoals()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/cua;->a(Ljava/util/List;)V
    :try_end_1
    .catch Lo/csq; {:try_start_1 .. :try_end_1} :catch_0

    .line 194
    goto :goto_0

    .line 187
    :catch_0
    move-exception v7

    .line 188
    const-string v0, "HiH_HiSyncUserData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadHealthSettingInfo rsp is error, e= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Lo/csq;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    if-eqz v6, :cond_1

    .line 190
    invoke-virtual {v6}, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileRsp;->getResultCode()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x7537

    if-ne v1, v0, :cond_1

    if-eqz p1, :cond_1

    .line 191
    iget-object v0, p0, Lo/cua;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/csk;->a(Landroid/content/Context;)Lo/csk;

    move-result-object v0

    iget v1, p0, Lo/cua;->d:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/csk;->b(Ljava/lang/String;Z)V

    .line 195
    :cond_1
    :goto_0
    return-void
.end method

.method private f()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealth/HiUserPreference;>;"
        }
    .end annotation

    .line 136
    iget-object v0, p0, Lo/cua;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cqp;->b(Landroid/content/Context;)Lo/cqp;

    move-result-object v0

    iget v1, p0, Lo/cua;->d:I

    .line 137
    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/cqp;->a(II)Ljava/util/List;

    move-result-object v0

    .line 136
    return-object v0
.end method

.method private g()V
    .locals 2

    .line 271
    iget-object v0, p0, Lo/cua;->h:Ljava/util/List;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 272
    iget-object v0, p0, Lo/cua;->h:Ljava/util/List;

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 273
    iget-object v0, p0, Lo/cua;->h:Ljava/util/List;

    const/16 v1, 0x63

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 274
    return-void
.end method

.method private h()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealth/HiGoalInfo;>;"
        }
    .end annotation

    .line 90
    iget-object v0, p0, Lo/cua;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/cqi;->b(Landroid/content/Context;)Lo/cqi;

    move-result-object v0

    iget v1, p0, Lo/cua;->d:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/cqi;->c(II)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private i()V
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 198
    new-instance v4, Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileReq;

    invoke-direct {v4}, Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileReq;-><init>()V

    .line 199
    invoke-direct {p0}, Lo/cua;->b()Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v5

    .line 200
    iget-object v0, p0, Lo/cua;->b:Lo/ctk;

    invoke-virtual {v0, v5}, Lo/ctk;->c(Lcom/huawei/hihealth/HiUserInfo;)Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;

    move-result-object v6

    .line 201
    const/4 v7, 0x0

    .line 202
    if-eqz v6, :cond_0

    .line 203
    invoke-virtual {v4, v6}, Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileReq;->setBasic(Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;)V

    .line 204
    const/4 v7, 0x1

    .line 207
    :cond_0
    invoke-direct {p0}, Lo/cua;->h()Ljava/util/List;

    move-result-object v8

    .line 208
    iget-object v0, p0, Lo/cua;->b:Lo/ctk;

    invoke-virtual {v0, v8}, Lo/ctk;->d(Ljava/util/List;)Ljava/util/List;

    move-result-object v9

    .line 209
    if-eqz v9, :cond_1

    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 210
    invoke-virtual {v4, v9}, Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileReq;->setGoals(Ljava/util/List;)V

    .line 211
    const/4 v7, 0x1

    .line 214
    :cond_1
    invoke-direct {p0}, Lo/cua;->f()Ljava/util/List;

    move-result-object v10

    .line 215
    iget-object v0, p0, Lo/cua;->b:Lo/ctk;

    invoke-virtual {v0, v10}, Lo/ctk;->b(Ljava/util/List;)Ljava/util/Map;

    move-result-object v11

    .line 216
    if-eqz v11, :cond_2

    invoke-interface {v11}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 217
    invoke-virtual {v4, v11}, Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileReq;->setCustomDefine(Ljava/util/Map;)V

    .line 218
    const/4 v7, 0x1

    .line 221
    :cond_2
    if-nez v7, :cond_3

    .line 222
    const-string v0, "HiH_HiSyncUserData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadUserData nothing to pushData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    return-void

    .line 226
    :cond_3
    iget-object v0, p0, Lo/cua;->c:Lo/czg;

    invoke-virtual {v0, v4}, Lo/czg;->c(Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileReq;)Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileRsp;

    move-result-object v12

    .line 227
    const/4 v0, 0x0

    invoke-static {v12, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_4

    .line 228
    const-string v0, "HiH_HiSyncUserData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadUserData rsp error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    return-void

    .line 231
    :cond_4
    if-eqz v6, :cond_5

    .line 232
    invoke-direct {p0, v5}, Lo/cua;->e(Lcom/huawei/hihealth/HiUserInfo;)V

    .line 242
    :cond_5
    if-eqz v9, :cond_6

    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 243
    invoke-direct {p0, v8}, Lo/cua;->e(Ljava/util/List;)V

    .line 245
    :cond_6
    if-eqz v11, :cond_7

    invoke-interface {v11}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 246
    invoke-direct {p0, v10}, Lo/cua;->c(Ljava/util/List;)V

    .line 248
    :cond_7
    return-void
.end method

.method private k()V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 141
    iget-object v0, p0, Lo/cua;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/csk;->a(Landroid/content/Context;)Lo/csk;

    move-result-object v0

    iget v1, p0, Lo/cua;->d:I

    .line 142
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/csk;->e(Ljava/lang/String;)Z

    move-result v4

    .line 144
    invoke-static {}, Lo/csk;->f()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lo/cui;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 145
    const-string v0, "HiH_HiSyncUserData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downLoadUserData() userPrivacy switch is closed ,can not download right now!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    invoke-static {}, Lo/csk;->i()Z

    move-result v0

    if-nez v0, :cond_0

    .line 147
    invoke-direct {p0, v4}, Lo/cua;->e(Z)V

    .line 149
    :cond_0
    return-void

    .line 151
    :cond_1
    invoke-direct {p0}, Lo/cua;->g()V

    .line 152
    new-instance v5, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileReq;

    invoke-direct {v5}, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileReq;-><init>()V

    .line 153
    iget-object v0, p0, Lo/cua;->h:Ljava/util/List;

    invoke-virtual {v5, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileReq;->setProfileType(Ljava/util/List;)V

    .line 155
    iget-object v0, p0, Lo/cua;->c:Lo/czg;

    invoke-virtual {v0, v5}, Lo/czg;->d(Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileReq;)Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileRsp;

    move-result-object v6

    .line 157
    const/4 v0, 0x0

    :try_start_0
    invoke-static {v6, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 158
    const-string v0, "HiH_HiSyncUserData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downLoadUserData rsp is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    invoke-direct {p0, v4}, Lo/cua;->e(Z)V
    :try_end_0
    .catch Lo/csq; {:try_start_0 .. :try_end_0} :catch_0

    .line 161
    return-void

    .line 163
    :cond_2
    :try_start_1
    invoke-virtual {v6}, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileRsp;->getBasic()Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/cua;->a(Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;)V

    .line 164
    invoke-virtual {v6}, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileRsp;->getGoals()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/cua;->a(Ljava/util/List;)V

    .line 165
    invoke-virtual {v6}, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileRsp;->getCustomDefine()Ljava/util/Map;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/cua;->a(Ljava/util/Map;)V
    :try_end_1
    .catch Lo/csq; {:try_start_1 .. :try_end_1} :catch_0

    .line 169
    goto :goto_0

    .line 166
    :catch_0
    move-exception v7

    .line 167
    const-string v0, "HiH_HiSyncUserData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downLoadUserData rsp is error, e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Lo/csq;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    invoke-direct {p0, v4}, Lo/cua;->e(Z)V

    .line 170
    :goto_0
    return-void
.end method

.method private n()V
    .locals 12

    .line 314
    new-instance v4, Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileReq;

    invoke-direct {v4}, Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileReq;-><init>()V

    .line 315
    const/4 v5, 0x0

    .line 316
    invoke-direct {p0}, Lo/cua;->f()Ljava/util/List;

    move-result-object v6

    .line 317
    iget-object v0, p0, Lo/cua;->b:Lo/ctk;

    invoke-virtual {v0, v6}, Lo/ctk;->b(Ljava/util/List;)Ljava/util/Map;

    move-result-object v7

    .line 318
    if-eqz v7, :cond_0

    invoke-interface {v7}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 319
    invoke-virtual {v4, v7}, Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileReq;->setCustomDefine(Ljava/util/Map;)V

    .line 320
    const/4 v5, 0x1

    .line 323
    :cond_0
    invoke-direct {p0}, Lo/cua;->h()Ljava/util/List;

    move-result-object v8

    .line 324
    iget-object v0, p0, Lo/cua;->b:Lo/ctk;

    invoke-virtual {v0, v8}, Lo/ctk;->d(Ljava/util/List;)Ljava/util/List;

    move-result-object v9

    .line 325
    if-eqz v9, :cond_1

    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 326
    invoke-virtual {v4, v9}, Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileReq;->setGoals(Ljava/util/List;)V

    .line 327
    const/4 v5, 0x1

    .line 329
    :cond_1
    if-nez v5, :cond_2

    .line 330
    const-string v0, "HiH_HiSyncUserData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadHealthSettingInfo nothing to pushData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 331
    return-void

    .line 334
    :cond_2
    iget-object v0, p0, Lo/cua;->c:Lo/czg;

    invoke-virtual {v0, v4}, Lo/czg;->c(Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileReq;)Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileRsp;

    move-result-object v10

    .line 336
    const/4 v0, 0x0

    :try_start_0
    invoke-static {v10, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-nez v0, :cond_3

    .line 337
    const-string v0, "HiH_HiSyncUserData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadHealthSettingInfo rsp fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lo/csq; {:try_start_0 .. :try_end_0} :catch_0

    .line 338
    return-void

    .line 343
    :cond_3
    goto :goto_0

    .line 340
    :catch_0
    move-exception v11

    .line 341
    const-string v0, "HiH_HiSyncUserData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "uploadHealthSettingInfo rsp error e="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v11}, Lo/csq;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 342
    return-void

    .line 345
    :goto_0
    if-eqz v7, :cond_4

    invoke-interface {v7}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 346
    invoke-direct {p0, v6}, Lo/cua;->c(Ljava/util/List;)V

    .line 348
    :cond_4
    if-eqz v9, :cond_5

    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 349
    invoke-direct {p0, v8}, Lo/cua;->e(Ljava/util/List;)V

    .line 351
    :cond_5
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 291
    const-string v0, "HiH_HiSyncUserData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upLoad() begin !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 292
    invoke-static {}, Lo/csk;->f()Z

    move-result v0

    if-nez v0, :cond_1

    .line 293
    const-string v0, "HiH_HiSyncUserData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushData() userPrivacy switch is closed ,can not pushData right now ,push end!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 294
    invoke-static {}, Lo/csk;->i()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/cua;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/csk;->a(Landroid/content/Context;)Lo/csk;

    move-result-object v0

    iget v1, p0, Lo/cua;->d:I

    .line 295
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/csk;->e(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 297
    invoke-direct {p0}, Lo/cua;->n()V

    .line 299
    :cond_0
    return-void

    .line 301
    :cond_1
    iget-object v0, p0, Lo/cua;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/csk;->a(Landroid/content/Context;)Lo/csk;

    move-result-object v0

    iget v1, p0, Lo/cua;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/csk;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 302
    invoke-direct {p0}, Lo/cua;->i()V

    goto :goto_0

    .line 304
    :cond_2
    const-string v0, "HiH_HiSyncUserData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "first user sync do not upload userData, who is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/cua;->d:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 306
    iget-object v0, p0, Lo/cua;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/csk;->a(Landroid/content/Context;)Lo/csk;

    move-result-object v0

    iget v1, p0, Lo/cua;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/csk;->e(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 307
    invoke-direct {p0}, Lo/cua;->n()V

    .line 310
    :cond_3
    :goto_0
    const-string v0, "HiH_HiSyncUserData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upLoad() end !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 311
    return-void
.end method

.method public b(Lcom/huawei/hihealth/HiUserInfo;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 361
    const-string v0, "HiH_HiSyncUserData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start upLoadBasicInfoOnly"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 362
    invoke-static {}, Lo/csk;->f()Z

    move-result v0

    if-nez v0, :cond_0

    .line 363
    const-string v0, "HiH_HiSyncUserData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upLoadBasicInfoOnly() userPrivacy switch is closed ,can not pushData right now ,push end!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 365
    const/4 v0, 0x0

    return v0

    .line 367
    :cond_0
    iget-object v0, p0, Lo/cua;->b:Lo/ctk;

    invoke-virtual {v0, p1}, Lo/ctk;->c(Lcom/huawei/hihealth/HiUserInfo;)Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;

    move-result-object v4

    .line 368
    if-nez v4, :cond_1

    .line 369
    const/4 v0, 0x0

    return v0

    .line 371
    :cond_1
    new-instance v5, Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileReq;

    invoke-direct {v5}, Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileReq;-><init>()V

    .line 372
    invoke-virtual {v5, v4}, Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileReq;->setBasic(Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;)V

    .line 373
    iget-object v0, p0, Lo/cua;->c:Lo/czg;

    invoke-virtual {v0, v5}, Lo/czg;->c(Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileReq;)Lcom/huawei/hwcloudmodel/model/userprofile/SetUserProfileRsp;

    move-result-object v6

    .line 374
    const/4 v0, 0x0

    invoke-static {v6, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 375
    iget-object v0, p0, Lo/cua;->a:Landroid/content/Context;

    const/16 v1, 0x2715

    const/4 v2, 0x2

    invoke-static {v0, v1, v2}, Lo/cnt;->c(Landroid/content/Context;II)V

    .line 377
    invoke-direct {p0, p1}, Lo/cua;->e(Lcom/huawei/hihealth/HiUserInfo;)V

    .line 378
    const/4 v0, 0x1

    return v0

    .line 380
    :cond_2
    iget-object v0, p0, Lo/cua;->a:Landroid/content/Context;

    const/16 v1, 0x2715

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cnt;->c(Landroid/content/Context;II)V

    .line 383
    const/4 v0, 0x0

    return v0
.end method

.method public d()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 278
    const-string v0, "HiH_HiSyncUserData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downLoad() begin !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 279
    invoke-direct {p0}, Lo/cua;->k()V

    .line 280
    const-string v0, "HiH_HiSyncUserData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downLoad() end !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    return-void
.end method

.method public e()Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/csq;
        }
    .end annotation

    .line 387
    const-string v0, "HiH_HiSyncUserData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start downLoadBasicInfoOnly"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 388
    new-instance v4, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileReq;

    invoke-direct {v4}, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileReq;-><init>()V

    .line 389
    iget-object v0, p0, Lo/cua;->h:Ljava/util/List;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 390
    iget-object v0, p0, Lo/cua;->h:Ljava/util/List;

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileReq;->setProfileType(Ljava/util/List;)V

    .line 391
    iget-object v0, p0, Lo/cua;->c:Lo/czg;

    invoke-virtual {v0, v4}, Lo/czg;->d(Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileReq;)Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileRsp;

    move-result-object v5

    .line 392
    const/4 v0, 0x0

    invoke-static {v5, v0}, Lo/csn;->e(Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 393
    invoke-virtual {v5}, Lcom/huawei/hwcloudmodel/model/userprofile/GetUserProfileRsp;->getBasic()Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/cua;->a(Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;)V

    .line 394
    const/4 v0, 0x1

    return v0

    .line 396
    :cond_0
    iget-object v0, p0, Lo/cua;->a:Landroid/content/Context;

    const/16 v1, 0x2716

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/cnt;->c(Landroid/content/Context;II)V

    .line 399
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 355
    new-instance v1, Ljava/lang/StringBuffer;

    const-string v0, "--HiSyncUserData{"

    invoke-direct {v1, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 356
    const/16 v0, 0x7d

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 357
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
