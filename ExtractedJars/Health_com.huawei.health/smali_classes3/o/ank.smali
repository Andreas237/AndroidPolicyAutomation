.class public abstract Lo/ank;
.super Landroid/database/AbstractCursor;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/util/ArrayList<Ljava/lang/String;>;>;"
        }
    .end annotation
.end field

.field private c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Landroid/database/AbstractCursor;-><init>()V

    .line 13
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ank;->c:Ljava/util/ArrayList;

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ank;->a:Ljava/util/ArrayList;

    .line 17
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ank;->e:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 147
    invoke-virtual {p0}, Lo/ank;->c()V

    .line 148
    invoke-virtual {p0}, Lo/ank;->b()V

    .line 149
    return-void
.end method

.method protected abstract b()V
.end method

.method protected abstract c()V
.end method

.method public c(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 24
    iget-object v0, p0, Lo/ank;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    return-void
.end method

.method public close()V
    .locals 3

    .line 123
    invoke-virtual {p0}, Lo/ank;->isClosed()Z

    move-result v0

    if-nez v0, :cond_2

    .line 124
    iget-object v0, p0, Lo/ank;->e:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 125
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ank;->e:Ljava/util/ArrayList;

    .line 128
    :cond_0
    iget-object v0, p0, Lo/ank;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/ArrayList;

    .line 129
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 130
    goto :goto_0

    .line 132
    :cond_1
    iget-object v0, p0, Lo/ank;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 133
    iget-object v0, p0, Lo/ank;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 135
    invoke-super {p0}, Landroid/database/AbstractCursor;->close()V

    .line 137
    :cond_2
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    .line 20
    iget-object v0, p0, Lo/ank;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    return-void
.end method

.method public fillWindow(ILandroid/database/CursorWindow;)V
    .locals 4

    .line 29
    const-string v0, "Step_HealhtCursor"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fillWindow() fillWindow  position ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ank;->e:Ljava/util/ArrayList;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "|this.allDataList.size() = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ank;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    if-ltz p1, :cond_0

    iget-object v0, p0, Lo/ank;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 31
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ank;->e:Ljava/util/ArrayList;

    .line 33
    return-void

    .line 37
    :cond_1
    iget-object v0, p0, Lo/ank;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, p0, Lo/ank;->e:Ljava/util/ArrayList;

    .line 39
    invoke-super {p0, p1, p2}, Landroid/database/AbstractCursor;->fillWindow(ILandroid/database/CursorWindow;)V

    .line 41
    return-void
.end method

.method public getColumnNames()[Ljava/lang/String;
    .locals 3

    .line 50
    iget-object v0, p0, Lo/ank;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 51
    new-array v2, v1, [Ljava/lang/String;

    .line 52
    iget-object v0, p0, Lo/ank;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method public getCount()I
    .locals 1

    .line 45
    iget-object v0, p0, Lo/ank;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getDouble(I)D
    .locals 3

    .line 109
    invoke-virtual {p0, p1}, Lo/ank;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 110
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 111
    invoke-static {v2}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0

    .line 113
    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getFloat(I)F
    .locals 2

    .line 100
    invoke-virtual {p0, p1}, Lo/ank;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 101
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 102
    invoke-static {v1}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0

    .line 104
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getInt(I)I
    .locals 2

    .line 79
    invoke-virtual {p0, p1}, Lo/ank;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 80
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 81
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    return v0

    .line 83
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getLong(I)J
    .locals 3

    .line 90
    invoke-virtual {p0, p1}, Lo/ank;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 91
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 92
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0

    .line 94
    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getShort(I)S
    .locals 2

    .line 67
    invoke-virtual {p0, p1}, Lo/ank;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 69
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 70
    invoke-static {v1}, Ljava/lang/Short;->valueOf(Ljava/lang/String;)Ljava/lang/Short;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Short;->shortValue()S

    move-result v0

    return v0

    .line 73
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getString(I)Ljava/lang/String;
    .locals 4

    .line 57
    iget-object v0, p0, Lo/ank;->e:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    if-ltz p1, :cond_0

    iget-object v0, p0, Lo/ank;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 58
    iget-object v0, p0, Lo/ank;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 60
    :cond_0
    const-string v0, "Step_HealhtCursor"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getString() oneLineData.size="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ank;->e:Ljava/util/ArrayList;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "column "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    const/4 v0, 0x0

    return-object v0
.end method

.method public isNull(I)Z
    .locals 1

    .line 118
    const/4 v0, 0x0

    return v0
.end method
