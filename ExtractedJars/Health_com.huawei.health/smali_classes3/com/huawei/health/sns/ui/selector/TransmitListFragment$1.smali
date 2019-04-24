.class Lcom/huawei/health/sns/ui/selector/TransmitListFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bjw;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->a(Landroid/app/Activity;Ljava/util/ArrayList;Lo/axv;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/axv;

.field final synthetic d:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/selector/TransmitListFragment;Lo/axv;)V
    .locals 0

    .line 712
    iput-object p1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$1;->d:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$1;->b:Lo/axv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 722
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$1;->d:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->c()V

    .line 723
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 4

    .line 716
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$1;->d:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$1;->b:Lo/axv;

    invoke-virtual {v1}, Lo/axv;->b()J

    move-result-wide v1

    iget-object v3, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$1;->b:Lo/axv;

    invoke-virtual {v3}, Lo/axv;->f()I

    move-result v3

    invoke-static {v0, v1, v2, v3, p1}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->a(Lcom/huawei/health/sns/ui/selector/TransmitListFragment;JILjava/lang/String;)V

    .line 717
    return-void
.end method
