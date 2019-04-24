.class Lo/cvu$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cvu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/cvu;


# direct methods
.method constructor <init>(Lo/cvu;)V
    .locals 0

    .line 316
    iput-object p1, p0, Lo/cvu$7;->b:Lo/cvu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 319
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter  batteryRunnable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 320
    invoke-static {}, Lo/cvu;->c()Lo/dde;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 321
    invoke-static {}, Lo/cvu;->c()Lo/dde;

    move-result-object v0

    new-instance v1, Lo/cvu$7$3;

    invoke-direct {v1, p0}, Lo/cvu$7$3;-><init>(Lo/cvu$7;)V

    invoke-virtual {v0, v1}, Lo/dde;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 333
    :cond_0
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "batteryRunnable deviceManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 336
    :goto_0
    return-void
.end method
