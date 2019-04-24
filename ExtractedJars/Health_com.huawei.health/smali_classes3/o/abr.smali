.class public Lo/abr;
.super Lo/abm;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Lo/abm;-><init>()V

    .line 17
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 28
    const-string v0, "Step_MockStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startStepCounter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    return-void
.end method

.method public a(Lo/ala;)V
    .locals 1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lo/ala;->b(Landroid/os/Bundle;)V

    .line 24
    :cond_0
    return-void
.end method

.method public d()V
    .locals 4

    .line 33
    const-string v0, "Step_MockStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopStepCounter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    return-void
.end method
