.class public Lo/cnz;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:J

.field private c:J

.field private d:I

.field private e:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lo/cnz;)Landroid/content/ContentValues;
    .locals 4

    .line 72
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 73
    const-string v0, "main_user_id"

    invoke-virtual {p0}, Lo/cnz;->e()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 74
    const-string v0, "cloud_code"

    invoke-virtual {p0}, Lo/cnz;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 75
    const-string v0, "sync_data_type"

    invoke-virtual {p0}, Lo/cnz;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 76
    const-string v0, "sync_type_version"

    invoke-virtual {p0}, Lo/cnz;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 77
    const-string v0, "sync_type_time"

    invoke-virtual {p0}, Lo/cnz;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 78
    const-string v0, "modify_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 79
    return-object v3
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 31
    iget-wide v0, p0, Lo/cnz;->b:J

    return-wide v0
.end method

.method public a(I)V
    .locals 0

    .line 27
    iput p1, p0, Lo/cnz;->d:I

    .line 28
    return-void
.end method

.method public a(J)V
    .locals 0

    .line 35
    iput-wide p1, p0, Lo/cnz;->b:J

    .line 36
    return-void
.end method

.method public b()I
    .locals 1

    .line 23
    iget v0, p0, Lo/cnz;->d:I

    return v0
.end method

.method public c()J
    .locals 2

    .line 39
    iget-wide v0, p0, Lo/cnz;->c:J

    return-wide v0
.end method

.method public c(I)V
    .locals 0

    .line 51
    iput p1, p0, Lo/cnz;->e:I

    .line 52
    return-void
.end method

.method public c(J)V
    .locals 0

    .line 43
    iput-wide p1, p0, Lo/cnz;->c:J

    .line 44
    return-void
.end method

.method public d()I
    .locals 1

    .line 47
    iget v0, p0, Lo/cnz;->e:I

    return v0
.end method

.method public e()I
    .locals 1

    .line 55
    iget v0, p0, Lo/cnz;->a:I

    return v0
.end method

.method public e(I)V
    .locals 0

    .line 58
    iput p1, p0, Lo/cnz;->a:I

    .line 59
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 62
    new-instance v3, Ljava/lang/StringBuffer;

    const-string v0, "SyncAnchorTable{"

    invoke-direct {v3, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 63
    const-string v0, "syncType="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lo/cnz;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 64
    const-string v0, ", cloudCode="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lo/cnz;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 65
    const-string v0, ", syncTypeVersion="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lo/cnz;->c:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 66
    const-string v0, ", syncTime="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lo/cnz;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 67
    const/16 v0, 0x7d

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 68
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
