.class public Lo/cqx;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cqx$d;
    }
.end annotation


# static fields
.field private static e:Landroid/content/Context;


# instance fields
.field private d:Lo/cqu;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Lo/cqu;

    invoke-direct {v0}, Lo/cqu;-><init>()V

    iput-object v0, p0, Lo/cqx;->d:Lo/cqu;

    .line 26
    return-void
.end method

.method synthetic constructor <init>(Lo/cqx$4;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Lo/cqx;-><init>()V

    return-void
.end method

.method public static d(Landroid/content/Context;)Lo/cqx;
    .locals 1

    .line 36
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/cqx;->e:Landroid/content/Context;

    .line 37
    sget-object v0, Lo/cqx$d;->e:Lo/cqx;

    return-object v0
.end method


# virtual methods
.method public a(I)I
    .locals 2

    .line 69
    invoke-virtual {p0, p1}, Lo/cqx;->d(I)Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v1

    .line 70
    if-eqz v1, :cond_0

    .line 71
    invoke-virtual {v1}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceType()I

    move-result v0

    return v0

    .line 73
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c(Lcom/huawei/hihealth/HiDeviceInfo;)Ljava/lang/String;
    .locals 1

    .line 84
    if-eqz p1, :cond_0

    .line 85
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceUniqueCode()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 87
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public d(I)Lcom/huawei/hihealth/HiDeviceInfo;
    .locals 8

    .line 41
    if-gtz p1, :cond_0

    .line 43
    const/4 v0, 0x0

    return-object v0

    .line 46
    :cond_0
    iget-object v0, p0, Lo/cqx;->d:Lo/cqu;

    invoke-virtual {v0, p1}, Lo/cqu;->e(I)Ljava/lang/Object;

    move-result-object v4

    .line 47
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    instance-of v0, v4, Lcom/huawei/hihealth/HiDeviceInfo;

    if-eqz v0, :cond_1

    .line 48
    move-object v0, v4

    check-cast v0, Lcom/huawei/hihealth/HiDeviceInfo;

    return-object v0

    .line 51
    :cond_1
    sget-object v0, Lo/cqx;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cpw;->e(Landroid/content/Context;)Lo/cpw;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cpw;->e(I)I

    move-result v5

    .line 52
    if-gtz v5, :cond_2

    .line 53
    const-string v0, "Debug_DeviceInfoCache"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceInfo deviceID <= 0, clientID = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    const/4 v0, 0x0

    return-object v0

    .line 56
    :cond_2
    sget-object v0, Lo/cqx;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cqa;->a(Landroid/content/Context;)Lo/cqa;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/cqa;->d(I)Lcom/huawei/hihealth/HiDeviceInfo;

    move-result-object v6

    .line 57
    const/4 v0, 0x0

    if-ne v0, v6, :cond_3

    .line 58
    const-string v0, "Debug_DeviceInfoCache"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceInfo deviceInfo == null, clientID = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    const/4 v0, 0x0

    return-object v0

    .line 61
    :cond_3
    invoke-virtual {v6}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceType()I

    move-result v0

    invoke-static {v0}, Lo/cpj;->a(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 62
    invoke-virtual {v6, v7}, Lcom/huawei/hihealth/HiDeviceInfo;->setPriority(I)V

    .line 63
    const-string v0, "Debug_DeviceInfoCache"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceInfo clientID = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", deviceInfo = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    iget-object v0, p0, Lo/cqx;->d:Lo/cqu;

    invoke-virtual {v0, p1, v6}, Lo/cqu;->b(ILjava/lang/Object;)V

    .line 65
    return-object v6
.end method

.method public d(Lcom/huawei/hihealth/HiDeviceInfo;)Ljava/lang/String;
    .locals 1

    .line 91
    if-eqz p1, :cond_0

    .line 92
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 94
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public d()V
    .locals 1

    .line 98
    iget-object v0, p0, Lo/cqx;->d:Lo/cqu;

    invoke-virtual {v0}, Lo/cqu;->d()V

    .line 99
    return-void
.end method

.method public e(Lcom/huawei/hihealth/HiDeviceInfo;)Ljava/lang/String;
    .locals 1

    .line 77
    if-eqz p1, :cond_0

    .line 78
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiDeviceInfo;->getModel()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 80
    :cond_0
    const-string v0, ""

    return-object v0
.end method
