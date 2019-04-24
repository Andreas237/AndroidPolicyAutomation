.class public Lo/eoe;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static a:Ljava/lang/String;

.field private static f:Ljava/lang/String;

.field private static h:Ljava/lang/String;

.field private static i:Ljava/lang/String;


# instance fields
.field b:Landroid/content/Context;

.field c:Lcom/huawei/datatype/DataDeviceInfo;

.field d:Lo/czg;

.field e:Lo/dde;

.field private g:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:I

.field private n:Landroid/os/Handler;

.field private p:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 45
    const-string v0, "putExtraMemAdLevel"

    sput-object v0, Lo/eoe;->i:Ljava/lang/String;

    .line 180
    const-string v0, ""

    sput-object v0, Lo/eoe;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eoe;->e:Lo/dde;

    .line 37
    new-instance v0, Lcom/huawei/datatype/DataDeviceInfo;

    invoke-direct {v0}, Lcom/huawei/datatype/DataDeviceInfo;-><init>()V

    iput-object v0, p0, Lo/eoe;->c:Lcom/huawei/datatype/DataDeviceInfo;

    .line 44
    const-string v0, "10011"

    iput-object v0, p0, Lo/eoe;->k:Ljava/lang/String;

    .line 97
    new-instance v0, Lo/eoe$2;

    invoke-direct {v0, p0}, Lo/eoe$2;-><init>(Lo/eoe;)V

    iput-object v0, p0, Lo/eoe;->p:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 77
    iput-object p1, p0, Lo/eoe;->b:Landroid/content/Context;

    .line 78
    iget-object v0, p0, Lo/eoe;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    iput-object v0, p0, Lo/eoe;->e:Lo/dde;

    .line 79
    iget-object v0, p0, Lo/eoe;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    iput-object v0, p0, Lo/eoe;->d:Lo/czg;

    .line 81
    iget-object v0, p0, Lo/eoe;->p:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0, v0}, Lo/eoe;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 82
    return-void
.end method

.method private a()Ljava/lang/String;
    .locals 4

    .line 57
    const-string v0, "HuaweiGoldMemberInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " getEmmcId(): emmcId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/eoe;->f:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    sget-object v0, Lo/eoe;->f:Ljava/lang/String;

    return-object v0
.end method

.method private a(Ljava/lang/String;)V
    .locals 4

    .line 62
    const-string v0, "HuaweiGoldMemberInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " setEmmcId(): emmcId1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    sput-object p1, Lo/eoe;->f:Ljava/lang/String;

    .line 64
    return-void
.end method

.method private b()Landroid/os/Bundle;
    .locals 8

    .line 119
    const-string v0, "HuaweiGoldMemberInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getHuaweiMemberInfo()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 123
    const-string v0, "userID"

    invoke-static {}, Lo/eoe;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    const-string v0, "st"

    iget-object v1, p0, Lo/eoe;->b:Landroid/content/Context;

    invoke-static {v1}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getSeverToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    iget-object v0, p0, Lo/eoe;->b:Landroid/content/Context;

    const-string v1, "phone"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/telephony/TelephonyManager;

    .line 127
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 128
    const/4 v0, 0x0

    return-object v0

    .line 132
    :cond_0
    const-string v0, "deviceType"

    :try_start_0
    invoke-virtual {v6}, Landroid/telephony/TelephonyManager;->getPhoneType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    const-string v0, "deviceID"

    invoke-virtual {v6}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    iget-object v0, p0, Lo/eoe;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/eoe;->g:Ljava/lang/String;

    .line 137
    const-string v0, "packageName"

    iget-object v1, p0, Lo/eoe;->g:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    const-string v0, "deviceLevel"

    iget-object v1, p0, Lo/eoe;->k:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    const-string v0, "eMMCID"

    invoke-direct {p0}, Lo/eoe;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    const-string v0, "imeiEnc"

    invoke-direct {p0}, Lo/eoe;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    const-string v0, "HuaweiGoldMemberInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "userId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/eoe;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", st = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eoe;->b:Landroid/content/Context;

    .line 148
    invoke-static {v3}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/login/ui/login/LoginInit;->getSeverToken()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", deviceType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 149
    invoke-virtual {v6}, Landroid/telephony/TelephonyManager;->getPhoneType()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",deviceId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 150
    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    invoke-virtual {v6}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",packageName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eoe;->g:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",KEY_EMMCID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 152
    invoke-direct {p0}, Lo/eoe;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",KEY_IMEI = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 153
    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    invoke-direct {p0}, Lo/eoe;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 147
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 158
    goto :goto_0

    .line 154
    :catch_0
    move-exception v7

    .line 155
    const-string v0, "HuaweiGoldMemberInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getIMEI() SecurityException "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    goto :goto_0

    .line 156
    :catch_1
    move-exception v7

    .line 157
    const-string v0, "HuaweiGoldMemberInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getIMEI() Exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    :goto_0
    return-object v5
.end method

