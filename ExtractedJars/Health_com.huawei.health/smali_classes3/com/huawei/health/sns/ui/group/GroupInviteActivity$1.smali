.class Lcom/huawei/health/sns/ui/group/GroupInviteActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/group/GroupInviteActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/GroupInviteActivity;)V
    .locals 0

    .line 220
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity$1;->d:Lcom/huawei/health/sns/ui/group/GroupInviteActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 225
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity$1;->d:Lcom/huawei/health/sns/ui/group/GroupInviteActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupInviteActivity$1;->d:Lcom/huawei/health/sns/ui/group/GroupInviteActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->a(Lcom/huawei/health/sns/ui/group/GroupInviteActivity;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/TextView;->getLineCount()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/GroupInviteActivity;->c(Lcom/huawei/health/sns/ui/group/GroupInviteActivity;I)V

    .line 226
    return-void
.end method
