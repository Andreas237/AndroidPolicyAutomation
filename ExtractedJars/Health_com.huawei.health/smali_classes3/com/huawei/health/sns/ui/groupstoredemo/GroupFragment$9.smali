.class Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/boj$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)V
    .locals 0

    .line 1382
    iput-object p1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$9;->a:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(I)V
    .locals 2

    .line 1387
    if-nez p1, :cond_0

    .line 1389
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$9;->a:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->e(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;)V

    goto :goto_0

    .line 1392
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 1394
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$9;->a:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->b(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;Z)V

    goto :goto_0

    .line 1397
    :cond_1
    const/4 v0, 0x2

    if-ne p1, v0, :cond_2

    .line 1399
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$9;->a:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->b(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;Z)V

    .line 1401
    :cond_2
    :goto_0
    return-void
.end method
