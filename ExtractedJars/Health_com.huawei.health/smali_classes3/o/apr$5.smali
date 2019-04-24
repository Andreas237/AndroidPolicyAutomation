.class final Lo/apr$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/apr;->d(JZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic b:Z

.field final synthetic c:J


# direct methods
.method constructor <init>(JZ)V
    .locals 0

    .line 53
    iput-wide p1, p0, Lo/apr$5;->c:J

    iput-boolean p3, p0, Lo/apr$5;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 58
    new-instance v2, Lo/atb;

    const/4 v0, 0x0

    invoke-direct {v2, v0}, Lo/atb;-><init>(Landroid/os/Handler;)V

    .line 59
    iget-wide v0, p0, Lo/apr$5;->c:J

    invoke-virtual {v2, v0, v1}, Lo/atb;->d(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v3

    .line 60
    if-eqz v3, :cond_1

    .line 62
    iget-boolean v0, p0, Lo/apr$5;->b:Z

    if-eqz v0, :cond_0

    .line 64
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/group/Group;->setDisturbMode(I)V

    .line 65
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/group/Group;->setState(I)V

    .line 67
    :cond_0
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/atc;->e(Lcom/huawei/health/sns/model/group/Group;)Z

    .line 69
    :cond_1
    return-void
.end method

.method public e(II)V
    .locals 0

    .line 74
    return-void
.end method
