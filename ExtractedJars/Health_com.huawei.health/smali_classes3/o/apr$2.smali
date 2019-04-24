.class final Lo/apr$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/apr;->b(JZ)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Void;>;"
    }
.end annotation


# instance fields
.field final synthetic c:J

.field final synthetic d:Z


# direct methods
.method constructor <init>(JZ)V
    .locals 0

    .line 124
    iput-wide p1, p0, Lo/apr$2;->c:J

    iput-boolean p3, p0, Lo/apr$2;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 124
    invoke-virtual {p0, p1}, Lo/apr$2;->b(Lo/bra;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Void;
    .locals 4

    .line 128
    invoke-interface {p1}, Lo/bra;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 130
    iget-wide v0, p0, Lo/apr$2;->c:J

    iget-boolean v2, p0, Lo/apr$2;->d:Z

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/apr;->c(JZZ)Lcom/huawei/health/sns/model/group/Group;

    .line 132
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
