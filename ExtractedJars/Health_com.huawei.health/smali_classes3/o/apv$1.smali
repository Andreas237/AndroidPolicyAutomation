.class final Lo/apv$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/apv;->a(Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/model/chat/MessageItem;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/model/chat/MessageItem;

.field final synthetic e:Lcom/huawei/health/sns/model/group/Group;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 0

    .line 497
    iput-object p1, p0, Lo/apv$1;->e:Lcom/huawei/health/sns/model/group/Group;

    iput-object p2, p0, Lo/apv$1;->b:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 501
    new-instance v0, Lo/atv;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/atv;-><init>(Landroid/os/Handler;)V

    iget-object v1, p0, Lo/apv$1;->e:Lcom/huawei/health/sns/model/group/Group;

    iget-object v2, p0, Lo/apv$1;->b:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0, v1, v2}, Lo/atv;->b(Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 502
    return-void
.end method

.method public e(II)V
    .locals 0

    .line 507
    return-void
.end method
