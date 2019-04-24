.class public Lcom/huawei/hwid/core/encrypt/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private static b:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwid/core/encrypt/g;->a:Ljava/util/List;

    .line 34
    const/16 v0, 0x36

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "userid"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "password"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "siteid"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "plmn"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "mobilephone"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "deviceinfo"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "uuid"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "deviceid2"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "secretdigest"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "salt"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "emmcid"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "secretdigesttype"

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "clientip"

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "deviceid"

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const-string v1, "device_id"

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const-string v1, "securityphone"

    const/16 v2, 0xf

    aput-object v1, v0, v2

    const-string v1, "securityemail"

    const/16 v2, 0x10

    aput-object v1, v0, v2

    const-string v1, "cookie"

    const/16 v2, 0x11

    aput-object v1, v0, v2

    const-string v1, "devicetype"

    const/16 v2, 0x12

    aput-object v1, v0, v2

    const-string v1, "useremail"

    const/16 v2, 0x13

    aput-object v1, v0, v2

    const-string v1, "email"

    const/16 v2, 0x14

    aput-object v1, v0, v2

    const-string v1, "servicetoken"

    const/16 v2, 0x15

    aput-object v1, v0, v2

    const-string v1, "oldpassword"

    const/16 v2, 0x16

    aput-object v1, v0, v2

    const-string v1, "newpassword"

    const/16 v2, 0x17

    aput-object v1, v0, v2

    const-string v1, "thirdtoken"

    const/16 v2, 0x18

    aput-object v1, v0, v2

    const-string v1, "smsauthcode"

    const/16 v2, 0x19

    aput-object v1, v0, v2

    const-string v1, "phone"

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    const-string v1, "access_token"

    const/16 v2, 0x1b

    aput-object v1, v0, v2

    const-string v1, "sc"

    const/16 v2, 0x1c

    aput-object v1, v0, v2

    const-string v1, "sso_st"

    const/16 v2, 0x1d

    aput-object v1, v0, v2

    const-string v1, "token"

    const/16 v2, 0x1e

    aput-object v1, v0, v2

    const-string v1, "ac"

    const/16 v2, 0x1f

    aput-object v1, v0, v2

    const-string v1, "pw"

    const/16 v2, 0x20

    aput-object v1, v0, v2

    const-string v1, "dvid"

    const/16 v2, 0x21

    aput-object v1, v0, v2

    const-string v1, "pl"

    const/16 v2, 0x22

    aput-object v1, v0, v2

    const-string v1, "dvid2"

    const/16 v2, 0x23

    aput-object v1, v0, v2

    const-string v1, "sc"

    const/16 v2, 0x24

    aput-object v1, v0, v2

    const-string v1, "emid"

    const/16 v2, 0x25

    aput-object v1, v0, v2

    const-string v1, "sct"

    const/16 v2, 0x26

    aput-object v1, v0, v2

    const-string v1, "c"

    const/16 v2, 0x27

    aput-object v1, v0, v2

    const-string v1, "st"

    const/16 v2, 0x28

    aput-object v1, v0, v2

    const-string v1, "app"

    const/16 v2, 0x29

    aput-object v1, v0, v2

    const-string v1, "uid"

    const/16 v2, 0x2a

    aput-object v1, v0, v2

    const-string v1, "imsi"

    const/16 v2, 0x2b

    aput-object v1, v0, v2

    const-string v1, "thirdopenid"

    const/16 v2, 0x2c

    aput-object v1, v0, v2

    const-string v1, "thirdaccesstoken"

    const/16 v2, 0x2d

    aput-object v1, v0, v2

    const-string v1, "accountName"

    const/16 v2, 0x2e

    aput-object v1, v0, v2

    const-string v1, "useraccount"

    const/16 v2, 0x2f

    aput-object v1, v0, v2

    const-string v1, "fulluseraccount"

    const/16 v2, 0x30

    aput-object v1, v0, v2

    const-string v1, "nickName"

    const/16 v2, 0x31

    aput-object v1, v0, v2

    const-string v1, "uniquelynickname"

    const/16 v2, 0x32

    aput-object v1, v0, v2

    const-string v1, "loginusername"

    const/16 v2, 0x33

    aput-object v1, v0, v2

    const-string v1, "thirdnickname"

    const/16 v2, 0x34

    aput-object v1, v0, v2

    const-string v1, "fingerST"

    const/16 v2, 0x35

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/hwid/core/encrypt/g;->b:[Ljava/lang/String;

    .line 46
    invoke-static {}, Lcom/huawei/hwid/core/encrypt/g;->a()V

    .line 47
    return-void
.end method

.method private static a(CI)Ljava/lang/String;
    .locals 3

    .line 70
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1, p1}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 71
    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    .line 72
    invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 71
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 74
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 90
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 91
    const-string v0, ""

    return-object v0

    .line 94
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 95
    const-string v0, "*"

    return-object v0

    .line 98
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    mul-int/lit8 v0, v0, 0x32

    int-to-double v0, v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v4, v0

    .line 100
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x2a

    invoke-static {v1, v4}, Lcom/huawei/hwid/core/encrypt/g;->a(CI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static a()V
    .locals 6

    .line 50
    sget-object v0, Lcom/huawei/hwid/core/encrypt/g;->b:[Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 51
    sget-object v2, Lcom/huawei/hwid/core/encrypt/g;->b:[Ljava/lang/String;

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v2, v4

    .line 52
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 53
    sget-object v0, Lcom/huawei/hwid/core/encrypt/g;->a:Ljava/util/List;

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v5, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 58
    :cond_1
    return-void
.end method
