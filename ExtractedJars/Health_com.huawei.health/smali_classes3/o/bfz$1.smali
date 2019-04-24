.class Lo/bfz$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bfz;->b(J)V
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
.field final synthetic a:Lo/bfz;


# direct methods
.method constructor <init>(Lo/bfz;)V
    .locals 0

    .line 283
    iput-object p1, p0, Lo/bfz$1;->a:Lo/bfz;

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

    .line 287
    invoke-interface {p1}, Lo/bqy;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bfz$1;->a:Lo/bfz;

    invoke-static {v0}, Lo/bfz;->a(Lo/bfz;)Lo/bfh;

    move-result-object v0

    instance-of v0, v0, Lcom/huawei/health/sns/model/user/User;

    if-eqz v0, :cond_0

    .line 289
    iget-object v0, p0, Lo/bfz$1;->a:Lo/bfz;

    invoke-static {v0}, Lo/bfz;->b(Lo/bfz;)Lo/bfh;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/model/user/User;

    .line 290
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/model/user/User;->setIsFriend(I)V

    .line 292
    iget-object v0, p0, Lo/bfz$1;->a:Lo/bfz;

    invoke-static {v0, v1}, Lo/bfz;->b(Lo/bfz;Lcom/huawei/health/sns/model/user/User;)V

    .line 294
    :cond_0
    return-void
.end method
