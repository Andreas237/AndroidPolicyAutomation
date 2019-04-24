.class public Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/c;
.super Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/a;
.source "SourceFile"


# instance fields
.field private c:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Bundle;)V
    .locals 1

    .line 34
    const-string v0, "https://ccpce-cn.consumer.huawei.com/ccpcmd/services/dispatch/anonymous/CCPC/EN/ccpcme/queryLeaguerStatusForApp/1"

    invoke-direct {p0, v0, p1}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/a;-><init>(Ljava/lang/String;Landroid/content/Context;)V

    .line 35
    iput-object p2, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/c;->c:Landroid/os/Bundle;

    .line 36
    return-void
.end method


# virtual methods
.method protected a(Ljava/lang/String;)Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/d;
    .locals 3

    .line 48
    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    .line 49
    const-class v0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/d;

    invoke-virtual {v1, p1, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/d;

    .line 50
    return-object v2
.end method

.method protected a(Landroid/content/Context;)Ljava/lang/Object;
    .locals 2

    .line 39
    new-instance v1, Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/b;

    iget-object v0, p0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a/c;->c:Landroid/os/Bundle;

    invoke-direct {v1, v0, p1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/c/b;-><init>(Landroid/os/Bundle;Landroid/content/Context;)V

    .line 40
    return-object v1
.end method

.method protected b()Z
    .locals 1

    .line 54
    const/4 v0, 0x1

    return v0
.end method
