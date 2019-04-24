.class public final Lcom/huawei/phoneserviceuni/common/d/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/huawei/phoneserviceuni/common/d/a/a;


# instance fields
.field private b:Landroid/app/Application;

.field private c:Landroid/content/Context;

.field private d:Landroid/content/Context;

.field private e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 18
    new-instance v0, Lcom/huawei/phoneserviceuni/common/d/a/a;

    invoke-direct {v0}, Lcom/huawei/phoneserviceuni/common/d/a/a;-><init>()V

    sput-object v0, Lcom/huawei/phoneserviceuni/common/d/a/a;->a:Lcom/huawei/phoneserviceuni/common/d/a/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/phoneserviceuni/common/d/a/a;->b:Landroid/app/Application;

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/phoneserviceuni/common/d/a/a;->c:Landroid/content/Context;

    .line 35
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/phoneserviceuni/common/d/a/a;->e:Z

    .line 42
    return-void
.end method

.method public static a()Lcom/huawei/phoneserviceuni/common/d/a/a;
    .locals 1

    .line 50
    sget-object v0, Lcom/huawei/phoneserviceuni/common/d/a/a;->a:Lcom/huawei/phoneserviceuni/common/d/a/a;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/app/Application;)V
    .locals 0

    .line 60
    if-eqz p1, :cond_0

    .line 61
    iput-object p1, p0, Lcom/huawei/phoneserviceuni/common/d/a/a;->b:Landroid/app/Application;

    .line 63
    :cond_0
    return-void
.end method

.method public a(Landroid/content/Context;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/huawei/phoneserviceuni/common/d/a/a;->c:Landroid/content/Context;

    .line 79
    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 103
    iput-boolean p1, p0, Lcom/huawei/phoneserviceuni/common/d/a/a;->e:Z

    .line 104
    return-void
.end method

.method public b()Landroid/app/Application;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/phoneserviceuni/common/d/a/a;->b:Landroid/app/Application;

    return-object v0
.end method

.method public c()Landroid/content/Context;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/huawei/phoneserviceuni/common/d/a/a;->c:Landroid/content/Context;

    return-object v0
.end method

.method public d()Z
    .locals 4

    .line 91
    iget-object v0, p0, Lcom/huawei/phoneserviceuni/common/d/a/a;->b:Landroid/app/Application;

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/app/Application;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/net/ConnectivityManager;

    .line 92
    const/4 v3, 0x0

    .line 93
    if-eqz v2, :cond_0

    .line 94
    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v3

    .line 96
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    invoke-virtual {v3}, Landroid/net/NetworkInfo;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e()Z
    .locals 1

    .line 110
    iget-boolean v0, p0, Lcom/huawei/phoneserviceuni/common/d/a/a;->e:Z

    return v0
.end method

.method public f()Landroid/content/Context;
    .locals 6

    .line 121
    iget-object v0, p0, Lcom/huawei/phoneserviceuni/common/d/a/a;->d:Landroid/content/Context;

    if-nez v0, :cond_1

    .line 123
    iget-object v0, p0, Lcom/huawei/phoneserviceuni/common/d/a/a;->b:Landroid/app/Application;

    if-eqz v0, :cond_1

    .line 125
    iget-object v0, p0, Lcom/huawei/phoneserviceuni/common/d/a/a;->b:Landroid/app/Application;

    invoke-virtual {v0}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "androidhwext:style/Theme.Emui.Light"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    .line 128
    iget-object v0, p0, Lcom/huawei/phoneserviceuni/common/d/a/a;->b:Landroid/app/Application;

    invoke-virtual {v0}, Landroid/app/Application;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    .line 129
    if-nez v4, :cond_0

    .line 131
    iput-object v5, p0, Lcom/huawei/phoneserviceuni/common/d/a/a;->d:Landroid/content/Context;

    goto :goto_0

    .line 135
    :cond_0
    new-instance v0, Landroid/view/ContextThemeWrapper;

    invoke-direct {v0, v5, v4}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/huawei/phoneserviceuni/common/d/a/a;->d:Landroid/content/Context;

    .line 141
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/phoneserviceuni/common/d/a/a;->d:Landroid/content/Context;

    return-object v0
.end method
