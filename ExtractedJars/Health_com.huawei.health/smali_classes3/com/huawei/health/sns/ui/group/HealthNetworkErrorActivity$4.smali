.class Lcom/huawei/health/sns/ui/group/HealthNetworkErrorActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthNetworkErrorActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/group/HealthNetworkErrorActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthNetworkErrorActivity;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthNetworkErrorActivity$4;->c:Lcom/huawei/health/sns/ui/group/HealthNetworkErrorActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 48
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthNetworkErrorActivity$4;->c:Lcom/huawei/health/sns/ui/group/HealthNetworkErrorActivity;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.settings.WIRELESS_SETTINGS"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthNetworkErrorActivity;->startActivity(Landroid/content/Intent;)V

    .line 50
    return-void
.end method
