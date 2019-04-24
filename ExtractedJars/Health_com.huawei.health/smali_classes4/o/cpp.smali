.class public Lo/cpp;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/util/List;[Ljava/lang/String;IZ)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Ljava/lang/Integer;>;[Ljava/lang/String;IZ)Ljava/lang/String;"
        }
    .end annotation

    .line 15
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 16
    const-string v0, "Select (count(*) +(select (case t1.type_id when ? then 1 else 0 end) from sample_session t1 "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 17
    const-string v0, "where t1.start_time >= ? and t1.start_time <= ?"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 18
    if-eqz p4, :cond_0

    .line 19
    const-string v0, " and t1.merged =?  "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 21
    :cond_0
    const-string v0, "ORDER BY start_time ASC LIMIT 0,1 )) as "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 22
    invoke-virtual {v6, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 23
    const-string v0, " From sample_session t1 inner join sample_session t2 on t2.start_time = (Select min(start_time)"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 24
    const-string v0, " From sample_session t2 where t2.start_time >= t1.end_time) "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 25
    const-string v0, " and t1.type_id <> ? and t2.type_id = ? and t1.start_time >= ? and t1.start_time <= ? "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 26
    if-eqz p4, :cond_1

    .line 27
    const-string v0, " and t1.merged =?  "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 29
    :cond_1
    const-string v0, "t1.client_id"

    move-object v1, p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    move-object v3, v6

    move-object v4, p2

    move v5, p3

    invoke-static/range {v0 .. v5}, Lo/cpl;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 30
    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static c(Ljava/lang/String;Ljava/util/List;[Ljava/lang/String;IZ)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Ljava/lang/Integer;>;[Ljava/lang/String;IZ)Ljava/lang/String;"
        }
    .end annotation

    .line 56
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 57
    const-string v0, "Select (count(*) +(select (case t1.type_id when ? then 1 else 0 end) from sample_session_core t1 "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 58
    const-string v0, "where t1.start_time >= ? and t1.start_time <= ?"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 59
    if-eqz p4, :cond_0

    .line 60
    const-string v0, " and t1.merged =?  "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 62
    :cond_0
    const-string v0, "ORDER BY start_time ASC LIMIT 0,1 )) as "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 63
    invoke-virtual {v6, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 64
    const-string v0, " From sample_session_core t1 inner join sample_session_core t2 on t2.start_time = (Select min(start_time)"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 65
    const-string v0, " From sample_session_core t2 where t2.start_time >= t1.end_time) "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 66
    const-string v0, " and t1.type_id <> ? and t2.type_id = ? and t1.start_time >= ? and t1.start_time <= ? "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 67
    if-eqz p4, :cond_1

    .line 68
    const-string v0, " and t1.merged =?  "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 70
    :cond_1
    const-string v0, "t1.client_id"

    move-object v1, p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    move-object v3, v6

    move-object v4, p2

    move v5, p3

    invoke-static/range {v0 .. v5}, Lo/cpl;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 71
    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static e(Ljava/lang/String;Ljava/util/List;[Ljava/lang/String;IZ)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Ljava/lang/Integer;>;[Ljava/lang/String;IZ)Ljava/lang/String;"
        }
    .end annotation

    .line 37
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 38
    const-string v0, "Select (count(*) +(select (case t1.type_id when ? then 1 else 0 end) from sample_session_health t1 "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 39
    const-string v0, "where t1.start_time >= ? and t1.start_time <= ?"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 40
    if-eqz p4, :cond_0

    .line 41
    const-string v0, " and t1.merged =?  "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 43
    :cond_0
    const-string v0, "ORDER BY start_time ASC LIMIT 0,1 )) as "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 44
    invoke-virtual {v6, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 45
    const-string v0, " From sample_session_health t1 inner join sample_session_health t2 on t2.start_time = (Select min(start_time)"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 46
    const-string v0, " From sample_session_health t2 where t2.start_time >= t1.end_time) "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 47
    const-string v0, " and t1.type_id <> ? and t2.type_id = ? and t1.start_time >= ? and t1.start_time <= ? "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 48
    if-eqz p4, :cond_1

    .line 49
    const-string v0, " and t1.merged =?  "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 51
    :cond_1
    const-string v0, "t1.client_id"

    move-object v1, p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    move-object v3, v6

    move-object v4, p2

    move v5, p3

    invoke-static/range {v0 .. v5}, Lo/cpl;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 52
    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
