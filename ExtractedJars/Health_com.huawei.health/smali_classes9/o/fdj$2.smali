.class Lo/fdj$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fdj;->d(Ljava/util/ArrayList;Ljava/util/List;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lo/fdf;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lo/fdj;


# direct methods
.method constructor <init>(Lo/fdj;)V
    .locals 0

    .line 1003
    iput-object p1, p0, Lo/fdj$2;->d:Lo/fdj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 1003
    move-object v0, p1

    check-cast v0, Lo/fdf;

    move-object v1, p2

    check-cast v1, Lo/fdf;

    invoke-virtual {p0, v0, v1}, Lo/fdj$2;->e(Lo/fdf;Lo/fdf;)I

    move-result v0

    return v0
.end method

.method public e(Lo/fdf;Lo/fdf;)I
    .locals 4

    .line 1006
    iget-wide v0, p1, Lo/fdf;->a:J

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 1007
    iget-wide v0, p2, Lo/fdf;->a:J

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 1008
    invoke-virtual {v3, v2}, Ljava/lang/Integer;->compareTo(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method
