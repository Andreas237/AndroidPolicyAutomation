.class Lo/bkb$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bkb;->c()V
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
.field final synthetic b:Lo/bkb;


# direct methods
.method constructor <init>(Lo/bkb;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lo/bkb$1;->b:Lo/bkb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 61
    invoke-virtual {p0, p1}, Lo/bkb$1;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 4

    .line 65
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    iget-object v1, p0, Lo/bkb$1;->b:Lo/bkb;

    invoke-static {v1}, Lo/bkb;->a(Lo/bkb;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v3

    .line 66
    iget-object v0, p0, Lo/bkb$1;->b:Lo/bkb;

    invoke-static {v0, v3}, Lo/bkb;->d(Lo/bkb;Lcom/huawei/health/sns/model/group/Group;)V

    .line 67
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
