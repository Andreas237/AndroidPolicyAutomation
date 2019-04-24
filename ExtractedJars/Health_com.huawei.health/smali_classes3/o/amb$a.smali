.class Lo/amb$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ala;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/amb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private c:Lo/aay;


# direct methods
.method public constructor <init>(Lo/aay;)V
    .locals 0

    .line 556
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 557
    iput-object p1, p0, Lo/amb$a;->c:Lo/aay;

    .line 558
    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 5

    .line 575
    iget-object v0, p0, Lo/amb$a;->c:Lo/aay;

    if-eqz v0, :cond_0

    .line 578
    :try_start_0
    iget-object v0, p0, Lo/amb$a;->c:Lo/aay;

    invoke-interface {v0, p1}, Lo/aay;->d(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 581
    goto :goto_0

    .line 579
    :catch_0
    move-exception v4

    .line 580
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 583
    :cond_0
    :goto_0
    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 5

    .line 563
    iget-object v0, p0, Lo/amb$a;->c:Lo/aay;

    if-eqz v0, :cond_0

    .line 565
    :try_start_0
    iget-object v0, p0, Lo/amb$a;->c:Lo/aay;

    invoke-interface {v0, p1}, Lo/aay;->c(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 568
    goto :goto_0

    .line 566
    :catch_0
    move-exception v4

    .line 567
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 570
    :cond_0
    :goto_0
    return-void
.end method
