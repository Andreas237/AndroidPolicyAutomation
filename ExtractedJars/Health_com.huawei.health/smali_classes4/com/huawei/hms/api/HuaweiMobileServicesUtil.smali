.class public abstract Lcom/huawei/hms/api/HuaweiMobileServicesUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static isHuaweiMobileServicesAvailable(Landroid/content/Context;I)I
    .locals 6

    .line 32
    const-string v0, "context must not be null."

    invoke-static {p0, v0}, Lcom/huawei/hms/c/a;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 35
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    .line 36
    const/16 v0, 0x15

    return v0

    .line 39
    :cond_0
    new-instance v2, Lcom/huawei/hms/c/g;

    invoke-direct {v2, p0}, Lcom/huawei/hms/c/g;-><init>(Landroid/content/Context;)V

    .line 42
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v2, v0}, Lcom/huawei/hms/c/g;->a(Ljava/lang/String;)Lcom/huawei/hms/c/g$a;

    move-result-object v3

    .line 43
    sget-object v0, Lcom/huawei/hms/c/g$a;->c:Lcom/huawei/hms/c/g$a;

    invoke-virtual {v0, v3}, Lcom/huawei/hms/c/g$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 44
    const/4 v0, 0x1

    return v0

    .line 48
    :cond_1
    sget-object v0, Lcom/huawei/hms/c/g$a;->b:Lcom/huawei/hms/c/g$a;

    invoke-virtual {v0, v3}, Lcom/huawei/hms/c/g$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 49
    const/4 v0, 0x3

    return v0

    .line 53
    :cond_2
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v2, v0}, Lcom/huawei/hms/c/g;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 54
    const-string v0, "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 55
    const/16 v0, 0x9

    return v0

    .line 59
    :cond_3
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v2, v0}, Lcom/huawei/hms/c/g;->b(Ljava/lang/String;)I

    move-result v5

    .line 60
    if-ge v5, p1, :cond_4

    .line 61
    const/4 v0, 0x2

    return v0

    .line 64
    :cond_4
    const/4 v0, 0x0

    return v0
.end method
