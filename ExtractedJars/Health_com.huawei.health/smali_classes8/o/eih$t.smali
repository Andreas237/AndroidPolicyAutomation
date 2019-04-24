.class public Lo/eih$t;
.super Lo/eih$s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eih;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "t"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/eih<TT;>.s;"
    }
.end annotation


# instance fields
.field final synthetic b:Lo/eih;


# direct methods
.method public constructor <init>(Lo/eih;)V
    .locals 0

    .line 520
    iput-object p1, p0, Lo/eih$t;->b:Lo/eih;

    invoke-direct {p0, p1}, Lo/eih$s;-><init>(Lo/eih;)V

    return-void
.end method


# virtual methods
.method public a(FLo/lh;)Ljava/lang/String;
    .locals 6

    .line 545
    float-to-int v5, p1

    .line 546
    iget-object v0, p0, Lo/eih$t;->b:Lo/eih;

    invoke-virtual {v0}, Lo/eih;->getContext()Landroid/content/Context;

    move-result-object v0

    int-to-long v1, v5

    const-wide/16 v3, 0x3c

    mul-long/2addr v1, v3

    const-wide/16 v3, 0x3e8

    mul-long/2addr v1, v3

    const/16 v3, 0x18

    invoke-static {v0, v1, v2, v3}, Landroid/text/format/DateUtils;->formatDateTime(Landroid/content/Context;JI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b(FF)Ljava/lang/String;
    .locals 10

    .line 524
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v7

    .line 525
    float-to-int v8, p1

    .line 527
    int-to-long v0, v8

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 528
    const/4 v0, 0x5

    invoke-virtual {v7, v0}, Ljava/util/Calendar;->get(I)I

    move-result v9

    .line 529
    const/4 v0, 0x1

    if-ne v9, v0, :cond_0

    .line 531
    iget-object v0, p0, Lo/eih$t;->b:Lo/eih;

    invoke-virtual {v0}, Lo/eih;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v7}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    const v3, 0x20024

    invoke-static {v0, v1, v2, v3}, Landroid/text/format/DateUtils;->formatDateTime(Landroid/content/Context;JI)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 537
    :cond_0
    iget-object v0, p0, Lo/eih$t;->b:Lo/eih;

    invoke-virtual {v0}, Lo/eih;->getContext()Landroid/content/Context;

    move-result-object v0

    float-to-long v1, p1

    const-wide/16 v3, 0x3c

    mul-long/2addr v1, v3

    const-wide/16 v3, 0x3e8

    mul-long/2addr v1, v3

    float-to-long v3, p2

    const-wide/16 v5, 0x3c

    mul-long/2addr v3, v5

    const-wide/16 v5, 0x3e8

    mul-long/2addr v3, v5

    const/16 v5, 0x14

    invoke-static/range {v0 .. v5}, Landroid/text/format/DateUtils;->formatDateRange(Landroid/content/Context;JJI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