.method private b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 90
    const-string v0, "HuaweiGoldMemberInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFirmwareVersion()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    iget-object v0, p0, Lo/eoe;->e:Lo/dde;

    invoke-virtual {v0, p1}, Lo/dde;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 92
    return-void
.end method

.method public static c()Ljava/lang/String;
    .locals 2

    .line 188
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/eoe;->a:Ljava/lang/String;

    .line 190
    sget-object v0, Lo/eoe;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 191
    const-string v0, ""

    sput-object v0, Lo/eoe;->a:Ljava/lang/String;

    .line 194
    :cond_0
    sget-object v0, Lo/eoe;->a:Ljava/lang/String;

    return-object v0
.end method

.method private c(Ljava/lang/String;)V
    .locals 4

    .line 72
    const-string v0, "HuaweiGoldMemberInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " setSn(): sn1 ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    sput-object p1, Lo/eoe;->h:Ljava/lang/String;

    .line 74
    return-void
.end method

.method static synthetic c(Lo/eoe;Ljava/lang/String;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lo/eoe;->c(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d(Lo/eoe;I)I
    .locals 0

    .line 33
    iput p1, p0, Lo/eoe;->l:I

    return p1
.end method

.method private d(Landroid/content/Context;)V
    .locals 4

    .line 217
    const-string v0, "HuaweiGoldMemberInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter queryMemberStatus()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 219
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lo/eoe$5;

    invoke-direct {v1, p0, p1}, Lo/eoe$5;-><init>(Lo/eoe;Landroid/content/Context;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 280
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 281
    return-void
.end method

.method static synthetic d(Lo/eoe;Ljava/lang/String;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lo/eoe;->a(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic e(Lo/eoe;)Landroid/os/Handler;
    .locals 1

    .line 33
    iget-object v0, p0, Lo/eoe;->n:Landroid/os/Handler;

    return-object v0
.end method

.method private e()Ljava/lang/String;
    .locals 4

    .line 67
    const-string v0, "HuaweiGoldMemberInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " getSn(): sn = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/eoe;->h:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    sget-object v0, Lo/eoe;->h:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public b(Landroid/content/Context;)V
    .locals 5

    .line 287
    const-string v0, "HuaweiGoldMemberInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " enterGoldCardActivationActivity()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 288
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 289
    sget-object v0, Lo/eoe;->i:Ljava/lang/String;

    iget v1, p0, Lo/eoe;->l:I

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 290
    const-class v0, Lcom/huawei/ui/device/activity/goldmember/HuaweiMemberActivity;

    invoke-virtual {v4, p1, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 291
    invoke-virtual {p1, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 292
    return-void
.end method

.method public c(Landroid/content/Context;)V
    .locals 5

    .line 298
    const-string v0, "HuaweiGoldMemberInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " enterGoldCardActivationActivity()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 299
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 300
    const-class v0, Lcom/huawei/ui/device/activity/goldmember/VIPUserInfoActivity;

    invoke-virtual {v4, p1, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 301
    invoke-virtual {p1, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 302
    return-void
.end method

.method public c(Landroid/content/Context;Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IActiveMemberCallback;)V
    .locals 5

    .line 175
    const-string v0, "HuaweiGoldMemberInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " enter activeMember()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    invoke-direct {p0}, Lo/eoe;->b()Landroid/os/Bundle;

    move-result-object v4

    .line 177
    iget-object v0, p0, Lo/eoe;->d:Lo/czg;

    invoke-virtual {v0, v4, p1, p2}, Lo/czg;->d(Landroid/os/Bundle;Landroid/content/Context;Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IActiveMemberCallback;)V

    .line 178
    return-void
.end method

.method public d(Landroid/content/Context;Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IQueryMemberStatusCallback;)V
    .locals 5

    .line 166
    const-string v0, "HuaweiGoldMemberInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter queryMemberStatus()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    invoke-direct {p0}, Lo/eoe;->b()Landroid/os/Bundle;

    move-result-object v4

    .line 168
    iget-object v0, p0, Lo/eoe;->d:Lo/czg;

    invoke-virtual {v0, v4, p1, p2}, Lo/czg;->c(Landroid/os/Bundle;Landroid/content/Context;Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IQueryMemberStatusCallback;)V

    .line 169
    return-void
.end method

.method public e(Landroid/os/Handler;Landroid/content/Context;)V
    .locals 4

    .line 199
    const-string v0, "HuaweiGoldMemberInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter getGoldCard():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    iput-object p1, p0, Lo/eoe;->n:Landroid/os/Handler;

    .line 201
    iget-object v0, p0, Lo/eoe;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 202
    const-string v0, "HuaweiGoldMemberInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Network is not Connected "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    iget-object v0, p0, Lo/eoe;->n:Landroid/os/Handler;

    const/16 v1, 0xd

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 205
    iget-object v0, p0, Lo/eoe;->n:Landroid/os/Handler;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 206
    return-void

    .line 210
    :cond_0
    invoke-direct {p0, p2}, Lo/eoe;->d(Landroid/content/Context;)V

    .line 211
    return-void
.end method
