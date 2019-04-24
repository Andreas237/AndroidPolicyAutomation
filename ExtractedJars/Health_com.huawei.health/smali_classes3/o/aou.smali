.class public Lo/aou;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/os/Handler;Ljava/lang/String;)V
    .locals 2

    .line 32
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-static {p0, p1}, Lo/aou;->c(Landroid/os/Handler;Ljava/lang/String;)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 33
    return-void
.end method

.method private static c(Landroid/os/Handler;Ljava/lang/String;)Lo/brd;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/os/Handler;Ljava/lang/String;)Lo/brd<Ljava/lang/Boolean;>;"
        }
    .end annotation

    .line 44
    new-instance v0, Lo/aou$5;

    invoke-direct {v0, p1, p0}, Lo/aou$5;-><init>(Ljava/lang/String;Landroid/os/Handler;)V

    return-object v0
.end method
