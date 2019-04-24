.class public Lo/eih$r;
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
    name = "r"
.end annotation


# instance fields
.field private c:Z

.field final synthetic e:Lo/eih;


# direct methods
.method public constructor <init>(Lo/eih;)V
    .locals 1

    .line 579
    iput-object p1, p0, Lo/eih$r;->e:Lo/eih;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 581
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/eih$r;->c:Z

    return-void
.end method


# virtual methods
.method public a(FLo/lh;)Ljava/lang/String;
    .locals 15

    .line 591
    move/from16 v0, p1

    float-to-int v6, v0

    .line 593
    iget-object v0, p0, Lo/eih$r;->e:Lo/eih;

    iget v0, v0, Lo/eih;->aA:F

    float-to-int v0, v0

    if-ne v6, v0, :cond_0

    .line 596
    add-int/lit8 v6, v6, -0x1

    .line 598
    :cond_0
    iget-boolean v0, p0, Lo/eih$r;->c:Z

    if-nez v0, :cond_1

    .line 601
    move-object/from16 v0, p2

    invoke-virtual {p0, v6, v0}, Lo/eih$r;->d(ILo/lh;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 604
    :cond_1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v7

    .line 607
    int-to-long v0, v6

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 609
    const/16 v0, 0xc

    invoke-virtual {v7, v0}, Ljava/util/Calendar;->get(I)I

    move-result v8

    .line 611
    const/4 v9, 0x1

    .line 612
    const/16 v0, 0x1e

    if-lt v8, v0, :cond_2

    .line 613
    const/4 v9, 0x0

    .line 619
    :cond_2
    if-eqz v9, :cond_3

    .line 620
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 621
    invoke-virtual {v7}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v10

    .line 623
    const/16 v0, 0xc

    const/16 v1, 0x1e

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 624
    invoke-virtual {v7}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v12

    goto :goto_0

    .line 626
    :cond_3
    const/16 v0, 0xc

    const/16 v1, 0x1e

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 627
    invoke-virtual {v7}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v10

    .line 628
    const/4 v0, 0x5

    invoke-virtual {v7, v0}, Ljava/util/Calendar;->get(I)I

    move-result v14

    .line 630
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 631
    const/16 v0, 0xb

    const/4 v1, 0x1

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 632
    const/4 v0, 0x5

    invoke-virtual {v7, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    if-eq v0, v14, :cond_4

    .line 634
    const/16 v0, 0xc

    const/4 v1, -0x1

    invoke-virtual {v7, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 636
    :cond_4
    invoke-virtual {v7}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v12

    .line 638
    :goto_0
    iget-object v0, p0, Lo/eih$r;->e:Lo/eih;

    invoke-virtual {v0}, Lo/eih;->getContext()Landroid/content/Context;

    move-result-object v0

    move-wide v1, v10

    move-wide v3, v12

    const/16 v5, 0x81

    invoke-static/range {v0 .. v5}, Landroid/text/format/DateUtils;->formatDateRange(Landroid/content/Context;JJI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b(FF)Ljava/lang/String;
    .locals 5

    .line 652
    iget-object v0, p0, Lo/eih$r;->e:Lo/eih;

    invoke-virtual {v0}, Lo/eih;->getContext()Landroid/content/Context;

    move-result-object v0

    float-to-long v1, p1

    const-wide/16 v3, 0x3c

    mul-long/2addr v1, v3

    const-wide/16 v3, 0x3e8

    mul-long/2addr v1, v3

    const/16 v3, 0x14

    invoke-static {v0, v1, v2, v3}, Landroid/text/format/DateUtils;->formatDateTime(Landroid/content/Context;JI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b(FLo/lh;)Ljava/lang/String;
    .locals 1

    .line 643
    float-to-int v0, p1

    invoke-virtual {p0, v0, p2}, Lo/eih$r;->d(ILo/lh;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d(ILo/lh;)Ljava/lang/String;
    .locals 5

    .line 647
    iget-object v0, p0, Lo/eih$r;->e:Lo/eih;

    invoke-virtual {v0}, Lo/eih;->getContext()Landroid/content/Context;

    move-result-object v0

    int-to-long v1, p1

    const-wide/16 v3, 0x3c

    mul-long/2addr v1, v3

    const-wide/16 v3, 0x3e8

    mul-long/2addr v1, v3

    const/16 v3, 0x81

    invoke-static {v0, v1, v2, v3}, Landroid/text/format/DateUtils;->formatDateTime(Landroid/content/Context;JI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d(Z)V
    .locals 0

    .line 585
    iput-boolean p1, p0, Lo/eih$r;->c:Z

    .line 586
    return-void
.end method
