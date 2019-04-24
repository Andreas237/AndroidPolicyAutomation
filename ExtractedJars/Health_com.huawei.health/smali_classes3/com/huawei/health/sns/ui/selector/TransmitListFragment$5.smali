.class Lcom/huawei/health/sns/ui/selector/TransmitListFragment$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bjw;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->c(Landroid/app/Activity;Ljava/util/ArrayList;Lo/axv;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Ljava/util/ArrayList;

.field final synthetic d:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

.field final synthetic e:Lo/axv;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/selector/TransmitListFragment;Lo/axv;Ljava/util/ArrayList;)V
    .locals 0

    .line 798
    iput-object p1, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$5;->d:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$5;->e:Lo/axv;

    iput-object p3, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$5;->c:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 811
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$5;->d:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->c()V

    .line 812
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 10

    .line 802
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$5;->e:Lo/axv;

    invoke-virtual {v0}, Lo/axv;->b()J

    move-result-wide v6

    .line 803
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$5;->e:Lo/axv;

    invoke-virtual {v0}, Lo/axv;->f()I

    move-result v8

    .line 804
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$5;->c:Ljava/util/ArrayList;

    invoke-static {v0}, Lo/bfg;->e(Ljava/util/ArrayList;)[Ljava/lang/String;

    move-result-object v9

    .line 805
    iget-object v0, p0, Lcom/huawei/health/sns/ui/selector/TransmitListFragment$5;->d:Lcom/huawei/health/sns/ui/selector/TransmitListFragment;

    move-wide v1, v6

    move v3, v8

    move-object v4, p1

    move-object v5, v9

    invoke-static/range {v0 .. v5}, Lcom/huawei/health/sns/ui/selector/TransmitListFragment;->e(Lcom/huawei/health/sns/ui/selector/TransmitListFragment;JILjava/lang/String;[Ljava/lang/String;)V

    .line 806
    return-void
.end method
