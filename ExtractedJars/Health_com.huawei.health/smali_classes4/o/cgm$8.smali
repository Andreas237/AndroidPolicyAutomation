.class final Lo/cgm$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cgm;->d(Ljava/util/List;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lo/cfd;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 57
    move-object v0, p1

    check-cast v0, Lo/cfd;

    move-object v1, p2

    check-cast v1, Lo/cfd;

    invoke-virtual {p0, v0, v1}, Lo/cgm$8;->e(Lo/cfd;Lo/cfd;)I

    move-result v0

    return v0
.end method

.method public e(Lo/cfd;Lo/cfd;)I
    .locals 2

    .line 60
    invoke-static {p1}, Lo/cgm;->a(Lo/cfd;)I

    move-result v0

    invoke-static {p2}, Lo/cgm;->a(Lo/cfd;)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    return v0
.end method
