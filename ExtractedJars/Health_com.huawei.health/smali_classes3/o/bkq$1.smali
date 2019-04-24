.class final Lo/bkq$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bkq;->b(Lcom/huawei/health/sns/model/user/UserNotify;)Lo/brd;
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
.field final synthetic e:Lcom/huawei/health/sns/model/user/UserNotify;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/model/user/UserNotify;)V
    .locals 0

    .line 175
    iput-object p1, p0, Lo/bkq$1;->e:Lcom/huawei/health/sns/model/user/UserNotify;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 175
    invoke-virtual {p0, p1}, Lo/bkq$1;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 2

    .line 180
    invoke-static {}, Lo/axi;->d()Lo/axi;

    move-result-object v0

    iget-object v1, p0, Lo/bkq$1;->e:Lcom/huawei/health/sns/model/user/UserNotify;

    invoke-virtual {v0, v1}, Lo/axi;->d(Lcom/huawei/health/sns/model/user/UserNotify;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
