.class Lo/ewf$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ewf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field b:I

.field c:I

.field d:Lo/ewf$d;

.field e:Z


# direct methods
.method public constructor <init>(IILo/ewf$d;Z)V
    .locals 0

    .line 605
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 606
    iput p1, p0, Lo/ewf$a;->c:I

    .line 607
    iput p2, p0, Lo/ewf$a;->b:I

    .line 608
    iput-object p3, p0, Lo/ewf$a;->d:Lo/ewf$d;

    .line 609
    iput-boolean p4, p0, Lo/ewf$a;->e:Z

    .line 610
    return-void
.end method

.method private static a(J)J
    .locals 3

    .line 651
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 652
    invoke-virtual {v2, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 653
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 654
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 655
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 656
    const/16 v0, 0xb

    const/16 v1, 0xc

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 657
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method private static b(J)J
    .locals 3

    .line 640
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 641
    invoke-virtual {v2, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 642
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 643
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 644
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 645
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 646
    const/4 v0, 0x5

    const/16 v1, 0xf

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 647
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public static c(JI)J
    .locals 3

    .line 661
    if-nez p2, :cond_0

    .line 662
    return-wide p0

    .line 663
    :cond_0
    const/4 v0, 0x3

    if-ne p2, v0, :cond_1

    .line 664
    invoke-static {p0, p1}, Lo/ewf$a;->a(J)J

    move-result-wide v0

    return-wide v0

    .line 665
    :cond_1
    const/4 v0, 0x5

    if-ne p2, v0, :cond_2

    .line 666
    invoke-static {p0, p1}, Lo/ewf$a;->b(J)J

    move-result-wide v0

    return-wide v0

    .line 667
    :cond_2
    const/4 v0, 0x6

    if-ne p2, v0, :cond_3

    .line 668
    invoke-static {p0, p1}, Lo/ewf$a;->e(J)J

    move-result-wide v0

    return-wide v0

    .line 670
    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "correctTimeStamp not support uniteType:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static e(J)J
    .locals 3

    .line 628
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 629
    invoke-virtual {v2, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 630
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 631
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 632
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 633
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 634
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 635
    const/4 v0, 0x2

    const/4 v1, 0x5

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 636
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public d(J)J
    .locals 3

    .line 614
    iget v0, p0, Lo/ewf$a;->b:I

    if-nez v0, :cond_0

    .line 615
    return-wide p1

    .line 616
    :cond_0
    iget v0, p0, Lo/ewf$a;->b:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 617
    invoke-static {p1, p2}, Lo/ewf$a;->a(J)J

    move-result-wide v0

    return-wide v0

    .line 618
    :cond_1
    iget v0, p0, Lo/ewf$a;->b:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_2

    .line 619
    invoke-static {p1, p2}, Lo/ewf$a;->b(J)J

    move-result-wide v0

    return-wide v0

    .line 620
    :cond_2
    iget v0, p0, Lo/ewf$a;->b:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_3

    .line 621
    invoke-static {p1, p2}, Lo/ewf$a;->e(J)J

    move-result-wide v0

    return-wide v0

    .line 624
    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "correctTimeStamp not support uniteType:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/ewf$a;->b:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
