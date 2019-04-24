.class Lo/frd$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/frd;->d(Lo/fqz;)Lo/fqy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lo/fqz;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/frd;


# direct methods
.method constructor <init>(Lo/frd;)V
    .locals 0

    .line 697
    iput-object p1, p0, Lo/frd$2;->a:Lo/frd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 697
    move-object v0, p1

    check-cast v0, Lo/fqz;

    move-object v1, p2

    check-cast v1, Lo/fqz;

    invoke-virtual {p0, v0, v1}, Lo/frd$2;->e(Lo/fqz;Lo/fqz;)I

    move-result v0

    return v0
.end method

.method public e(Lo/fqz;Lo/fqz;)I
    .locals 2

    .line 701
    invoke-virtual {p1}, Lo/fqz;->q()I

    move-result v0

    invoke-virtual {p2}, Lo/fqz;->q()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 702
    const/4 v0, 0x0

    return v0

    .line 703
    :cond_0
    invoke-virtual {p1}, Lo/fqz;->q()I

    move-result v0

    invoke-virtual {p2}, Lo/fqz;->q()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 704
    const/4 v0, -0x1

    return v0

    .line 706
    :cond_1
    const/4 v0, 0x1

    return v0
.end method
