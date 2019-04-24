.class public Lo/eih$q;
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
    name = "q"
.end annotation


# instance fields
.field private b:Lo/eih$s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/eih<TT;>.s;"
        }
    .end annotation
.end field

.field final synthetic c:Lo/eih;


# direct methods
.method public constructor <init>(Lo/eih;)V
    .locals 2

    .line 658
    iput-object p1, p0, Lo/eih$q;->c:Lo/eih;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 660
    new-instance v0, Lo/eih$s;

    iget-object v1, p0, Lo/eih$q;->c:Lo/eih;

    invoke-direct {v0, v1}, Lo/eih$s;-><init>(Lo/eih;)V

    iput-object v0, p0, Lo/eih$q;->b:Lo/eih$s;

    return-void
.end method


# virtual methods
.method public a(FLo/lh;)Ljava/lang/String;
    .locals 6

    .line 668
    float-to-int v5, p1

    .line 669
    iget-object v0, p0, Lo/eih$q;->c:Lo/eih;

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

.method public a(FLo/lh;Z)Ljava/lang/String;
    .locals 7

    .line 707
    if-eqz p3, :cond_0

    .line 708
    iget-object v0, p0, Lo/eih$q;->b:Lo/eih$s;

    invoke-virtual {v0, p1, p2}, Lo/eih$s;->b(FLo/lh;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 710
    :cond_0
    float-to-int v4, p1

    .line 712
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 715
    int-to-long v0, v4

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 716
    const/4 v0, 0x7

    invoke-virtual {v5, v0}, Ljava/util/Calendar;->get(I)I

    move-result v6

    .line 717
    invoke-static {}, Lo/eke;->c()I

    move-result v0

    if-eq v6, v0, :cond_1

    .line 718
    const/4 v0, 0x0

    return-object v0

    .line 720
    :cond_1
    iget-object v0, p0, Lo/eih$q;->b:Lo/eih$s;

    invoke-virtual {v0, p1, p2}, Lo/eih$s;->b(FLo/lh;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(F)Z
    .locals 7

    .line 725
    float-to-int v4, p1

    .line 727
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 730
    int-to-long v0, v4

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 731
    const/4 v0, 0x7

    invoke-virtual {v5, v0}, Ljava/util/Calendar;->get(I)I

    move-result v6

    .line 732
    invoke-static {}, Lo/eke;->b()I

    move-result v0

    if-ne v6, v0, :cond_0

    .line 733
    const/4 v0, 0x1

    return v0

    .line 735
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public b(FF)Ljava/lang/String;
    .locals 7

    .line 740
    iget-object v0, p0, Lo/eih$q;->c:Lo/eih;

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

.method public b(FLo/lh;)Ljava/lang/String;
    .locals 8

    .line 675
    float-to-int v4, p1

    .line 677
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 680
    int-to-long v0, v4

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 681
    const/4 v0, 0x7

    invoke-virtual {v5, v0}, Ljava/util/Calendar;->get(I)I

    move-result v6

    .line 682
    iget-object v0, p0, Lo/eih$q;->c:Lo/eih;

    invoke-virtual {v0}, Lo/eih;->getContext()Landroid/content/Context;

    move-result-object v7

    .line 684
    const/4 v0, 0x1

    if-ne v6, v0, :cond_0

    .line 685
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_sunday:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 686
    :cond_0
    const/4 v0, 0x2

    if-ne v6, v0, :cond_1

    .line 687
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_monday:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 688
    :cond_1
    const/4 v0, 0x3

    if-ne v6, v0, :cond_2

    .line 689
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_tuesday:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 690
    :cond_2
    const/4 v0, 0x4

    if-ne v6, v0, :cond_3

    .line 691
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_wednesday:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 692
    :cond_3
    const/4 v0, 0x5

    if-ne v6, v0, :cond_4

    .line 693
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_thursday:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 694
    :cond_4
    const/4 v0, 0x6

    if-ne v6, v0, :cond_5

    .line 695
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_friday:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 696
    :cond_5
    const/4 v0, 0x7

    if-ne v6, v0, :cond_6

    .line 697
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_saturday:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 699
    :cond_6
    const-string v0, ""

    return-object v0
.end method

.method public d(Z)V
    .locals 0

    .line 664
    return-void
.end method
