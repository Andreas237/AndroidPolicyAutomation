.class public Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Z

.field private static b:Z

.field private static c:Z

.field private static d:Z

.field private static e:Z

.field private static f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 28
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->a:Z

    .line 29
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->b:Z

    .line 30
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->c:Z

    .line 32
    const/4 v0, 0x1

    sput-boolean v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d:Z

    .line 33
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->e:Z

    .line 34
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->f:Z

    .line 38
    const-string v0, "ro.config.hw_log"

    const-string v1, "false"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "true"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    sput-boolean v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->a:Z

    .line 39
    const-string v0, "ro.config.hw_module_log"

    const-string v1, "false"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "true"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    sput-boolean v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->b:Z

    .line 40
    const-string v0, "ro.debuggable"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->c:Z

    .line 41
    sget-boolean v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->a:Z

    if-nez v0, :cond_0

    sget-boolean v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->b:Z

    if-eqz v0, :cond_1

    const-string v0, "HwMembercenterSDK"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->f:Z

    .line 42
    sget-boolean v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->c:Z

    if-nez v0, :cond_2

    sget-boolean v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->b:Z

    if-eqz v0, :cond_3

    const-string v0, "HwMembercenterSDK"

    const/4 v1, 0x4

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const/4 v0, 0x1

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    sput-boolean v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->e:Z

    .line 46
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 71
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    sget-boolean v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->f:Z

    if-eqz v0, :cond_0

    .line 72
    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 74
    :cond_0
    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 85
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    sget-boolean v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->e:Z

    if-eqz v0, :cond_0

    .line 86
    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 88
    :cond_0
    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 99
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    sget-boolean v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d:Z

    if-eqz v0, :cond_0

    .line 100
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 102
    :cond_0
    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 113
    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    sget-boolean v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d:Z

    if-eqz v0, :cond_0

    .line 114
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 116
    :cond_0
    return-void
.end method
