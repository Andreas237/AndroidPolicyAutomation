.class final Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$JavaScriptLocalObj;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "JavaScriptLocalObj"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;


# direct methods
.method constructor <init>(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;)V
    .locals 0

    .line 192
    iput-object p1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$JavaScriptLocalObj;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public intoApp(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 200
    const-string v0, "CloudActivity"

    const-string v1, "enter intoApp"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$JavaScriptLocalObj;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-virtual {v1}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$JavaScriptLocalObj$1;

    invoke-direct {v1, p0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$JavaScriptLocalObj$1;-><init>(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$JavaScriptLocalObj;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 208
    return-void
.end method
