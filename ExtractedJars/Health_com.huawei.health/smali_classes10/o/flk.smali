.class public Lo/flk;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private d:Lo/fly;


# direct methods
.method protected constructor <init>(Lo/fly;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lo/flk;->d:Lo/fly;

    .line 49
    return-void
.end method


# virtual methods
.method public b()Lo/flj$b;
    .locals 1

    .line 57
    iget-object v0, p0, Lo/flk;->d:Lo/fly;

    invoke-virtual {v0}, Lo/fly;->F()Lo/flj$b;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lo/flk;->d:Lo/fly;

    invoke-virtual {v0}, Lo/fly;->n()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e()Lo/fly;
    .locals 1

    .line 102
    iget-object v0, p0, Lo/flk;->d:Lo/fly;

    return-object v0
.end method
