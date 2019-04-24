.class Lo/cvu$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cvu;->obtainCardList()Ljava/util/List;
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

    .line 675
    iput-object p1, p0, Lo/cvu$5;->c:Lo/cvu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 3

    .line 678
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 679
    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_1

    .line 680
    iget-object v0, p0, Lo/cvu$5;->c:Lo/cvu;

    move-object v1, p2

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1}, Lo/cvu;->d(Lo/cvu;Ljava/util/List;)Ljava/util/List;

    goto :goto_0

    .line 683
    :cond_0
    iget-object v0, p0, Lo/cvu$5;->c:Lo/cvu;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cvu;->d(Lo/cvu;Ljava/util/List;)Ljava/util/List;

    .line 685
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/cvu$5;->c:Lo/cvu;

    const-string v1, "obtainCardList"

    invoke-static {}, Lo/cvu;->i()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/cvu;->c(Lo/cvu;Ljava/lang/String;Ljava/lang/Object;)V

    .line 686
    return-void
.end method
