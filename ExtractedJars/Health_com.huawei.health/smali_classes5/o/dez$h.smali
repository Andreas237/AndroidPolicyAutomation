.class Lo/dez$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dez;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "h"
.end annotation


# instance fields
.field a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/dez;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lo/dez;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 1329
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1327
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dez$h;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 1330
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/dez$h;->d:Ljava/lang/ref/WeakReference;

    .line 1331
    iput-object p2, p0, Lo/dez$h;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 1332
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1336
    iget-object v0, p0, Lo/dez$h;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/dez;

    .line 1337
    if-eqz v1, :cond_0

    .line 1338
    iget-object v0, p0, Lo/dez$h;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v1, v0}, Lo/dez;->c(Lo/dez;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1340
    :cond_0
    return-void
.end method
