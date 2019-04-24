.class Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bjw;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->e(Lcom/huawei/health/sns/model/group/Group;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;

.field final synthetic b:Lcom/huawei/health/sns/model/group/Group;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;Lcom/huawei/health/sns/model/group/Group;)V
    .locals 0

    .line 812
    iput-object p1, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$5;->a:Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$5;->b:Lcom/huawei/health/sns/model/group/Group;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 822
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$5;->a:Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->e()V

    .line 823
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 3

    .line 816
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$5;->a:Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$5;->b:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {v0, v1, v2, p1}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->a(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;JLjava/lang/String;)V

    .line 817
    return-void
.end method
