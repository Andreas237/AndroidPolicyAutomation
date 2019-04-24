.class public Lo/cnx;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:Lo/coa;

.field private e:I

.field private f:J

.field private g:J

.field private k:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lo/cnx;)Landroid/content/ContentValues;
    .locals 4

    .line 126
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 127
    const-string v0, "app_id"

    invoke-virtual {p0}, Lo/cnx;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 128
    const-string v0, "user_id"

    invoke-virtual {p0}, Lo/cnx;->e()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 129
    const-string v0, "permission_id"

    invoke-virtual {p0}, Lo/cnx;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 130
    const-string v0, "granted"

    invoke-virtual {p0}, Lo/cnx;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 132
    const-string v0, "modified_time"

    invoke-virtual {p0}, Lo/cnx;->f()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 133
    return-object v3
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 78
    iget v0, p0, Lo/cnx;->e:I

    return v0
.end method

.method public a(I)V
    .locals 0

    .line 74
    iput p1, p0, Lo/cnx;->a:I

    .line 75
    return-void
.end method

.method public b()I
    .locals 1

    .line 94
    iget v0, p0, Lo/cnx;->k:I

    return v0
.end method

.method public b(J)V
    .locals 0

    .line 106
    iput-wide p1, p0, Lo/cnx;->f:J

    .line 107
    return-void
.end method

.method public c()Lo/coa;
    .locals 1

    .line 86
    iget-object v0, p0, Lo/cnx;->d:Lo/coa;

    return-object v0
.end method

.method public c(I)V
    .locals 0

    .line 82
    iput p1, p0, Lo/cnx;->e:I

    .line 83
    return-void
.end method

.method public c(J)V
    .locals 0

    .line 114
    iput-wide p1, p0, Lo/cnx;->g:J

    .line 115
    return-void
.end method

.method public d()I
    .locals 1

    .line 62
    iget v0, p0, Lo/cnx;->c:I

    return v0
.end method

.method public d(I)V
    .locals 0

    .line 98
    iput p1, p0, Lo/cnx;->k:I

    .line 99
    return-void
.end method

.method public e()I
    .locals 1

    .line 70
    iget v0, p0, Lo/cnx;->a:I

    return v0
.end method

.method public e(I)V
    .locals 0

    .line 66
    iput p1, p0, Lo/cnx;->c:I

    .line 67
    return-void
.end method

.method public e(Lo/coa;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lo/cnx;->d:Lo/coa;

    .line 91
    return-void
.end method

.method public f()J
    .locals 2

    .line 110
    iget-wide v0, p0, Lo/cnx;->g:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 119
    new-instance v2, Ljava/lang/StringBuffer;

    const-string v0, "AuthorizationTable{"

    invoke-direct {v2, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 120
    const-string v0, "id="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lo/cnx;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 121
    const/16 v0, 0x7d

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 122
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
