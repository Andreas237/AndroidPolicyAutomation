.class Lcom/huawei/health/sns/ui/group/GroupActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/GroupActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/ui/group/GroupActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/GroupActivity;)V
    .locals 0

    .line 449
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/GroupActivity$5;->e:Lcom/huawei/health/sns/ui/group/GroupActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 449
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/group/GroupActivity$5;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 2

    .line 453
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity$5;->e:Lcom/huawei/health/sns/ui/group/GroupActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupActivity$5;->e:Lcom/huawei/health/sns/ui/group/GroupActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/GroupActivity;->g(Lcom/huawei/health/sns/ui/group/GroupActivity;)Z

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/GroupActivity;->e(Lcom/huawei/health/sns/ui/group/GroupActivity;Z)Z

    .line 454
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity$5;->e:Lcom/huawei/health/sns/ui/group/GroupActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupActivity$5;->e:Lcom/huawei/health/sns/ui/group/GroupActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/GroupActivity;->h(Lcom/huawei/health/sns/ui/group/GroupActivity;)Z

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/group/GroupActivity;->b(Lcom/huawei/health/sns/ui/group/GroupActivity;Z)Z

    .line 455
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
