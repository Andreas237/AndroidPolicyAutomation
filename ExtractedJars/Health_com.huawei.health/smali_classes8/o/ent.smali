.class public Lo/ent;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Z)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)Ljava/util/List<Lo/ddc;>;"
        }
    .end annotation

    .line 42
    invoke-static {p0}, Lo/dda;->a(Z)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public static c(I)Lo/ddc;
    .locals 1

    .line 59
    invoke-static {p0}, Lo/dda;->e(I)Lo/ddc;

    move-result-object v0

    return-object v0
.end method

.method public static d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/ddc;>;"
        }
    .end annotation

    .line 56
    invoke-static {}, Lo/dda;->d()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public static e(Z)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)Ljava/util/List<Lo/ddc;>;"
        }
    .end annotation

    .line 49
    invoke-static {p0}, Lo/dda;->c(Z)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public static e(ILjava/lang/String;Ljava/lang/String;I)Lo/eok;
    .locals 1

    .line 101
    new-instance v0, Lo/eok;

    invoke-direct {v0, p0, p1, p2, p3}, Lo/eok;-><init>(ILjava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method
