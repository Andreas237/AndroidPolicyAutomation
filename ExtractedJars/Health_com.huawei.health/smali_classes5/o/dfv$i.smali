.class Lo/dfv$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dfv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "i"
.end annotation


# instance fields
.field b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/dfv;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lo/dfv;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 808
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 806
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dfv$i;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 809
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/dfv$i;->d:Ljava/lang/ref/WeakReference;

    .line 810
    iput-object p2, p0, Lo/dfv$i;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 811
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 815
    iget-object v0, p0, Lo/dfv$i;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/dfv;

    .line 816
    if-eqz v1, :cond_0

    .line 817
    iget-object v0, p0, Lo/dfv$i;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v1, v0}, Lo/dfv;->e(Lo/dfv;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 819
    :cond_0
    return-void
.end method
