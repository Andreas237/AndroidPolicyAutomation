.class public Lo/dnq;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dnq$e;
    }
.end annotation


# static fields
.field private static b:Lo/dnq;

.field private static final h:[I


# instance fields
.field private a:Lo/dnr;

.field private c:Landroid/content/Context;

.field private d:Lo/dok;

.field private e:Lo/dny;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 46
    const/4 v0, 0x0

    sput-object v0, Lo/dnq;->b:Lo/dnq;

    .line 140
    const/4 v0, 0x3

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lo/dnq;->h:[I

    return-void

    :array_0
    .array-data 4
        0x3e8
        0xbb8
        0x1388
    .end array-data
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dnq;->c:Landroid/content/Context;

    .line 48
    new-instance v0, Lo/dns;

    invoke-direct {v0}, Lo/dns;-><init>()V

    iput-object v0, p0, Lo/dnq;->a:Lo/dnr;

    .line 49
    new-instance v0, Lo/dnz;

    invoke-direct {v0}, Lo/dnz;-><init>()V

    iput-object v0, p0, Lo/dnq;->e:Lo/dny;

    .line 51
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dnq;->d:Lo/dok;

    .line 103
    iput-object p1, p0, Lo/dnq;->c:Landroid/content/Context;

    .line 104
    new-instance v0, Lo/dnq$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/dnq$e;-><init>(Lo/dnq;Lo/dnq$5;)V

    iput-object v0, p0, Lo/dnq;->d:Lo/dok;

    .line 105
    iget-object v0, p0, Lo/dnq;->d:Lo/dok;

    iget-object v1, p0, Lo/dnq;->c:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/dok;->b(Landroid/content/Context;)V

    .line 106
    iget-object v0, p0, Lo/dnq;->d:Lo/dok;

    invoke-virtual {v0}, Lo/dok;->b()V

    .line 107
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 108
    new-instance v0, Lo/dnt;

    invoke-direct {v0}, Lo/dnt;-><init>()V

    iput-object v0, p0, Lo/dnq;->a:Lo/dnr;

    .line 109
    iget-object v0, p0, Lo/dnq;->a:Lo/dnr;

    iget-object v1, p0, Lo/dnq;->c:Landroid/content/Context;

    invoke-interface {v0, v1}, Lo/dnr;->a(Landroid/content/Context;)V

    .line 110
    new-instance v0, Lo/dnw;

    invoke-direct {v0}, Lo/dnw;-><init>()V

    iput-object v0, p0, Lo/dnq;->e:Lo/dny;

    .line 111
    iget-object v0, p0, Lo/dnq;->e:Lo/dny;

    iget-object v1, p0, Lo/dnq;->c:Landroid/content/Context;

    invoke-interface {v0, v1}, Lo/dny;->d(Landroid/content/Context;)V

    .line 114
    :cond_0
    return-void
.end method

.method static synthetic b(Lo/dnq;Lo/dny;)Lo/dny;
    .locals 0

    .line 41
    iput-object p1, p0, Lo/dnq;->e:Lo/dny;

    return-object p1
.end method

.method static synthetic c(Lo/dnq;)Lo/dny;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/dnq;->e:Lo/dny;

    return-object v0
.end method

.method static synthetic d(Lo/dnq;)Lo/dnr;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/dnq;->a:Lo/dnr;

    return-object v0
.end method

.method static synthetic e(Lo/dnq;)Landroid/content/Context;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/dnq;->c:Landroid/content/Context;

    return-object v0
.end method

.method public static e(Landroid/content/Context;)Lo/dnq;
    .locals 4

    .line 93
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    .line 94
    const-class v2, Lo/dnq;

    monitor-enter v2

    .line 95
    :try_start_0
    sget-object v0, Lo/dnq;->b:Lo/dnq;

    if-nez v0, :cond_0

    .line 96
    new-instance v0, Lo/dnq;

    invoke-direct {v0, v1}, Lo/dnq;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dnq;->b:Lo/dnq;

    .line 98
    :cond_0
    sget-object v0, Lo/dnq;->b:Lo/dnq;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 99
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method static synthetic e(Lo/dnq;Lo/dnr;)Lo/dnr;
    .locals 0

    .line 41
    iput-object p1, p0, Lo/dnq;->a:Lo/dnr;

    return-object p1
.end method

.method public static e(Landroid/content/Context;Lcom/huawei/hihealth/HiUserInfo;Lo/cyx;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Lcom/huawei/hihealth/HiUserInfo;Lo/cyx<Ljava/lang/Boolean;>;)V"
        }
    .end annotation

    .line 440
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "modifyUserInfoByRemote get Arg:1)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getBirthday()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getGender()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 441
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x7

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "modifyUserInfoByRemote get Arg:2)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " height:"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, " weight:"

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getWeight()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const-string v2, " UnitType:"

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getUnitType()I

    move-result v2

    if-nez v2, :cond_0

    const-string v2, "UNIT_CM_KG"

    goto :goto_0

    :cond_0
    const-string v2, "UNIT_FT_LB"

    :goto_0
    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 443
    invoke-static {p0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v4

    .line 445
    invoke-virtual {v4}, Lo/dnm;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 446
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWUserProfileMgr waitInit fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 447
    return-void

    .line 450
    :cond_1
    invoke-virtual {v4}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v5

    .line 452
    if-eqz v5, :cond_4

    .line 453
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "modifyUserInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 454
    invoke-virtual {v5, p1}, Lcom/huawei/up/model/UserInfomation;->loadAccountExtData(Lcom/huawei/hihealth/HiUserInfo;)V

    .line 457
    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->transSelf2METRIC()V

    .line 460
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 461
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ifAllowLogin only set height,weight"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 462
    invoke-static {p0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    invoke-virtual {v0, v5, p2}, Lo/dnm;->e(Lcom/huawei/up/model/UserInfomation;Lo/cyx;)V

    .line 463
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "modifyUserInfo pass to Mgr(allow Login):1)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getBirthdayStatus()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getBirthday()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 464
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "modifyUserInfo pass to Mgr(allow Login):2)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getHeight()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getWeight()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getClientSet()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 465
    return-void

    .line 469
    :cond_2
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-nez v0, :cond_3

    .line 470
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not AllowLogin set all"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 472
    invoke-virtual {v5, p1}, Lcom/huawei/up/model/UserInfomation;->loadAccountData(Lcom/huawei/hihealth/HiUserInfo;)V

    .line 475
    :cond_3
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "modifyUserInfo pass to Mgr:1)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getBirthdayStatus()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getBirthday()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 476
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "modifyUserInfo pass to Mgr:2)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getHeight()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getWeight()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getClientSet()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 477
    invoke-virtual {v4, p0, v5, p2}, Lo/dnm;->c(Landroid/content/Context;Lcom/huawei/up/model/UserInfomation;Lo/cyx;)V

    .line 479
    :cond_4
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 1

    .line 133
    iget-object v0, p0, Lo/dnq;->d:Lo/dok;

    invoke-virtual {v0}, Lo/dok;->k()V

    .line 134
    return-void
.end method

.method public a(Landroid/content/Context;Lcom/huawei/up/model/UserInfomation;Lo/cyx;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Lcom/huawei/up/model/UserInfomation;Lo/cyx<Ljava/lang/Boolean;>;)V"
        }
    .end annotation

    .line 171
    if-nez p2, :cond_1

    .line 172
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserInfo arg null,not permitted"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    if-eqz p3, :cond_0

    .line 174
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {p3, v0, v1, v2}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 176
    :cond_0
    return-void

    .line 179
    :cond_1
    invoke-virtual {p2}, Lcom/huawei/up/model/UserInfomation;->copyFrom()Lcom/huawei/up/model/UserInfomation;

    move-result-object p2

    .line 181
    invoke-virtual {p2}, Lcom/huawei/up/model/UserInfomation;->getBirthdayStatus()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UNSETED_USER_SEE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 183
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "!BIRTHDAY_UNSETED_USER_SEE data -> BIRTHDAY_SETED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    const-string v0, "SETED"

    invoke-virtual {p2, v0}, Lcom/huawei/up/model/UserInfomation;->setBirthdayStatus(Ljava/lang/String;)V

    goto :goto_0

    .line 186
    :cond_2
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BIRTHDAY_UNSETED_USER_SEE data -> BIRTHDAY_UNSETED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    const-string v0, "UNSETED"

    invoke-virtual {p2, v0}, Lcom/huawei/up/model/UserInfomation;->setBirthdayStatus(Ljava/lang/String;)V

    .line 190
    :goto_0
    invoke-virtual {p2}, Lcom/huawei/up/model/UserInfomation;->getBirthday()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 191
    const-string v0, "19900801"

    invoke-virtual {p2, v0}, Lcom/huawei/up/model/UserInfomation;->setBirthday(Ljava/lang/String;)V

    .line 194
    :cond_3
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " setUserInfo Entry, user="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Lcom/huawei/up/model/UserInfomation;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    invoke-static {p2}, Lo/dos;->d(Lcom/huawei/up/model/UserInfomation;)Lcom/huawei/up/model/UserInfomation;

    move-result-object p2

    .line 198
    invoke-virtual {p0}, Lo/dnq;->k()Lcom/huawei/up/model/UserInfomation;

    move-result-object v6

    .line 200
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-nez v0, :cond_5

    const/4 v0, 0x0

    if-ne v0, v6, :cond_5

    .line 201
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWUserProfileMgr not inited,please check the time control!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    if-eqz p3, :cond_4

    .line 203
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {p3, v0, v1, v2}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 205
    :cond_4
    return-void

    .line 208
    :cond_5
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-static {p2, v6}, Lo/dos;->b(Lcom/huawei/up/model/UserInfomation;Lcom/huawei/up/model/UserInfomation;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 209
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not need to Write,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    if-eqz p3, :cond_6

    .line 211
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {p3, v0, v1, v2}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 213
    :cond_6
    return-void

    .line 216
    :cond_7
    move-object v7, p2

    .line 218
    new-instance v0, Lo/dnq$5;

    move-object v1, p0

    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    move-object v3, v7

    move-object v4, p3

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lo/dnq$5;-><init>(Lo/dnq;Landroid/os/Handler;Lcom/huawei/up/model/UserInfomation;Lo/cyx;Landroid/content/Context;)V

    move-object v8, v0

    .line 244
    new-instance v0, Lo/dnq$2;

    invoke-direct {v0, p0, v7, v8}, Lo/dnq$2;-><init>(Lo/dnq;Lcom/huawei/up/model/UserInfomation;Lo/doi;)V

    invoke-virtual {v8, v0}, Lo/doi;->e(Lo/doi$a;)V

    .line 266
    new-instance v0, Lo/dnq$3;

    invoke-direct {v0, p0, v7, v8}, Lo/dnq$3;-><init>(Lo/dnq;Lcom/huawei/up/model/UserInfomation;Lo/doi;)V

    invoke-virtual {v8, v0}, Lo/doi;->e(Lo/doi$a;)V

    .line 286
    invoke-virtual {v8}, Lo/doi;->b()V

    .line 287
    return-void
.end method

.method public a(Lcom/huawei/up/callback/CommonCallback;)V
    .locals 2

    .line 421
    iget-object v0, p0, Lo/dnq;->a:Lo/dnr;

    new-instance v1, Lo/dnq$7;

    invoke-direct {v1, p0, p1}, Lo/dnq$7;-><init>(Lo/dnq;Lcom/huawei/up/callback/CommonCallback;)V

    invoke-interface {v0, v1}, Lo/dnr;->b(Lo/dod$e$b;)V

    .line 436
    return-void
.end method

.method public a()Z
    .locals 7

    .line 146
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AccountDataMgr checkInit before:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/dnq;->a:Lo/dnr;

    invoke-interface {v2}, Lo/dnr;->e()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AccountDataExtMgr checkInit before:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/dnq;->e:Lo/dny;

    invoke-interface {v2}, Lo/dny;->a()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    sget-object v0, Lo/dnq;->h:[I

    array-length v4, v0

    .line 149
    sget-object v5, Lo/dnq;->h:[I

    .line 150
    :goto_0
    if-eqz v4, :cond_1

    iget-object v0, p0, Lo/dnq;->a:Lo/dnr;

    invoke-interface {v0}, Lo/dnr;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/dnq;->e:Lo/dny;

    invoke-interface {v0}, Lo/dny;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 152
    :cond_0
    rsub-int/lit8 v0, v4, 0x3

    :try_start_0
    aget v6, v5, v0

    .line 153
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sleepArg:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    int-to-long v0, v6

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 157
    goto :goto_1

    .line 155
    :catch_0
    move-exception v6

    .line 156
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "waitInit interrupt"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    :goto_1
    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    .line 160
    :cond_1
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AccountDataMgr checkInit after:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/dnq;->a:Lo/dnr;

    invoke-interface {v2}, Lo/dnr;->e()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AccountDataExtMgr checkInit after:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/dnq;->e:Lo/dny;

    invoke-interface {v2}, Lo/dny;->a()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    iget-object v0, p0, Lo/dnq;->a:Lo/dnr;

    invoke-interface {v0}, Lo/dnr;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/dnq;->e:Lo/dny;

    invoke-interface {v0}, Lo/dny;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    return v0
.end method

.method public b()V
    .locals 1

    .line 125
    iget-object v0, p0, Lo/dnq;->d:Lo/dok;

    invoke-virtual {v0}, Lo/dok;->h()V

    .line 126
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 4

    .line 411
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter saveNameFromAccount"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 413
    iget-object v0, p0, Lo/dnq;->a:Lo/dnr;

    invoke-interface {v0, p1}, Lo/dnr;->d(Ljava/lang/String;)V

    .line 414
    return-void
.end method

.method public c()V
    .locals 1

    .line 121
    iget-object v0, p0, Lo/dnq;->d:Lo/dok;

    invoke-virtual {v0}, Lo/dok;->i()V

    .line 122
    return-void
.end method

.method public c(Landroid/content/Context;)V
    .locals 1

    .line 137
    iget-object v0, p0, Lo/dnq;->d:Lo/dok;

    invoke-virtual {v0}, Lo/dok;->f()V

    .line 138
    return-void
.end method

.method public d()V
    .locals 1

    .line 117
    iget-object v0, p0, Lo/dnq;->d:Lo/dok;

    invoke-virtual {v0}, Lo/dok;->g()V

    .line 118
    return-void
.end method

.method public e()V
    .locals 1

    .line 129
    iget-object v0, p0, Lo/dnq;->d:Lo/dok;

    invoke-virtual {v0}, Lo/dok;->n()V

    .line 130
    return-void
.end method

.method e(Lcom/huawei/up/model/UserInfomation;Lo/cyx;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/up/model/UserInfomation;Lo/cyx<Ljava/lang/Boolean;>;)V"
        }
    .end annotation

    .line 294
    if-nez p1, :cond_1

    .line 295
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserInfo arg null,not permitted"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 296
    if-eqz p2, :cond_0

    .line 297
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {p2, v0, v1, v2}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 299
    :cond_0
    return-void

    .line 302
    :cond_1
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " setUserInfoDP Entry, user="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 304
    invoke-static {p1}, Lo/dos;->d(Lcom/huawei/up/model/UserInfomation;)Lcom/huawei/up/model/UserInfomation;

    move-result-object p1

    .line 306
    invoke-virtual {p0}, Lo/dnq;->k()Lcom/huawei/up/model/UserInfomation;

    move-result-object v4

    .line 308
    const/4 v0, 0x0

    if-ne v0, v4, :cond_3

    .line 309
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWUserProfileMgr not inited,please check the time control!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 310
    if-eqz p2, :cond_2

    .line 311
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {p2, v0, v1, v2}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 313
    :cond_2
    return-void

    .line 316
    :cond_3
    invoke-static {p1, v4}, Lo/dos;->c(Lcom/huawei/up/model/UserInfomation;Lcom/huawei/up/model/UserInfomation;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 317
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not need to Write,return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 318
    if-eqz p2, :cond_4

    .line 319
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {p2, v0, v1, v2}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 321
    :cond_4
    return-void

    .line 324
    :cond_5
    move-object v5, p1

    .line 326
    new-instance v6, Lo/dnq$1;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {v6, p0, v0, v5, p2}, Lo/dnq$1;-><init>(Lo/dnq;Landroid/os/Handler;Lcom/huawei/up/model/UserInfomation;Lo/cyx;)V

    .line 345
    new-instance v0, Lo/dnq$4;

    invoke-direct {v0, p0, v5, v6}, Lo/dnq$4;-><init>(Lo/dnq;Lcom/huawei/up/model/UserInfomation;Lo/doi;)V

    invoke-virtual {v6, v0}, Lo/doi;->e(Lo/doi$a;)V

    .line 365
    invoke-virtual {v6}, Lo/doi;->b()V

    .line 366
    return-void
.end method

.method public g()V
    .locals 1

    .line 417
    iget-object v0, p0, Lo/dnq;->a:Lo/dnr;

    invoke-interface {v0}, Lo/dnr;->a()V

    .line 418
    return-void
.end method

.method public k()Lcom/huawei/up/model/UserInfomation;
    .locals 8

    .line 374
    iget-object v0, p0, Lo/dnq;->a:Lo/dnr;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/dnq;->e:Lo/dny;

    if-nez v0, :cond_1

    .line 375
    :cond_0
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mAccountDataMgr | mAccountDataExtMgr null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 376
    const/4 v0, 0x0

    return-object v0

    .line 378
    :cond_1
    iget-object v0, p0, Lo/dnq;->a:Lo/dnr;

    invoke-interface {v0}, Lo/dnr;->b()Lcom/huawei/up/model/UserInfomation;

    move-result-object v4

    .line 379
    iget-object v0, p0, Lo/dnq;->e:Lo/dny;

    invoke-interface {v0}, Lo/dny;->e()Lcom/huawei/up/model/UserInfomation;

    move-result-object v5

    .line 381
    if-eqz v4, :cond_2

    if-nez v5, :cond_3

    .line 382
    :cond_2
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountData | accountDataExt null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 383
    const/4 v0, 0x0

    return-object v0

    .line 386
    :cond_3
    new-instance v6, Lcom/huawei/up/model/UserInfomation;

    invoke-direct {v6}, Lcom/huawei/up/model/UserInfomation;-><init>()V

    .line 388
    invoke-virtual {v6, v4}, Lcom/huawei/up/model/UserInfomation;->loadAccountData(Lcom/huawei/up/model/UserInfomation;)V

    .line 389
    invoke-virtual {v6, v5}, Lcom/huawei/up/model/UserInfomation;->loadAccountExtData(Lcom/huawei/up/model/UserInfomation;)V

    .line 391
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get userInfo:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lcom/huawei/up/model/UserInfomation;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 392
    invoke-virtual {v6}, Lcom/huawei/up/model/UserInfomation;->getPicPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "default"

    invoke-virtual {v6}, Lcom/huawei/up/model/UserInfomation;->getPicPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 394
    :cond_4
    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 395
    iget-object v0, p0, Lo/dnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dou;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    .line 397
    :cond_5
    iget-object v0, p0, Lo/dnq;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dou;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    .line 399
    :goto_0
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get picPath:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 400
    invoke-virtual {v6, v7}, Lcom/huawei/up/model/UserInfomation;->setPicPath(Ljava/lang/String;)V

    .line 402
    :cond_6
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get userInfo2:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lcom/huawei/up/model/UserInfomation;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 403
    return-object v6
.end method
