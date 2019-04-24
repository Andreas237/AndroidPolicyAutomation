.class public final Lcom/huawei/logupload/c/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/huawei/logupload/c/b;


# instance fields
.field private b:Landroid/app/Application;

.field private c:Z

.field private d:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 17
    new-instance v0, Lcom/huawei/logupload/c/b;

    invoke-direct {v0}, Lcom/huawei/logupload/c/b;-><init>()V

    sput-object v0, Lcom/huawei/logupload/c/b;->a:Lcom/huawei/logupload/c/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/logupload/c/b;->b:Landroid/app/Application;

    .line 27
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/logupload/c/b;->c:Z

    .line 31
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/logupload/c/b;->d:Landroid/os/Handler;

    .line 38
    return-void
.end method

.method public static a()Lcom/huawei/logupload/c/b;
    .locals 1

    .line 47
    sget-object v0, Lcom/huawei/logupload/c/b;->a:Lcom/huawei/logupload/c/b;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/app/Application;)V
    .locals 0

    .line 56
    if-eqz p1, :cond_0

    .line 58
    iput-object p1, p0, Lcom/huawei/logupload/c/b;->b:Landroid/app/Application;

    .line 60
    :cond_0
    return-void
.end method

.method public a(Landroid/os/Handler;)V
    .locals 0

    .line 107
    iput-object p1, p0, Lcom/huawei/logupload/c/b;->d:Landroid/os/Handler;

    .line 108
    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 92
    iput-boolean p1, p0, Lcom/huawei/logupload/c/b;->c:Z

    .line 93
    return-void
.end method

.method public b()Landroid/app/Application;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/logupload/c/b;->b:Landroid/app/Application;

    return-object v0
.end method

.method public c()Z
    .locals 4

    .line 78
    iget-object v0, p0, Lcom/huawei/logupload/c/b;->b:Landroid/app/Application;

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/app/Application;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/net/ConnectivityManager;

    .line 79
    const/4 v3, 0x0

    .line 80
    if-eqz v2, :cond_0

    .line 82
    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v3

    .line 84
    :cond_0
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroid/net/NetworkInfo;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public d()Z
    .locals 1

    .line 99
    iget-boolean v0, p0, Lcom/huawei/logupload/c/b;->c:Z

    return v0
.end method

.method public e()Landroid/os/Handler;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/logupload/c/b;->d:Landroid/os/Handler;

    return-object v0
.end method
