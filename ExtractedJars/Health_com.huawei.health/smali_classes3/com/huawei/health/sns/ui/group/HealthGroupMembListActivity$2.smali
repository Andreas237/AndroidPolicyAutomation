.class Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bhk$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;)V
    .locals 0

    .line 219
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$2;->b:Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e()V
    .locals 4

    .line 222
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$2;->b:Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->a(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;)Lo/bhk;

    move-result-object v0

    invoke-virtual {v0}, Lo/bhk;->e()Ljava/util/List;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/ArrayList;

    .line 223
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 224
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$2;->b:Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->e(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;)Lo/emr;

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

    .line 227
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$2;->b:Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->e(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;)Lo/emr;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->ic_appbar_confirm_dissable:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 230
    :goto_0
    return-void
.end method
