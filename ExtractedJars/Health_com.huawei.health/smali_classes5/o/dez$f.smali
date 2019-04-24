.class Lo/dez$f;
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
    name = "f"
.end annotation


# static fields
.field private static d:Ljava/lang/String;


# instance fields
.field b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/dez;>;"
        }
    .end annotation
.end field

.field c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 2225
    const-string v0, "syncDetailLock"

    sput-object v0, Lo/dez$f;->d:Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Lo/dez;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 2229
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2230
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/dez$f;->b:Ljava/lang/ref/WeakReference;

    .line 2231
    iput-object p2, p0, Lo/dez$f;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 2232
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 2236
    iget-object v0, p0, Lo/dez$f;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/dez;

    .line 2237
    if-eqz v3, :cond_0

    .line 2238
    iget-object v0, p0, Lo/dez$f;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v3, v0}, Lo/dez;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 2240
    :cond_0
    iget-object v0, p0, Lo/dez$f;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 2242
    :goto_0
    return-void
.end method
