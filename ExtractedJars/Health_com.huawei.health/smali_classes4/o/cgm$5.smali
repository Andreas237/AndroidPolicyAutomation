.class final Lo/cgm$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cgm;->k(Ljava/util/List;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lo/cvv;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 178
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 178
    move-object v0, p1

    check-cast v0, Lo/cvv;

    move-object v1, p2

    check-cast v1, Lo/cvv;

    invoke-virtual {p0, v0, v1}, Lo/cgm$5;->d(Lo/cvv;Lo/cvv;)I

    move-result v0

    return v0
.end method

.method public d(Lo/cvv;Lo/cvv;)I
    .locals 2

    .line 181
    invoke-virtual {p1}, Lo/cvv;->c()I

    move-result v0

    invoke-virtual {p2}, Lo/cvv;->c()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    return v0
.end method
