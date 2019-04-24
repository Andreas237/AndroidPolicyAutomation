.class Lo/arg$4$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/arg$4;->e(II)V
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
.field final synthetic c:Lo/arg$4;


# direct methods
.method constructor <init>(Lo/arg$4;)V
    .locals 0

    .line 248
    iput-object p1, p0, Lo/arg$4$1;->c:Lo/arg$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 248
    invoke-virtual {p0, p1}, Lo/arg$4$1;->d(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Boolean;
    .locals 2

    .line 253
    iget-object v0, p0, Lo/arg$4$1;->c:Lo/arg$4;

    iget-object v0, v0, Lo/arg$4;->c:Lo/arg;

    iget-object v1, p0, Lo/arg$4$1;->c:Lo/arg$4;

    iget-object v1, v1, Lo/arg$4;->b:Lcom/huawei/health/sns/model/user/User;

    invoke-static {v0, v1}, Lo/arg;->b(Lo/arg;Lcom/huawei/health/sns/model/user/User;)V

    .line 254
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
