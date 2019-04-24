.class Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bil$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;)V
    .locals 0

    .line 112
    iput-object p1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity$4;->d:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 4

    .line 115
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity$4;->d:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->b(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;)Lo/bil;

    move-result-object v0

    invoke-virtual {v0}, Lo/bil;->e()Ljava/util/List;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/ArrayList;

    .line 116
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 117
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity$4;->d:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->d(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;)Lo/emr;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->ic_appbar_confirm:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 119
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity$4;->d:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->d(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;)Lo/emr;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->ic_appbar_confirm_dissable:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 121
    :goto_0
    return-void
.end method
