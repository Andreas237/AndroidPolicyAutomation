.class Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;)V
    .locals 0

    .line 417
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$6;->c:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 420
    const-string v0, "Group_HealthCreateGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setNegativeButton"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 421
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity$6;->c:Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/HealthCreateGroupActivity;->finish()V

    .line 422
    return-void
.end method
