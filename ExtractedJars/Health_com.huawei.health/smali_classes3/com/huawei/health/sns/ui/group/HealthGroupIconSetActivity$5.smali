.class Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity$5;->a:Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 80
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity$5;->a:Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;

    const-class v1, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 81
    const-string v0, "group"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity$5;->a:Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->d(Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 82
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity$5;->a:Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;

    invoke-virtual {v0, v2}, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->startActivity(Landroid/content/Intent;)V

    .line 83
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity$5;->a:Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupIconSetActivity;->finish()V

    .line 84
    return-void
.end method
