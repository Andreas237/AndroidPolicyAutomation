.class Lo/ddx$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ddf;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ddx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ddx;


# direct methods
.method constructor <init>(Lo/ddx;)V
    .locals 0

    .line 867
    iput-object p1, p0, Lo/ddx$1;->b:Lo/ddx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 877
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "otaStatusCallback  onFailure, err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 878
    iget-object v0, p0, Lo/ddx$1;->b:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->f(Lo/ddx;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ddx$1;->b:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->c(Lo/ddx;)Lo/yc;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 879
    iget-object v0, p0, Lo/ddx$1;->b:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->c(Lo/ddx;)Lo/yc;

    move-result-object v0

    iget-object v1, p0, Lo/ddx$1;->b:Lo/ddx;

    invoke-static {v1}, Lo/ddx;->d(Lo/ddx;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1, p2}, Lo/yc;->b(Ljava/lang/String;ILjava/lang/String;)V

    .line 880
    iget-object v0, p0, Lo/ddx$1;->b:Lo/ddx;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ddx;->e(Lo/ddx;I)I

    .line 881
    iget-object v0, p0, Lo/ddx$1;->b:Lo/ddx;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ddx;->c(Lo/ddx;Z)Z

    .line 883
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 5

    .line 870
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "otaStatusCallback is onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 871
    move-object v4, p1

    check-cast v4, Lo/daj;

    .line 872
    iget-object v0, p0, Lo/ddx$1;->b:Lo/ddx;

    invoke-static {v0, v4}, Lo/ddx;->b(Lo/ddx;Lo/daj;)V

    .line 873
    return-void
.end method
