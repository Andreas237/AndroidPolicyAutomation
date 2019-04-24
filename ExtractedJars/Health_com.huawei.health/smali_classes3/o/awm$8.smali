.class final Lo/awm$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/awm;->b(Landroid/content/Context;Lo/awm$d;Lo/bio;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/awm$d;

.field final synthetic c:Landroid/content/Context;

.field final synthetic e:Lo/bio;


# direct methods
.method constructor <init>(Landroid/content/Context;Lo/awm$d;Lo/bio;)V
    .locals 0

    .line 534
    iput-object p1, p0, Lo/awm$8;->c:Landroid/content/Context;

    iput-object p2, p0, Lo/awm$8;->b:Lo/awm$d;

    iput-object p3, p0, Lo/awm$8;->e:Lo/bio;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public notifyResult(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 2

    .line 538
    iget-object v0, p0, Lo/awm$8;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/awm$8;->b:Lo/awm$d;

    invoke-static {v0, v1, p1, p2}, Lo/awm;->e(Landroid/content/Context;Lo/awm$d;Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    .line 539
    iget-object v0, p0, Lo/awm$8;->e:Lo/bio;

    if-eqz v0, :cond_0

    .line 541
    iget-object v0, p0, Lo/awm$8;->e:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 543
    :cond_0
    return-void
.end method
