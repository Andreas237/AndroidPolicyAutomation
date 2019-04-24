.class Lo/dnv;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lo/dnv;

.field private static final b:Ljava/lang/Object;

.field private static final e:[Ljava/lang/String;


# instance fields
.field private c:Lo/czn;

.field private d:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 90
    const/16 v0, 0x8

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, ""

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "true"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, ""

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, ""

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "true"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "true"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, ""

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, ""

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sput-object v0, Lo/dnv;->e:[Ljava/lang/String;

    .line 104
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dnv;->b:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 137
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 106
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dnv;->d:Landroid/content/Context;

    .line 122
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dnv;->c:Lo/czn;

    .line 138
    iput-object p1, p0, Lo/dnv;->d:Landroid/content/Context;

    .line 141
    iget-object v0, p0, Lo/dnv;->c:Lo/czn;

    if-nez v0, :cond_0

    .line 143
    invoke-static {p1}, Lo/czn;->e(Landroid/content/Context;)Lo/czn;

    move-result-object v0

    iput-object v0, p0, Lo/dnv;->c:Lo/czn;

    .line 146
    :cond_0
    return-void
.end method

.method static synthetic a(Lo/dnv;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)V
    .locals 0

    .line 86
    invoke-direct {p0, p1, p2, p3}, Lo/dnv;->d(Ljava/lang/String;Ljava/lang/String;Lo/dcy;)V

    return-void
.end method

.method private b(Lcom/huawei/hwcloudmodel/model/userprofile/GetPrivacyRecordRsp;Lcom/huawei/up/callback/CommonCallback;)V
    .locals 10

    .line 241
    :try_start_0
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/userprofile/GetPrivacyRecordRsp;->getPrivacyRecords()Ljava/util/List;

    move-result-object v5

    .line 242
    if-eqz v5, :cond_5

    .line 243
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcloudmodel/model/userprofile/PrivacyRecord;

    .line 246
    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/userprofile/PrivacyRecord;->getPrivacyId()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 247
    goto :goto_0

    .line 249
    :cond_0
    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/userprofile/PrivacyRecord;->getPrivacyId()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 251
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cloud_user_privacy"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 253
    const/16 v0, 0xa

    if-ne v8, v0, :cond_2

    .line 254
    iget-object v0, p0, Lo/dnv;->d:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_product_recommend"

    .line 255
    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/userprofile/PrivacyRecord;->getOpinion()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1

    const-string v3, "0"

    goto :goto_1

    :cond_1
    const-string v3, "1"

    :goto_1
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 254
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto :goto_3

    .line 258
    :cond_2
    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/userprofile/PrivacyRecord;->getOpinion()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    const/4 v0, 0x1

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v9, v0, v1}, Lo/dnv;->d(Ljava/lang/String;Ljava/lang/String;Lo/dcy;)V

    .line 261
    :goto_3
    iget-object v0, p0, Lo/dnv;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/hwcloudmodel/model/userprofile/PrivacyRecord;->getOpinion()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_4

    const/4 v1, 0x1

    goto :goto_4

    :cond_4
    const/4 v1, 0x0

    :goto_4
    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v9, v1, v2}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 262
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/dnv;->a(Z)V

    .line 263
    goto/16 :goto_0

    .line 265
    :cond_5
    if-eqz p2, :cond_6

    .line 266
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-interface {p2, v0}, Lcom/huawei/up/callback/CommonCallback;->onSuccess(Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 270
    :cond_6
    goto :goto_5

    .line 268
    :catch_0
    move-exception v5

    .line 269
    const-string v0, "HWUserProfileMgrUserPrivacy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "operationReultRsp fail "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 271
    :goto_5
    return-void
.end method

.method static synthetic b(Lo/dnv;I)V
    .locals 0

    .line 86
    invoke-direct {p0, p1}, Lo/dnv;->d(I)V

    return-void
.end method

.method public static c(Landroid/content/Context;)Lo/dnv;
    .locals 4

    .line 129
    sget-object v2, Lo/dnv;->b:Ljava/lang/Object;

    monitor-enter v2

    .line 130
    :try_start_0
    sget-object v0, Lo/dnv;->a:Lo/dnv;

    if-nez v0, :cond_0

    .line 131
    new-instance v0, Lo/dnv;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/dnv;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dnv;->a:Lo/dnv;

    .line 133
    :cond_0
    sget-object v0, Lo/dnv;->a:Lo/dnv;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 134
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private c(Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordReq;Lcom/huawei/hwbasemgr/IBaseResponseCallback;IZLjava/lang/String;)V
    .locals 7

    .line 504
    iget-object v0, p0, Lo/dnv;->c:Lo/czn;

    new-instance v1, Lo/dnv$1;

    move-object v2, p0

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lo/dnv$1;-><init>(Lo/dnv;Lcom/huawei/hwbasemgr/IBaseResponseCallback;IZLjava/lang/String;)V

    invoke-virtual {v0, p1, v1}, Lo/czn;->a(Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordReq;Lo/cyx;)V

    .line 535
    return-void
.end method

.method private d(I)V
    .locals 5

    .line 562
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cloud_user_privacy_reupload"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/dnv;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 563
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cloud_user_privacy_reupload_desp"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/dnv;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 564
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 575
    :cond_0
    new-instance v4, Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordReq;

    invoke-direct {v4}, Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordReq;-><init>()V

    .line 576
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordReq;->setPrivacyId(Ljava/lang/Integer;)V

    .line 577
    const-string v0, "true"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordReq;->setOpinion(Ljava/lang/Integer;)V

    .line 578
    invoke-virtual {v4, v3}, Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordReq;->setDescription(Ljava/lang/String;)V

    .line 579
    iget-object v0, p0, Lo/dnv;->c:Lo/czn;

    new-instance v1, Lo/dnv$7;

    invoke-direct {v1, p0, p1}, Lo/dnv$7;-><init>(Lo/dnv;I)V

    invoke-virtual {v0, v4, v1}, Lo/czn;->a(Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordReq;Lo/cyx;)V

    .line 600
    :cond_2
    :goto_1
    return-void
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;Lo/dcy;)V
    .locals 1

    .line 153
    iget-object v0, p0, Lo/dnv;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lo/dnm;->setSharedPreference(Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 154
    return-void
.end method

.method static synthetic e(Lo/dnv;Lcom/huawei/hwcloudmodel/model/userprofile/GetPrivacyRecordRsp;Lcom/huawei/up/callback/CommonCallback;)V
    .locals 0

    .line 86
    invoke-direct {p0, p1, p2}, Lo/dnv;->b(Lcom/huawei/hwcloudmodel/model/userprofile/GetPrivacyRecordRsp;Lcom/huawei/up/callback/CommonCallback;)V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 4

    .line 625
    const-string v0, "HWUserProfileMgrUserPrivacy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setUserPrivacyUpgraded, flag = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 626
    const-string v0, "KEY_PERSONAL_PRIVACY_SETTINGS_UPGRADED_FLAG"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/dnv;->d(Ljava/lang/String;Ljava/lang/String;Lo/dcy;)V

    .line 627
    return-void
.end method

.method public b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 3

    .line 327
    iget-object v0, p0, Lo/dnv;->c:Lo/czn;

    new-instance v1, Lcom/huawei/hwcloudmodel/model/userprofile/DeleteAllUserProfileReq;

    invoke-direct {v1}, Lcom/huawei/hwcloudmodel/model/userprofile/DeleteAllUserProfileReq;-><init>()V

    new-instance v2, Lo/dnv$4;

    invoke-direct {v2, p0, p1}, Lo/dnv$4;-><init>(Lo/dnv;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1, v2}, Lo/czn;->c(Lcom/huawei/hwcloudmodel/model/userprofile/DeleteAllUserProfileReq;Lo/cyx;)V

    .line 351
    return-void
.end method

.method public c(I)Ljava/lang/String;
    .locals 5

    .line 540
    const/4 v0, 0x1

    if-lt p1, v0, :cond_0

    const/16 v0, 0x8

    if-lt p1, v0, :cond_1

    .line 542
    :cond_0
    const-string v0, "HWUserProfileMgrUserPrivacy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " invalid privacyId"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 543
    const/4 v0, 0x0

    return-object v0

    .line 547
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cloud_user_privacy"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/dnv;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 548
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 550
    sget-object v0, Lo/dnv;->e:[Ljava/lang/String;

    aget-object v4, v0, p1

    .line 555
    :cond_2
    return-object v4
.end method

.method public c()V
    .locals 6

    .line 159
    const-string v0, "custome_define_init_flag"

    const-string v1, "false"

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/dnv;->d(Ljava/lang/String;Ljava/lang/String;Lo/dcy;)V

    .line 160
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2720

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_first_login"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 162
    const-string v0, "HWUserProfileMgrUserPrivacy"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "firstLogin = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    const-string v0, "false"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 165
    iget-object v0, p0, Lo/dnv;->d:Landroid/content/Context;

    .line 166
    const/16 v1, 0x2720

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_first_login"

    const-string v3, "false"

    .line 165
    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 168
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 170
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/dnv;->c(Lcom/huawei/up/callback/CommonCallback;)V

    .line 178
    :cond_0
    return-void
.end method

.method public c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 3

    .line 357
    iget-object v0, p0, Lo/dnv;->c:Lo/czn;

    new-instance v1, Lcom/huawei/hwcloudmodel/model/userprofile/LastClearCloudDataTimeReq;

    invoke-direct {v1}, Lcom/huawei/hwcloudmodel/model/userprofile/LastClearCloudDataTimeReq;-><init>()V

    new-instance v2, Lo/dnv$2;

    invoke-direct {v2, p0, p1}, Lo/dnv$2;-><init>(Lo/dnv;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v1, v2}, Lo/czn;->c(Lcom/huawei/hwcloudmodel/model/userprofile/LastClearCloudDataTimeReq;Lo/cyx;)V

    .line 381
    return-void
.end method

.method public c(Lcom/huawei/up/callback/CommonCallback;)V
    .locals 5

    .line 203
    const-string v0, "HWUserProfileMgrUserPrivacy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " downloadUserPrivacy Entry"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    new-instance v4, Lcom/huawei/hwcloudmodel/model/userprofile/GetPrivacyRecordReq;

    invoke-direct {v4}, Lcom/huawei/hwcloudmodel/model/userprofile/GetPrivacyRecordReq;-><init>()V

    .line 206
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/GetPrivacyRecordReq;->setPrivacyId(Ljava/lang/Integer;)V

    .line 209
    iget-object v0, p0, Lo/dnv;->c:Lo/czn;

    new-instance v1, Lo/dnv$3;

    invoke-direct {v1, p0, p1}, Lo/dnv$3;-><init>(Lo/dnv;Lcom/huawei/up/callback/CommonCallback;)V

    invoke-virtual {v0, v4, v1}, Lo/czn;->e(Lcom/huawei/hwcloudmodel/model/userprofile/GetPrivacyRecordReq;Lo/cyx;)V

    .line 232
    return-void
.end method

.method public d()V
    .locals 5

    .line 183
    const-string v0, "custome_define_init_flag"

    const-string v1, "true"

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/dnv;->d(Ljava/lang/String;Ljava/lang/String;Lo/dcy;)V

    .line 186
    const/4 v4, 0x1

    :goto_0
    const/16 v0, 0x8

    if-ge v4, v0, :cond_0

    .line 188
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cloud_user_privacy"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lo/dnv;->e:[Ljava/lang/String;

    aget-object v1, v1, v4

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/dnv;->d(Ljava/lang/String;Ljava/lang/String;Lo/dcy;)V

    .line 189
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cloud_user_privacy_reupload"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/dnv;->d(Ljava/lang/String;Ljava/lang/String;Lo/dcy;)V

    .line 190
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cloud_user_privacy_reupload_desp"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/dnv;->d(Ljava/lang/String;Ljava/lang/String;Lo/dcy;)V

    .line 192
    iget-object v0, p0, Lo/dnv;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "cloud_user_privacy"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lo/dnv;->e:[Ljava/lang/String;

    aget-object v2, v2, v4

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 186
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 196
    :cond_0
    return-void
.end method

.method public d(IZLjava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 7

    .line 304
    const/16 v0, 0xa

    if-ne v0, p1, :cond_1

    .line 305
    iget-object v0, p0, Lo/dnv;->d:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_product_recommend"

    if-nez p2, :cond_0

    const-string v3, "0"

    goto :goto_0

    :cond_0
    const-string v3, "1"

    :goto_0
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto :goto_1

    .line 308
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cloud_user_privacy"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lo/dnv;->d(Ljava/lang/String;Ljava/lang/String;Lo/dcy;)V

    .line 311
    :goto_1
    iget-object v0, p0, Lo/dnv;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "cloud_user_privacy"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 312
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 314
    new-instance v6, Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordReq;

    invoke-direct {v6}, Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordReq;-><init>()V

    .line 315
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordReq;->setPrivacyId(Ljava/lang/Integer;)V

    .line 316
    if-eqz p2, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x2

    :goto_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordReq;->setOpinion(Ljava/lang/Integer;)V

    .line 317
    invoke-virtual {v6, p3}, Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordReq;->setDescription(Ljava/lang/String;)V

    .line 318
    move-object v0, p0

    move-object v1, v6

    move-object v2, p4

    move v3, p1

    move v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lo/dnv;->c(Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordReq;Lcom/huawei/hwbasemgr/IBaseResponseCallback;IZLjava/lang/String;)V

    .line 324
    :cond_3
    return-void
.end method

.method public e(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 149
    iget-object v0, p0, Lo/dnv;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dnm;->getSharedPreference(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e()V
    .locals 4

    .line 604
    const-string v0, "HWUserProfileMgrUserPrivacy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reuploadUserPrivacy Enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 606
    invoke-static {}, Lo/doa;->e()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lo/dnv$5;

    invoke-direct {v1, p0}, Lo/dnv$5;-><init>(Lo/dnv;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 618
    return-void
.end method
