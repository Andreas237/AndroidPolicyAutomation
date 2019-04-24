.class public Lo/cob;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:D

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:Ljava/lang/String;

.field private h:I

.field private i:I

.field private k:I

.field private n:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lo/cob;)Landroid/content/ContentValues;
    .locals 4

    .line 190
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 191
    const-string v0, "value"

    invoke-virtual {p0}, Lo/cob;->d()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 192
    const-string v0, "unit_id"

    invoke-virtual {p0}, Lo/cob;->g()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 193
    const-string v0, "user_id"

    invoke-virtual {p0}, Lo/cob;->c()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 194
    const-string v0, "sync_status"

    invoke-virtual {p0}, Lo/cob;->k()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 195
    const-string v0, "modified_time"

    invoke-virtual {p0}, Lo/cob;->f()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 197
    return-object v3
.end method

.method public static b(Lo/cob;)Landroid/content/ContentValues;
    .locals 4

    .line 174
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 175
    const-string v0, "date"

    invoke-virtual {p0}, Lo/cob;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 176
    const-string v0, "hihealth_type"

    invoke-virtual {p0}, Lo/cob;->e()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 177
    const-string v0, "stat_type"

    invoke-virtual {p0}, Lo/cob;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 178
    const-string v0, "value"

    invoke-virtual {p0}, Lo/cob;->d()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    .line 179
    const-string v0, "client_id"

    invoke-virtual {p0}, Lo/cob;->h()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 180
    const-string v0, "unit_id"

    invoke-virtual {p0}, Lo/cob;->g()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 181
    const-string v0, "user_id"

    invoke-virtual {p0}, Lo/cob;->c()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 182
    const-string v0, "timeZone"

    invoke-virtual {p0}, Lo/cob;->i()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/cnk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    const-string v0, "sync_status"

    invoke-virtual {p0}, Lo/cob;->k()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 184
    const-string v0, "modified_time"

    invoke-virtual {p0}, Lo/cob;->f()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 185
    return-object v3
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 91
    iget v0, p0, Lo/cob;->e:I

    return v0
.end method

.method public a(IDI)Lo/cob;
    .locals 1

    .line 221
    new-instance v0, Lo/cob;

    invoke-direct {v0}, Lo/cob;-><init>()V

    .line 222
    invoke-virtual {v0, p1}, Lo/cob;->a(I)V

    .line 223
    invoke-virtual {v0, p2, p3}, Lo/cob;->e(D)V

    .line 224
    invoke-virtual {v0, p4}, Lo/cob;->i(I)V

    .line 225
    return-object v0
.end method

.method public a(I)V
    .locals 0

    .line 95
    iput p1, p0, Lo/cob;->e:I

    .line 96
    return-void
.end method

.method public a(J)V
    .locals 1

    .line 79
    invoke-static {p1, p2}, Lo/cnk;->a(J)I

    move-result v0

    iput v0, p0, Lo/cob;->b:I

    .line 80
    return-void
.end method

.method public b()I
    .locals 1

    .line 54
    iget v0, p0, Lo/cob;->b:I

    return v0
.end method

.method public b(I)V
    .locals 0

    .line 119
    iput p1, p0, Lo/cob;->h:I

    .line 120
    return-void
.end method

.method public c()I
    .locals 1

    .line 107
    iget v0, p0, Lo/cob;->k:I

    return v0
.end method

.method public c(I)V
    .locals 0

    .line 71
    iput p1, p0, Lo/cob;->b:I

    .line 72
    return-void
.end method

.method public d()D
    .locals 2

    .line 99
    iget-wide v0, p0, Lo/cob;->a:D

    return-wide v0
.end method

.method public d(I)V
    .locals 0

    .line 87
    iput p1, p0, Lo/cob;->c:I

    .line 88
    return-void
.end method

.method public d(Lo/cob;IIZ)V
    .locals 1

    .line 202
    invoke-virtual {p1, p3}, Lo/cob;->b(I)V

    .line 203
    invoke-virtual {p1, p2}, Lo/cob;->e(I)V

    .line 204
    if-nez p4, :cond_0

    .line 205
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lo/cob;->f(I)V

    .line 207
    :cond_0
    return-void
.end method

.method public e()I
    .locals 1

    .line 83
    iget v0, p0, Lo/cob;->c:I

    return v0
.end method

.method public e(Ljava/util/List;Ljava/lang/String;II)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cob;>;Ljava/lang/String;II)Ljava/util/List<Lo/cob;>;"
        }
    .end annotation

    .line 210
    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 211
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    invoke-virtual {v0, p3}, Lo/cob;->b(I)V

    .line 212
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    invoke-virtual {v0, p2}, Lo/cob;->e(Ljava/lang/String;)V

    .line 213
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    invoke-virtual {v0, p4}, Lo/cob;->c(I)V

    .line 214
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cob;->f(I)V

    .line 215
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cob;

    const/16 v1, 0x4e21

    invoke-virtual {v0, v1}, Lo/cob;->d(I)V

    .line 210
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 217
    :cond_0
    return-object p1
.end method

.method public e(D)V
    .locals 0

    .line 103
    iput-wide p1, p0, Lo/cob;->a:D

    .line 104
    return-void
.end method

.method public e(I)V
    .locals 0

    .line 111
    iput p1, p0, Lo/cob;->k:I

    .line 112
    return-void
.end method

.method public e(J)V
    .locals 0

    .line 151
    iput-wide p1, p0, Lo/cob;->n:J

    .line 152
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 127
    iput-object p1, p0, Lo/cob;->g:Ljava/lang/String;

    .line 128
    return-void
.end method

.method public f()J
    .locals 2

    .line 147
    iget-wide v0, p0, Lo/cob;->n:J

    return-wide v0
.end method

.method public f(I)V
    .locals 0

    .line 143
    iput p1, p0, Lo/cob;->i:I

    .line 144
    return-void
.end method

.method public g()I
    .locals 1

    .line 131
    iget v0, p0, Lo/cob;->f:I

    return v0
.end method

.method public h()I
    .locals 1

    .line 115
    iget v0, p0, Lo/cob;->h:I

    return v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 123
    iget-object v0, p0, Lo/cob;->g:Ljava/lang/String;

    return-object v0
.end method

.method public i(I)V
    .locals 0

    .line 135
    iput p1, p0, Lo/cob;->f:I

    .line 136
    return-void
.end method

.method public k()I
    .locals 1

    .line 139
    iget v0, p0, Lo/cob;->i:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 156
    new-instance v3, Ljava/lang/StringBuffer;

    const-string v0, "DayStatTable{"

    invoke-direct {v3, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 157
    const-string v0, "id="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lo/cob;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 158
    const-string v0, ", date="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lo/cob;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 159
    const-string v0, ", hiHealthType="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lo/cob;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 160
    const-string v0, ", statType="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lo/cob;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 161
    const-string v0, ", value="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lo/cob;->a:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(D)Ljava/lang/StringBuffer;

    .line 162
    const-string v0, ", unitID="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lo/cob;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 163
    const-string v0, ", who="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lo/cob;->k:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 164
    const-string v0, ", clientID="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lo/cob;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 165
    const-string v0, ", timeZone=\'"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lo/cob;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 166
    const-string v0, ", syncStatus="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lo/cob;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 167
    const-string v0, ", modifyTime="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lo/cob;->n:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 168
    const/16 v0, 0x7d

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 169
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
