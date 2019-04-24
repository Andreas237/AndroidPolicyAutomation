.class Lo/ahz$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ahz$1;->handleMessage(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/ahz$1;


# direct methods
.method constructor <init>(Lo/ahz$1;)V
    .locals 0

    .line 348
    iput-object p1, p0, Lo/ahz$1$2;->d:Lo/ahz$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 351
    iget-object v0, p0, Lo/ahz$1$2;->d:Lo/ahz$1;

    iget-object v0, v0, Lo/ahz$1;->e:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->l(Lo/ahz;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 353
    iget-object v0, p0, Lo/ahz$1$2;->d:Lo/ahz$1;

    iget-object v0, v0, Lo/ahz$1;->e:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->o(Lo/ahz;)V

    .line 354
    iget-object v0, p0, Lo/ahz$1$2;->d:Lo/ahz$1;

    iget-object v0, v0, Lo/ahz$1;->e:Lo/ahz;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/ahz;->e(Lo/ahz;Z)Z

    .line 356
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lo/ahz$1$2;->d:Lo/ahz$1;

    iget-object v0, v0, Lo/ahz$1;->e:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->t(Lo/ahz;)[I

    move-result-object v0

    if-eqz v0, :cond_1

    .line 357
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lo/ahz$1$2;->d:Lo/ahz$1;

    iget-object v0, v0, Lo/ahz$1;->e:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->t(Lo/ahz;)[I

    move-result-object v0

    array-length v0, v0

    if-ge v3, v0, :cond_1

    .line 358
    iget-object v0, p0, Lo/ahz$1$2;->d:Lo/ahz$1;

    iget-object v0, v0, Lo/ahz$1;->e:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->r(Lo/ahz;)Landroid/net/wifi/WifiManager;

    move-result-object v0

    iget-object v1, p0, Lo/ahz$1$2;->d:Lo/ahz$1;

    iget-object v1, v1, Lo/ahz$1;->e:Lo/ahz;

    invoke-static {v1}, Lo/ahz;->t(Lo/ahz;)[I

    move-result-object v1

    aget v1, v1, v3

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/net/wifi/WifiManager;->enableNetwork(IZ)Z

    .line 357
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 361
    :cond_1
    iget-object v0, p0, Lo/ahz$1$2;->d:Lo/ahz$1;

    iget-object v0, v0, Lo/ahz$1;->e:Lo/ahz;

    invoke-static {v0}, Lo/ahz;->r(Lo/ahz;)Landroid/net/wifi/WifiManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->startScan()Z

    .line 362
    return-void
.end method
