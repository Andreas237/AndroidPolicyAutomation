.class Lcom/huawei/health/MainActivity$23;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/MainActivity;->w()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/MainActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/MainActivity;)V
    .locals 0

    .line 1018
    iput-object p1, p0, Lcom/huawei/health/MainActivity$23;->b:Lcom/huawei/health/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1021
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isLogout is :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/MainActivity$23;->b:Lcom/huawei/health/MainActivity;

    invoke-static {v2}, Lcom/huawei/health/MainActivity;->h(Lcom/huawei/health/MainActivity;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1022
    iget-object v0, p0, Lcom/huawei/health/MainActivity$23;->b:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->isTokenInValidFlag()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/MainActivity$23;->b:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->h(Lcom/huawei/health/MainActivity;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1023
    iget-object v0, p0, Lcom/huawei/health/MainActivity$23;->b:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/MainActivity$23;->b:Lcom/huawei/health/MainActivity;

    invoke-static {v1}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/MainActivity$23$5;

    invoke-direct {v2, p0}, Lcom/huawei/health/MainActivity$23$5;-><init>(Lcom/huawei/health/MainActivity$23;)V

    invoke-virtual {v0, v1, v2}, Lcom/huawei/login/ui/login/LoginInit;->login(Landroid/content/Context;Lcom/huawei/login/ui/login/util/ILoginCallback;)V

    goto :goto_0

    .line 1044
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/MainActivity$23;->b:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1045
    iget-object v0, p0, Lcom/huawei/health/MainActivity$23;->b:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/MainActivity$23;->b:Lcom/huawei/health/MainActivity;

    invoke-static {v1}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    const-string v1, "notification"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/app/NotificationManager;

    .line 1046
    const/16 v0, 0x79

    invoke-virtual {v4, v0}, Landroid/app/NotificationManager;->cancel(I)V

    .line 1049
    :cond_1
    :goto_0
    return-void
.end method
