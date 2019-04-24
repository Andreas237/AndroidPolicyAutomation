.class Lo/awj$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/awj;->b(Lo/awj$c;)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/awj;

.field final synthetic c:Lo/awj$c;


# direct methods
.method constructor <init>(Lo/awj;Lo/awj$c;)V
    .locals 0

    .line 292
    iput-object p1, p0, Lo/awj$1;->a:Lo/awj;

    iput-object p2, p0, Lo/awj$1;->c:Lo/awj$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 292
    invoke-virtual {p0, p1}, Lo/awj$1;->d(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Boolean;
    .locals 2

    .line 296
    iget-object v0, p0, Lo/awj$1;->a:Lo/awj;

    invoke-virtual {v0}, Lo/awj;->a()Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    move-result-object v1

    .line 297
    iget-object v0, p0, Lo/awj$1;->c:Lo/awj$c;

    if-eqz v0, :cond_0

    .line 299
    iget-object v0, p0, Lo/awj$1;->c:Lo/awj$c;

    invoke-interface {v0, v1}, Lo/awj$c;->d(Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;)V

    .line 301
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
