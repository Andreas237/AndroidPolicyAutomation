.class Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/boj$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->c(Lcom/huawei/health/sns/model/group/GroupMember;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;

.field final synthetic c:Lcom/huawei/health/sns/model/group/GroupMember;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;Lcom/huawei/health/sns/model/group/GroupMember;)V
    .locals 0

    .line 1346
    iput-object p1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$10;->b:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$10;->c:Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    .line 1351
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$10;->b:Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment$10;->c:Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;->a(Lcom/huawei/health/sns/ui/groupstoredemo/GroupFragment;Lcom/huawei/health/sns/model/group/GroupMember;)V

    .line 1352
    return-void
.end method

.method public d()V
    .locals 0

    .line 1357
    return-void
.end method
