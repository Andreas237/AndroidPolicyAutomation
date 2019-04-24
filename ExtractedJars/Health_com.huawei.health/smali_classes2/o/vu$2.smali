.class Lo/vu$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/wo;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/vu;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/vu;


# direct methods
.method constructor <init>(Lo/vu;)V
    .locals 0

    .line 572
    iput-object p1, p0, Lo/vu$2;->d:Lo/vu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 575
    iget-object v0, p0, Lo/vu$2;->d:Lo/vu;

    invoke-static {v0}, Lo/vu;->c(Lo/vu;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 577
    return-void
.end method

.method public b()V
    .locals 0

    .line 587
    return-void
.end method

.method public d(ILjava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 592
    return-void
.end method

.method public e()V
    .locals 4

    .line 581
    iget-object v0, p0, Lo/vu$2;->d:Lo/vu;

    invoke-static {v0}, Lo/vu;->c(Lo/vu;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onFailure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 582
    return-void
.end method
