.class final Lo/awm$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/awm;->d(J)Lo/brd;
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
.field final synthetic d:J


# direct methods
.method constructor <init>(J)V
    .locals 0

    .line 286
    iput-wide p1, p0, Lo/awm$1;->d:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 286
    invoke-virtual {p0, p1}, Lo/awm$1;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 5

    .line 291
    new-instance v3, Lcom/huawei/health/sns/model/user/UserNotify;

    invoke-direct {v3}, Lcom/huawei/health/sns/model/user/UserNotify;-><init>()V

    .line 292
    iget-wide v0, p0, Lo/awm$1;->d:J

    invoke-virtual {v3, v0, v1}, Lcom/huawei/health/sns/model/user/UserNotify;->setUserId(J)V

    .line 294
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-wide v1, p0, Lo/awm$1;->d:J

    invoke-virtual {v0, v1, v2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v4

    .line 296
    if-eqz v4, :cond_0

    .line 298
    const-string v0, ""

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/user/User;->setContactName(Ljava/lang/String;)V

    .line 299
    const-string v0, ""

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/user/User;->setContactSortPinYin(Ljava/lang/String;)V

    .line 300
    const-string v0, ""

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/model/user/User;->setPhoneNumber(Ljava/lang/String;)V

    .line 301
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/User;->buildSearchPinyin()V

    .line 302
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/axa;->a(Lcom/huawei/health/sns/model/user/User;)Z

    .line 305
    :cond_0
    invoke-static {}, Lo/axi;->d()Lo/axi;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/axi;->d(Lcom/huawei/health/sns/model/user/UserNotify;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
