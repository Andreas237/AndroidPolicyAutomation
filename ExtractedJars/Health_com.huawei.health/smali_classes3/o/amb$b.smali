.class Lo/amb$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ala;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/amb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic d:Lo/amb;


# direct methods
.method private constructor <init>(Lo/amb;)V
    .locals 0

    .line 530
    iput-object p1, p0, Lo/amb$b;->d:Lo/amb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/amb;Lo/amb$5;)V
    .locals 0

    .line 530
    invoke-direct {p0, p1}, Lo/amb$b;-><init>(Lo/amb;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 4

    .line 544
    iget-object v0, p0, Lo/amb$b;->d:Lo/amb;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/amb;->b(Lo/amb;Z)Z

    .line 545
    const-string v0, "Step_CounterRemoteProxy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init onfailed try to startStepCounter,may failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 546
    iget-object v0, p0, Lo/amb$b;->d:Lo/amb;

    invoke-static {v0}, Lo/amb;->b(Lo/amb;)Lo/alt;

    move-result-object v0

    invoke-virtual {v0}, Lo/alt;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 547
    iget-object v0, p0, Lo/amb$b;->d:Lo/amb;

    invoke-static {v0}, Lo/amb;->b(Lo/amb;)Lo/alt;

    move-result-object v0

    invoke-virtual {v0}, Lo/alt;->k()V

    .line 549
    :cond_0
    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 2

    .line 536
    iget-object v0, p0, Lo/amb$b;->d:Lo/amb;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/amb;->b(Lo/amb;Z)Z

    .line 537
    iget-object v0, p0, Lo/amb$b;->d:Lo/amb;

    invoke-static {v0}, Lo/amb;->b(Lo/amb;)Lo/alt;

    move-result-object v0

    invoke-virtual {v0}, Lo/alt;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 538
    iget-object v0, p0, Lo/amb$b;->d:Lo/amb;

    invoke-static {v0}, Lo/amb;->b(Lo/amb;)Lo/alt;

    move-result-object v0

    invoke-virtual {v0}, Lo/alt;->k()V

    .line 540
    :cond_0
    return-void
.end method
