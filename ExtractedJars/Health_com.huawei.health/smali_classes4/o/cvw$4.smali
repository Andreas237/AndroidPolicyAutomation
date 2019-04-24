.class Lo/cvw$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cvw;->a([B)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cvw;


# direct methods
.method constructor <init>(Lo/cvw;)V
    .locals 0

    .line 557
    iput-object p1, p0, Lo/cvw$4;->a:Lo/cvw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 560
    iget-object v0, p0, Lo/cvw$4;->a:Lo/cvw;

    invoke-virtual {v0}, Lo/cvw;->b()Ljava/util/List;

    move-result-object v3

    .line 561
    iget-object v0, p0, Lo/cvw$4;->a:Lo/cvw;

    iget-object v1, p0, Lo/cvw$4;->a:Lo/cvw;

    invoke-static {v1}, Lo/cvw;->c(Lo/cvw;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v3, v1, v2}, Lo/cvw;->d(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 562
    return-void
.end method
