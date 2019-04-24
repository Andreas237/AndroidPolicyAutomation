.class Lo/ddx$5;
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
.field final synthetic d:Lo/ddx;


# direct methods
.method constructor <init>(Lo/ddx;)V
    .locals 0

    .line 1018
    iput-object p1, p0, Lo/ddx$5;->d:Lo/ddx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 2

    .line 1041
    iget-object v0, p0, Lo/ddx$5;->d:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->f(Lo/ddx;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ddx$5;->d:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->c(Lo/ddx;)Lo/yc;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1042
    iget-object v0, p0, Lo/ddx$5;->d:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->c(Lo/ddx;)Lo/yc;

    move-result-object v0

    iget-object v1, p0, Lo/ddx$5;->d:Lo/ddx;

    invoke-static {v1}, Lo/ddx;->d(Lo/ddx;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1, p2}, Lo/yc;->b(Ljava/lang/String;ILjava/lang/String;)V

    .line 1043
    iget-object v0, p0, Lo/ddx$5;->d:Lo/ddx;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ddx;->e(Lo/ddx;I)I

    .line 1044
    iget-object v0, p0, Lo/ddx$5;->d:Lo/ddx;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ddx;->c(Lo/ddx;Z)Z

    .line 1046
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 5

    .line 1022
    iget-object v0, p0, Lo/ddx$5;->d:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->h(Lo/ddx;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 1023
    iget-object v0, p0, Lo/ddx$5;->d:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->h(Lo/ddx;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 1025
    iget-object v0, p0, Lo/ddx$5;->d:Lo/ddx;

    iget-object v1, p0, Lo/ddx$5;->d:Lo/ddx;

    invoke-static {v1}, Lo/ddx;->h(Lo/ddx;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/ddx;->c(Lo/ddx;IZ)V

    .line 1026
    iget-object v0, p0, Lo/ddx$5;->d:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->h(Lo/ddx;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_0

    .line 1028
    :cond_0
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mIsStartOtaCallback,mErrorPackages.size != 0 , mErrorPackages.size= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/ddx$5;->d:Lo/ddx;

    invoke-static {v3}, Lo/ddx;->h(Lo/ddx;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1029
    iget-object v0, p0, Lo/ddx$5;->d:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->h(Lo/ddx;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 1030
    iget-object v0, p0, Lo/ddx$5;->d:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->h(Lo/ddx;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1031
    iget-object v0, p0, Lo/ddx$5;->d:Lo/ddx;

    const/4 v1, 0x0

    invoke-static {v0, v4, v1}, Lo/ddx;->c(Lo/ddx;IZ)V

    .line 1032
    goto :goto_0

    .line 1034
    :cond_1
    iget-object v0, p0, Lo/ddx$5;->d:Lo/ddx;

    iget-object v1, p0, Lo/ddx$5;->d:Lo/ddx;

    invoke-static {v1}, Lo/ddx;->i(Lo/ddx;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/ddx;->c(Lo/ddx;IZ)V

    .line 1036
    :goto_0
    return-void
.end method
