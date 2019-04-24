.class Lo/dlz$14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlz;->a(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic d:Lo/dlz;


# direct methods
.method constructor <init>(Lo/dlz;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 260
    iput-object p1, p0, Lo/dlz$14;->d:Lo/dlz;

    iput-object p2, p0, Lo/dlz$14;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 263
    move-object v2, p2

    check-cast v2, Ljava/util/List;

    .line 264
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 265
    if-eqz v2, :cond_0

    .line 266
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 268
    :cond_0
    iget-object v0, p0, Lo/dlz$14;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v3}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 269
    return-void
.end method
