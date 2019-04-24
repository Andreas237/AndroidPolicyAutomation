.class Lo/ark$1$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ark$1;->a()V
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
.field final synthetic a:Lo/ark$1;


# direct methods
.method constructor <init>(Lo/ark$1;)V
    .locals 0

    .line 142
    iput-object p1, p0, Lo/ark$1$4;->a:Lo/ark$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 142
    invoke-virtual {p0, p1}, Lo/ark$1$4;->d(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Boolean;
    .locals 5

    .line 147
    iget-object v0, p0, Lo/ark$1$4;->a:Lo/ark$1;

    iget-object v0, v0, Lo/ark$1;->a:Lo/ark;

    iget-object v1, p0, Lo/ark$1$4;->a:Lo/ark$1;

    iget-wide v1, v1, Lo/ark$1;->b:J

    invoke-static {v0, v1, v2}, Lo/ark;->c(Lo/ark;J)Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;

    move-result-object v3

    .line 148
    iget-object v0, p0, Lo/ark$1$4;->a:Lo/ark$1;

    iget-object v0, v0, Lo/ark$1;->a:Lo/ark;

    invoke-static {v0, v3}, Lo/ark;->e(Lo/ark;Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;)I

    move-result v4

    .line 149
    iget-object v0, p0, Lo/ark$1$4;->a:Lo/ark$1;

    iget-object v0, v0, Lo/ark$1;->a:Lo/ark;

    iget-object v1, p0, Lo/ark$1$4;->a:Lo/ark$1;

    iget-wide v1, v1, Lo/ark$1;->b:J

    invoke-static {v0, v1, v2, v4}, Lo/ark;->e(Lo/ark;JI)V

    .line 150
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
