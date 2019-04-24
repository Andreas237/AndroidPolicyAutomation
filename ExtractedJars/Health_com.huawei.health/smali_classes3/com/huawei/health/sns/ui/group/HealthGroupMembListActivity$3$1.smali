.class Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$3$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$3;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/util/ArrayList;

.field final synthetic e:Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$3;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$3;Ljava/util/ArrayList;)V
    .locals 0

    .line 248
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$3$1;->e:Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$3;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$3$1;->b:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 251
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$3$1;->e:Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$3;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$3;->c:Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity$3$1;->b:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;->a(Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;Ljava/util/ArrayList;)V

    .line 252
    return-void
.end method
