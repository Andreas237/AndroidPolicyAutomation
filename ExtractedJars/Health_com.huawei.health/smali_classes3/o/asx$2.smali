.class Lo/asx$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/asx;->d(IJ)V
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
.field final synthetic b:I

.field final synthetic c:Lo/asx;

.field final synthetic d:J


# direct methods
.method constructor <init>(Lo/asx;JI)V
    .locals 0

    .line 80
    iput-object p1, p0, Lo/asx$2;->c:Lo/asx;

    iput-wide p2, p0, Lo/asx$2;->d:J

    iput p4, p0, Lo/asx$2;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 80
    invoke-virtual {p0, p1}, Lo/asx$2;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 12

    .line 85
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v6

    .line 86
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    iget-wide v1, p0, Lo/asx$2;->d:J

    invoke-virtual {v0, v1, v2}, Lo/atc;->b(J)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v8

    .line 87
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    iget-wide v1, p0, Lo/asx$2;->d:J

    invoke-virtual {v0, v1, v2, v6, v7}, Lo/ath;->e(JJ)Z

    move-result v9

    .line 89
    if-eqz v8, :cond_0

    invoke-virtual {v8}, Lcom/huawei/health/sns/model/group/Group;->getState()I

    move-result v0

    if-nez v0, :cond_0

    if-eqz v9, :cond_0

    .line 91
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    invoke-virtual {v0, v8}, Lo/ath;->d(Lcom/huawei/health/sns/model/group/Group;)Ljava/util/ArrayList;

    move-result-object v10

    .line 92
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/sns/model/group/Group;->setMemCount(I)V

    .line 93
    invoke-static {v10}, Lo/boz;->a(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v11

    .line 94
    iget-object v0, p0, Lo/asx$2;->c:Lo/asx;

    iget v1, p0, Lo/asx$2;->b:I

    invoke-virtual {v8}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8}, Lcom/huawei/health/sns/model/group/Group;->getMemCount()I

    move-result v3

    invoke-static {v0, v1, v2, v3, v11}, Lo/asx;->d(Lo/asx;ILjava/lang/String;ILjava/util/ArrayList;)V

    .line 95
    goto :goto_0

    .line 98
    :cond_0
    iget-object v0, p0, Lo/asx$2;->c:Lo/asx;

    iget v1, p0, Lo/asx$2;->b:I

    iget-wide v2, p0, Lo/asx$2;->d:J

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/asx;->d(IJZZ)V

    .line 100
    :goto_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
