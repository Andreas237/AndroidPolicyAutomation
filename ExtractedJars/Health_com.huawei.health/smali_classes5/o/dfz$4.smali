.class Lo/dfz$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dfz;->c(Lo/dfv;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lo/dfq;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lo/dfz;


# direct methods
.method constructor <init>(Lo/dfz;)V
    .locals 0

    .line 890
    iput-object p1, p0, Lo/dfz$4;->d:Lo/dfz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 890
    move-object v0, p1

    check-cast v0, Lo/dfq;

    move-object v1, p2

    check-cast v1, Lo/dfq;

    invoke-virtual {p0, v0, v1}, Lo/dfz$4;->d(Lo/dfq;Lo/dfq;)I

    move-result v0

    return v0
.end method

.method public d(Lo/dfq;Lo/dfq;)I
    .locals 4

    .line 892
    invoke-virtual {p1}, Lo/dfq;->b()J

    move-result-wide v0

    invoke-virtual {p2}, Lo/dfq;->b()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method
