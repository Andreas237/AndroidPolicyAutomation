.class public Lo/coa;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:I

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private h:J

.field private k:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Lo/coa;)Landroid/content/ContentValues;
    .locals 6

    .line 114
    new-instance v5, Landroid/content/ContentValues;

    invoke-direct {v5}, Landroid/content/ContentValues;-><init>()V

    .line 115
    const-string v0, "cloud_id"

    invoke-virtual {p0}, Lo/coa;->c()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 116
    const-string v0, "scope_name"

    invoke-virtual {p0}, Lo/coa;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    const-string v0, "permission"

    invoke-virtual {p0}, Lo/coa;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    const-string v0, "uri"

    invoke-virtual {p0}, Lo/coa;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    const-string v0, "create_time"

    invoke-virtual {p0}, Lo/coa;->g()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-gtz v1, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lo/coa;->g()J

    move-result-wide v1

    :goto_0
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 120
    const-string v0, "modified_time"

    invoke-virtual {p0}, Lo/coa;->d()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-gtz v1, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lo/coa;->d()J

    move-result-wide v1

    :goto_1
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 121
    return-object v5
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 90
    iget-object v0, p0, Lo/coa;->b:Ljava/lang/String;

    return-object v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lo/coa;->b:Ljava/lang/String;

    .line 95
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 66
    iget-object v0, p0, Lo/coa;->d:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lo/coa;->d:Ljava/lang/String;

    .line 71
    return-void
.end method

.method public c()I
    .locals 1

    .line 58
    iget v0, p0, Lo/coa;->a:I

    return v0
.end method

.method public d()J
    .locals 2

    .line 82
    iget-wide v0, p0, Lo/coa;->h:J

    return-wide v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 74
    iget-object v0, p0, Lo/coa;->e:Ljava/lang/String;

    return-object v0
.end method

.method public e(I)V
    .locals 0

    .line 62
    iput p1, p0, Lo/coa;->a:I

    .line 63
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lo/coa;->e:Ljava/lang/String;

    .line 79
    return-void
.end method

.method public g()J
    .locals 2

    .line 98
    iget-wide v0, p0, Lo/coa;->k:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 107
    new-instance v2, Ljava/lang/StringBuffer;

    const-string v0, "PermissionTable{"

    invoke-direct {v2, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 108
    const-string v0, "id="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lo/coa;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 109
    const/16 v0, 0x7d

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 110
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
