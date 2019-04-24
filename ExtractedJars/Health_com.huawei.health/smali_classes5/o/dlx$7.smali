.class Lo/dlx$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlx;->e(Landroid/os/Handler;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Landroid/os/Handler;

.field final synthetic e:Lo/dlx;


# direct methods
.method constructor <init>(Lo/dlx;Landroid/os/Handler;)V
    .locals 0

    .line 446
    iput-object p1, p0, Lo/dlx$7;->e:Lo/dlx;

    iput-object p2, p0, Lo/dlx$7;->c:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 449
    iget-object v0, p0, Lo/dlx$7;->e:Lo/dlx;

    new-instance v1, Lo/dlx$7$5;

    invoke-direct {v1, p0}, Lo/dlx$7$5;-><init>(Lo/dlx$7;)V

    invoke-static {v0, v1}, Lo/dlx;->d(Lo/dlx;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 462
    return-void
.end method
