.class final Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->c(Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;J)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;

.field final synthetic e:J


# direct methods
.method constructor <init>(JLcom/huawei/health/sns/ui/selector/GroupSelectorActivity;)V
    .locals 0

    .line 879
    iput-wide p1, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$4;->e:J

    iput-object p3, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$4;->b:Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 879
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$4;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 5

    .line 883
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$4;->e:J

    invoke-virtual {v0, v1, v2}, Lo/ath;->b(J)Ljava/util/ArrayList;

    move-result-object v3

    .line 884
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_0

    .line 886
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 887
    const-string v0, "groupMemberList"

    invoke-virtual {v4, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 888
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$4;->b:Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;

    const/4 v1, -0x1

    invoke-virtual {v0, v1, v4}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->setResult(ILandroid/content/Intent;)V

    .line 890
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity$4;->b:Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/selector/GroupSelectorActivity;->finish()V

    .line 891
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
