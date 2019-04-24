.class Lo/cvu$18;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cvu;->notifyAfterTransferFile(Ljava/util/List;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cvu;


# direct methods
.method constructor <init>(Lo/cvu;)V
    .locals 0

    .line 587
    iput-object p1, p0, Lo/cvu$18;->c:Lo/cvu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 3

    .line 590
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 591
    iget-object v0, p0, Lo/cvu$18;->c:Lo/cvu;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cvu;->d(Lo/cvu;Z)Z

    goto :goto_0

    .line 593
    :cond_0
    iget-object v0, p0, Lo/cvu$18;->c:Lo/cvu;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cvu;->d(Lo/cvu;Z)Z

    .line 595
    :goto_0
    iget-object v0, p0, Lo/cvu$18;->c:Lo/cvu;

    const-string v1, "notifyAfterTransferFile"

    invoke-static {}, Lo/cvu;->h()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/cvu;->c(Lo/cvu;Ljava/lang/String;Ljava/lang/Object;)V

    .line 596
    return-void
.end method
