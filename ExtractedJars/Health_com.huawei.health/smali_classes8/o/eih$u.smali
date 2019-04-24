.class public Lo/eih$u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eih$i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eih;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "u"
.end annotation


# instance fields
.field final synthetic e:Lo/eih;


# direct methods
.method public constructor <init>(Lo/eih;)V
    .locals 0

    .line 751
    iput-object p1, p0, Lo/eih$u;->e:Lo/eih;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private e(F)Ljava/lang/String;
    .locals 7

    .line 811
    float-to-int v5, p1

    .line 812
    new-instance v6, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy"

    invoke-direct {v6, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 813
    new-instance v0, Ljava/util/Date;

    int-to-long v1, v5

    const-wide/16 v3, 0x3c

    mul-long/2addr v1, v3

    const-wide/16 v3, 0x3e8

    mul-long/2addr v1, v3

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v6, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(FLo/lh;)Ljava/lang/String;
    .locals 5

    .line 760
    iget-object v0, p0, Lo/eih$u;->e:Lo/eih;

    invoke-virtual {v0}, Lo/eih;->getContext()Landroid/content/Context;

    move-result-object v0

    float-to-long v1, p1

    const-wide/16 v3, 0x3c

    mul-long/2addr v1, v3

    const-wide/16 v3, 0x3e8

    mul-long/2addr v1, v3

    const v3, 0x20028

    invoke-static {v0, v1, v2, v3}, Landroid/text/format/DateUtils;->formatDateTime(Landroid/content/Context;JI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b(FF)Ljava/lang/String;
    .locals 13

    .line 773
    float-to-int v6, p1

    .line 774
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v7

    .line 776
    int-to-long v0, v6

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 778
    const/16 v0, 0xc

    const/4 v1, 0x1

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 780
    invoke-virtual {v7}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v8

    .line 782
    float-to-int v10, p2

    .line 784
    int-to-long v0, v10

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 785
    const/16 v0, 0xc

    const/4 v1, -0x1

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 787
    invoke-virtual {v7}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v11

    .line 788
    iget-object v0, p0, Lo/eih$u;->e:Lo/eih;

    invoke-virtual {v0}, Lo/eih;->getContext()Landroid/content/Context;

    move-result-object v0

    move-wide v1, v8

    move-wide v3, v11

    const v5, 0x20024

    invoke-static/range {v0 .. v5}, Landroid/text/format/DateUtils;->formatDateRange(Landroid/content/Context;JJI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b(FLo/lh;)Ljava/lang/String;
    .locals 7

    .line 766
    float-to-int v5, p1

    .line 767
    new-instance v6, Ljava/text/SimpleDateFormat;

    const-string v0, "M"

    invoke-direct {v6, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 768
    new-instance v0, Ljava/util/Date;

    int-to-long v1, v5

    const-wide/16 v3, 0x3c

    mul-long/2addr v1, v3

    const-wide/16 v3, 0x3e8

    mul-long/2addr v1, v3

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v6, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b(F)Z
    .locals 7

    .line 818
    float-to-int v4, p1

    .line 820
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 822
    int-to-long v0, v4

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 824
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Ljava/util/Calendar;->get(I)I

    move-result v6

    .line 825
    const/16 v0, 0xb

    if-ne v6, v0, :cond_0

    .line 826
    const/4 v0, 0x1

    return v0

    .line 828
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public c(FLo/ln;Z)Ljava/lang/String;
    .locals 7

    .line 794
    if-eqz p3, :cond_0

    .line 795
    invoke-direct {p0, p1}, Lo/eih$u;->e(F)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 798
    :cond_0
    float-to-int v4, p1

    .line 799
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 801
    int-to-long v0, v4

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 803
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Ljava/util/Calendar;->get(I)I

    move-result v6

    .line 804
    if-eqz v6, :cond_1

    .line 805
    const/4 v0, 0x0

    return-object v0

    .line 807
    :cond_1
    invoke-direct {p0, p1}, Lo/eih$u;->e(F)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d(Z)V
    .locals 0

    .line 755
    return-void
.end method
