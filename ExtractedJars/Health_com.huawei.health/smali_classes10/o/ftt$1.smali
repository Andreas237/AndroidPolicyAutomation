.class final Lo/ftt$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ftt;->e(Ljava/util/Calendar;Ljava/util/List;)Ljava/util/Calendar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Ljava/util/Calendar;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Ljava/util/Calendar;


# direct methods
.method constructor <init>(Ljava/util/Calendar;)V
    .locals 0

    .line 378
    iput-object p1, p0, Lo/ftt$1;->c:Ljava/util/Calendar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/util/Calendar;Ljava/util/Calendar;)I
    .locals 6

    .line 383
    iget-object v0, p0, Lo/ftt$1;->c:Ljava/util/Calendar;

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    .line 384
    iget-object v0, p0, Lo/ftt$1;->c:Ljava/util/Calendar;

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-virtual {p2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    .line 385
    invoke-virtual {v4, v5}, Ljava/lang/Long;->compareTo(Ljava/lang/Long;)I

    move-result v0

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 378
    move-object v0, p1

    check-cast v0, Ljava/util/Calendar;

    move-object v1, p2

    check-cast v1, Ljava/util/Calendar;

    invoke-virtual {p0, v0, v1}, Lo/ftt$1;->b(Ljava/util/Calendar;Ljava/util/Calendar;)I

    move-result v0

    return v0
.end method
