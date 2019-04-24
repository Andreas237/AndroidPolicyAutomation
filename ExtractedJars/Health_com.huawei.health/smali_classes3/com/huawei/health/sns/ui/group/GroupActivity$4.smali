.class Lcom/huawei/health/sns/ui/group/GroupActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brc;


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
        "Ljava/lang/Object;Lo/brc<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/group/GroupActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/GroupActivity;)V
    .locals 0

    .line 458
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/GroupActivity$4;->c:Lcom/huawei/health/sns/ui/group/GroupActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/bqy;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bqy<Ljava/lang/Boolean;>;)V"
        }
    .end annotation

    .line 462
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupActivity$4;->c:Lcom/huawei/health/sns/ui/group/GroupActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/GroupActivity;->f(Lcom/huawei/health/sns/ui/group/GroupActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x98

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 463
    return-void
.end method
