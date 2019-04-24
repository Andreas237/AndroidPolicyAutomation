.class Lo/dms$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dms;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic c:Lo/dms;


# direct methods
.method constructor <init>(Lo/dms;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 197
    iput-object p1, p0, Lo/dms$a;->c:Lo/dms;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 198
    iput-object p2, p0, Lo/dms$a;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 199
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 203
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter syncStressDetailDataRunnable run !!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    iget-object v0, p0, Lo/dms$a;->c:Lo/dms;

    iget-object v1, p0, Lo/dms$a;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v0, v1}, Lo/dms;->c(Lo/dms;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 205
    return-void
.end method
