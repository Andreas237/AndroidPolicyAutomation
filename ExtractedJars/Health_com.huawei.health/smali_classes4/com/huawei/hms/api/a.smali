.class Lcom/huawei/hms/api/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hms/api/BindingFailedResolution;


# direct methods
.method constructor <init>(Lcom/huawei/hms/api/BindingFailedResolution;)V
    .locals 0

    .line 256
    iput-object p1, p0, Lcom/huawei/hms/api/a;->a:Lcom/huawei/hms/api/BindingFailedResolution;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 2

    .line 260
    if-eqz p1, :cond_0

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    .line 261
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 264
    :cond_1
    const-string v0, "BindingFailedResolution"

    const-string v1, "In connect, bind core try timeout"

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 265
    iget-object v0, p0, Lcom/huawei/hms/api/a;->a:Lcom/huawei/hms/api/BindingFailedResolution;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/hms/api/BindingFailedResolution;->a(Lcom/huawei/hms/api/BindingFailedResolution;Z)V

    .line 266
    const/4 v0, 0x1

    return v0
.end method
