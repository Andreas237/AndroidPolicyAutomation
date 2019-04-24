.class Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)V
    .locals 0

    .line 212
    iput-object p1, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$3;->b:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 3

    .line 215
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 216
    if-nez p1, :cond_0

    .line 217
    iget-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$3;->b:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/PressureMeasureDetailActivity;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto :goto_0

    .line 218
    :cond_0
    const v0, 0x186a1

    if-ne p1, v0, :cond_1

    .line 219
    iget-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$3;->b:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/PressureMeasure/NoDataActivity;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 221
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$3;->b:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;

    invoke-static {v0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->d(Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 222
    iget-object v0, p0, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity$3;->b:Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;

    invoke-virtual {v0}, Lcom/huawei/health/browseraction/HwSchemeBasicHealthActivity;->finish()V

    .line 223
    return-void
.end method
