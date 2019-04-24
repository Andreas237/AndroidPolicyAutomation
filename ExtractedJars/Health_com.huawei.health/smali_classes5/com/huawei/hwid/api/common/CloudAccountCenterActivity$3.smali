.class Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;


# direct methods
.method constructor <init>(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;)V
    .locals 0

    .line 350
    iput-object p1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$3;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 2

    .line 353
    const-string v0, "CloudActivity"

    const-string v1, "dialog cancel"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 354
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$3;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;Landroid/net/Uri;)V

    .line 355
    return-void
.end method
