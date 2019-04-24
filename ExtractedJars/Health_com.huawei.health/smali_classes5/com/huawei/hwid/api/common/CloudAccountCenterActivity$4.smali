.class Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwid/UseCase$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->b(Landroid/net/Uri;)V
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

    .line 411
    iput-object p1, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$4;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 2

    .line 414
    const-string v0, "request_pic_uri_tag"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/net/Uri;

    .line 415
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$4;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    invoke-static {v0, v1}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;Landroid/net/Uri;)V

    .line 416
    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 2

    .line 420
    iget-object v0, p0, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity$4;->a:Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;->a(Lcom/huawei/hwid/api/common/CloudAccountCenterActivity;Landroid/net/Uri;)V

    .line 421
    return-void
.end method
