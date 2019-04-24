.class Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$JavaScriptLocalObj$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$JavaScriptLocalObj;->intoApp(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$JavaScriptLocalObj;


# direct methods
.method constructor <init>(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$JavaScriptLocalObj;)V
    .locals 0

    .line 201
    iput-object p1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$JavaScriptLocalObj$1;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$JavaScriptLocalObj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 204
    const-string v0, "CloudActivity"

    const-string v1, "intoApp finish CloudAccountCenterActivity"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$JavaScriptLocalObj$1;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$JavaScriptLocalObj;

    iget-object v0, v0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$JavaScriptLocalObj;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-virtual {v0}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->finish()V

    .line 206
    return-void
.end method
