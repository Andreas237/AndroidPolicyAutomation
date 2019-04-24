.class Lo/fkh$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmo;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fkh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/fkh;


# direct methods
.method constructor <init>(Lo/fkh;)V
    .locals 0

    .line 135
    iput-object p1, p0, Lo/fkh$1;->e:Lo/fkh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 0

    .line 160
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 6

    .line 139
    if-eqz p1, :cond_0

    .line 140
    instance-of v0, p1, Landroid/os/Bundle;

    if-eqz v0, :cond_0

    .line 141
    move-object v4, p1

    check-cast v4, Landroid/os/Bundle;

    .line 142
    const-string v0, "standSteps"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v5

    .line 143
    const-string v0, "Track_VibraStepCounterHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "executeResult onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    iget-object v0, p0, Lo/fkh$1;->e:Lo/fkh;

    invoke-static {v0}, Lo/fkh;->e(Lo/fkh;)Lo/eeu;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 145
    iget-object v0, p0, Lo/fkh$1;->e:Lo/fkh;

    invoke-static {v0}, Lo/fkh;->e(Lo/fkh;)Lo/eeu;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/eeu;->a(I)V

    .line 150
    :cond_0
    return-void
.end method

.method public e(Ljava/lang/Object;)V
    .locals 0

    .line 155
    return-void
.end method
