.class public Lo/cvj;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/huawei/hihealth/HiDeviceInfo;)Z
    .locals 2

    .line 11
    const/4 v1, 0x1

    .line 12
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 13
    const/4 v0, 0x0

    return v0

    .line 21
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceUniqueCode()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/cvj;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 22
    const/4 v1, 0x0

    .line 25
    :cond_1
    return v1
.end method

.method private static a(Ljava/lang/String;)Z
    .locals 1

    .line 38
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 39
    const/4 v0, 0x0

    return v0

    .line 41
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
