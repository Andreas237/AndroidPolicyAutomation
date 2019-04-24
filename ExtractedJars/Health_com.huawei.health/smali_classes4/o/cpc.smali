.class public Lo/cpc;
.super Lo/cof;
.source "SourceFile"


# direct methods
.method public static e()Ljava/lang/String;
    .locals 2

    .line 54
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    const-string v0, "create table  IF NOT EXISTS hihealth_unit("

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    const-string v0, "_id integer primary key not null,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    const-string v0, "unit_string_id text not null,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    const-string v0, "uni_string_lang text,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    const-string v0, "category integer not null"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a()V
    .locals 0

    .line 9
    invoke-super {p0}, Lo/cof;->a()V

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 9
    invoke-super {p0, p1, p2}, Lo/cof;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/String;[Ljava/lang/String;)I
    .locals 1

    .line 9
    invoke-super {p0, p1, p2}, Lo/cof;->b(Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public bridge synthetic b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 1

    .line 9
    invoke-super/range {p0 .. p5}, Lo/cof;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 1

    .line 9
    invoke-super/range {p0 .. p6}, Lo/cof;->b([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c(Landroid/content/ContentValues;)J
    .locals 2

    .line 9
    invoke-super {p0, p1}, Lo/cof;->c(Landroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 66
    const-string v0, "hihealth_unit"

    return-object v0
.end method

.method public bridge synthetic d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 1

    .line 9
    invoke-super {p0, p1, p2, p3}, Lo/cof;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public d()[Ljava/lang/String;
    .locals 3

    .line 71
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "_id"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "unit_string_id"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "uni_string_lang"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "category"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public bridge synthetic e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    .locals 1

    .line 9
    invoke-super {p0, p1, p2}, Lo/cof;->e(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method
