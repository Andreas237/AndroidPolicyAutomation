.class Lo/dde$18;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dde;->J()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dde;


# direct methods
.method constructor <init>(Lo/dde;)V
    .locals 0

    .line 3323
    iput-object p1, p0, Lo/dde$18;->b:Lo/dde;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 6

    .line 3326
    const/4 v3, 0x0

    .line 3327
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 3328
    move-object v4, p2

    check-cast v4, Ljava/lang/String;

    .line 3329
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 3330
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 3331
    const/4 v0, 0x1

    if-ne v0, v5, :cond_0

    .line 3332
    const/4 v3, 0x1

    goto :goto_0

    .line 3334
    :cond_0
    const/4 v3, 0x0

    .line 3338
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/dde$18;->b:Lo/dde;

    iget-object v1, p0, Lo/dde$18;->b:Lo/dde;

    invoke-static {v1}, Lo/dde;->b(Lo/dde;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v3, v1, v2}, Lo/dde;->c(ZLcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 3339
    return-void
.end method
