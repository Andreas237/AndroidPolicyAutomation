.class Lo/cwi$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/health/suggestion/model/fitness/IResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cwi;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cwi;

.field final synthetic e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method constructor <init>(Lo/cwi;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 1036
    iput-object p1, p0, Lo/cwi$3;->c:Lo/cwi;

    iput-object p2, p0, Lo/cwi$3;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/Object;)V
    .locals 2

    .line 1038
    iget-object v0, p0, Lo/cwi$3;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1039
    iget-object v0, p0, Lo/cwi$3;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, p1, p2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1041
    :cond_0
    return-void
.end method
