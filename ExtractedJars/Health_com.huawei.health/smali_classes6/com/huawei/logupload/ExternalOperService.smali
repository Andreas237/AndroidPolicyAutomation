.class public Lcom/huawei/logupload/ExternalOperService;
.super Landroid/app/Service;
.source "SourceFile"


# static fields
.field private static final b:Ljava/lang/String; = "ExternalOperDataBases"


# instance fields
.field a:Lcom/huawei/logupload/a$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 58
    new-instance v0, Lcom/huawei/logupload/b;

    invoke-direct {v0, p0}, Lcom/huawei/logupload/b;-><init>(Lcom/huawei/logupload/ExternalOperService;)V

    iput-object v0, p0, Lcom/huawei/logupload/ExternalOperService;->a:Lcom/huawei/logupload/a$a;

    .line 22
    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 2

    .line 28
    const-string v0, "ExternalOperDataBases"

    const-string v1, "onBind"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    iget-object v0, p0, Lcom/huawei/logupload/ExternalOperService;->a:Lcom/huawei/logupload/a$a;

    return-object v0
.end method

.method public onCreate()V
    .locals 2

    .line 37
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 38
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/logupload/ExternalOperService;->getApplication()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/logupload/c/b;->a(Landroid/app/Application;)V

    .line 39
    const-string v0, "ExternalOperDataBases"

    const-string v1, "onCreate"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 46
    const-string v0, "ExternalOperDataBases"

    const-string v1, "onDestroy"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 48
    return-void
.end method

.method public onUnbind(Landroid/content/Intent;)Z
    .locals 2

    .line 54
    const-string v0, "ExternalOperDataBases"

    const-string v1, "onUnbind"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 55
    invoke-super {p0, p1}, Landroid/app/Service;->onUnbind(Landroid/content/Intent;)Z

    move-result v0

    return v0
.end method
