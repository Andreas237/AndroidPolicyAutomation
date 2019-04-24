.class Lo/akg$c;
.super Lo/aje;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/aje<Lo/akg;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lo/akg;)V
    .locals 0

    .line 394
    invoke-direct {p0, p1}, Lo/aje;-><init>(Ljava/lang/Object;)V

    .line 395
    return-void
.end method


# virtual methods
.method public e(Lo/akg;ILjava/lang/String;Ljava/lang/Object;)V
    .locals 5

    .line 398
    move-object v4, p1

    .line 399
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-static {v4}, Lo/akg;->c(Lo/akg;)I

    move-result v0

    if-nez v0, :cond_1

    .line 400
    :cond_0
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AddDeviceManager is null or Config NetWork is not Runing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 401
    return-void

    .line 403
    :cond_1
    const-string v0, "error_code"

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 404
    invoke-static {v4, p2, p4}, Lo/akg;->e(Lo/akg;ILjava/lang/Object;)V

    goto :goto_0

    .line 405
    :cond_2
    const-string v0, "work_flow"

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 406
    invoke-static {v4, p2}, Lo/akg;->c(Lo/akg;I)V

    .line 408
    :cond_3
    :goto_0
    return-void
.end method

.method public synthetic onResult(Ljava/lang/Object;ILjava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 392
    move-object v0, p1

    check-cast v0, Lo/akg;

    invoke-virtual {p0, v0, p2, p3, p4}, Lo/akg$c;->e(Lo/akg;ILjava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
