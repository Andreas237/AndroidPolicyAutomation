.class final Lo/bkw$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bkw;->a(Lcom/huawei/health/sns/model/user/UserNotify;)Lo/brd;
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
.field final synthetic c:Lcom/huawei/health/sns/model/user/UserNotify;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/model/user/UserNotify;)V
    .locals 0

    .line 242
    iput-object p1, p0, Lo/bkw$4;->c:Lcom/huawei/health/sns/model/user/UserNotify;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 242
    invoke-virtual {p0, p1}, Lo/bkw$4;->b(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Boolean;
    .locals 2

    .line 246
    iget-object v0, p0, Lo/bkw$4;->c:Lcom/huawei/health/sns/model/user/UserNotify;

    sget-object v1, Lcom/huawei/health/sns/model/user/UserNotify$b;->i:Lcom/huawei/health/sns/model/user/UserNotify$b;

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/user/UserNotify;->setType(Lcom/huawei/health/sns/model/user/UserNotify$b;)V

    .line 248
    invoke-static {}, Lo/axi;->d()Lo/axi;

    move-result-object v0

    iget-object v1, p0, Lo/bkw$4;->c:Lcom/huawei/health/sns/model/user/UserNotify;

    invoke-virtual {v0, v1}, Lo/axi;->e(Lcom/huawei/health/sns/model/user/UserNotify;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
