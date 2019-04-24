.class Lo/arm$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/arm;->c(IJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brc<Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/UserNotifyNote;>;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lo/arm;

.field final synthetic c:I


# direct methods
.method constructor <init>(Lo/arm;I)V
    .locals 0

    .line 85
    iput-object p1, p0, Lo/arm$5;->b:Lo/arm;

    iput p2, p0, Lo/arm$5;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/bqy;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bqy<Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/UserNotifyNote;>;>;)V"
        }
    .end annotation

    .line 89
    invoke-interface {p1}, Lo/bqy;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/ArrayList;

    .line 90
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 92
    iget-object v0, p0, Lo/arm$5;->b:Lo/arm;

    invoke-static {v0, v3}, Lo/arm;->a(Lo/arm;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v4

    .line 93
    iget-object v0, p0, Lo/arm$5;->b:Lo/arm;

    iget v1, p0, Lo/arm$5;->c:I

    const-string v2, "bundleKeyRecordInviteList"

    invoke-static {v0, v4, v1, v2}, Lo/arm;->b(Lo/arm;Ljava/util/ArrayList;ILjava/lang/String;)V

    .line 95
    :cond_0
    return-void
.end method
