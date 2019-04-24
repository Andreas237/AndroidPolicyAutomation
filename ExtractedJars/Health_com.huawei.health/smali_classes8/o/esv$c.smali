.class Lo/esv$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmo;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/esv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic d:Lo/esv;


# direct methods
.method private constructor <init>(Lo/esv;)V
    .locals 0

    .line 1568
    iput-object p1, p0, Lo/esv$c;->d:Lo/esv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/esv;Lo/esv$1;)V
    .locals 0

    .line 1568
    invoke-direct {p0, p1}, Lo/esv$c;-><init>(Lo/esv;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 5

    .line 1582
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onServiceException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1583
    iget-object v0, p0, Lo/esv$c;->d:Lo/esv;

    invoke-static {v0}, Lo/esv;->k(Lo/esv;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xd

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 1584
    iget-object v0, p0, Lo/esv$c;->d:Lo/esv;

    invoke-static {v0}, Lo/esv;->k(Lo/esv;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1585
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 4

    .line 1572
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1573
    return-void
.end method

.method public e(Ljava/lang/Object;)V
    .locals 4

    .line 1577
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onFailed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1578
    iget-object v0, p0, Lo/esv$c;->d:Lo/esv;

    invoke-static {v0}, Lo/esv;->w(Lo/esv;)V

    .line 1579
    return-void
.end method
