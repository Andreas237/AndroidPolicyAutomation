.class final Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;
.super Lorg/joda/time/chrono/GJChronology$CutoverField;
.source "GJChronology.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/joda/time/chrono/GJChronology;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "ImpreciseCutoverField"
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x2f53a32d270c62f9L


# instance fields
.field final synthetic this$0:Lorg/joda/time/chrono/GJChronology;


# direct methods
.method constructor <init>(Lorg/joda/time/chrono/GJChronology;Lorg/joda/time/DateTimeField;Lorg/joda/time/DateTimeField;J)V
    .locals 8

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v5, p4

    .line 951
    invoke-direct/range {v0 .. v7}, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;-><init>(Lorg/joda/time/chrono/GJChronology;Lorg/joda/time/DateTimeField;Lorg/joda/time/DateTimeField;Lorg/joda/time/DurationField;JZ)V

    return-void
.end method

.method constructor <init>(Lorg/joda/time/chrono/GJChronology;Lorg/joda/time/DateTimeField;Lorg/joda/time/DateTimeField;Lorg/joda/time/DurationField;J)V
    .locals 8

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-wide v5, p5

    .line 962
    invoke-direct/range {v0 .. v7}, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;-><init>(Lorg/joda/time/chrono/GJChronology;Lorg/joda/time/DateTimeField;Lorg/joda/time/DateTimeField;Lorg/joda/time/DurationField;JZ)V

    return-void
.end method

.method constructor <init>(Lorg/joda/time/chrono/GJChronology;Lorg/joda/time/DateTimeField;Lorg/joda/time/DateTimeField;Lorg/joda/time/DurationField;JZ)V
    .locals 7

    .line 985
    iput-object p1, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->this$0:Lorg/joda/time/chrono/GJChronology;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p5

    move v6, p7

    .line 986
    invoke-direct/range {v0 .. v6}, Lorg/joda/time/chrono/GJChronology$CutoverField;-><init>(Lorg/joda/time/chrono/GJChronology;Lorg/joda/time/DateTimeField;Lorg/joda/time/DateTimeField;JZ)V

    if-nez p4, :cond_0

    .line 988
    new-instance p4, Lorg/joda/time/chrono/GJChronology$LinkedDurationField;

    iget-object p1, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iDurationField:Lorg/joda/time/DurationField;

    invoke-direct {p4, p1, p0}, Lorg/joda/time/chrono/GJChronology$LinkedDurationField;-><init>(Lorg/joda/time/DurationField;Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;)V

    .line 990
    :cond_0
    iput-object p4, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iDurationField:Lorg/joda/time/DurationField;

    return-void
.end method

.method constructor <init>(Lorg/joda/time/chrono/GJChronology;Lorg/joda/time/DateTimeField;Lorg/joda/time/DateTimeField;Lorg/joda/time/DurationField;Lorg/joda/time/DurationField;J)V
    .locals 8

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-wide v5, p6

    .line 973
    invoke-direct/range {v0 .. v7}, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;-><init>(Lorg/joda/time/chrono/GJChronology;Lorg/joda/time/DateTimeField;Lorg/joda/time/DateTimeField;Lorg/joda/time/DurationField;JZ)V

    .line 974
    iput-object p5, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iRangeDurationField:Lorg/joda/time/DurationField;

    return-void
.end method


# virtual methods
.method public add(JI)J
    .locals 4

    .line 994
    iget-wide v0, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iCutover:J

    cmp-long v2, p1, v0

    if-ltz v2, :cond_2

    .line 995
    iget-object v0, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iGregorianField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2, p3}, Lorg/joda/time/DateTimeField;->add(JI)J

    move-result-wide p1

    .line 996
    iget-wide v0, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iCutover:J

    cmp-long p3, p1, v0

    if-gez p3, :cond_3

    .line 998
    iget-object p3, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->this$0:Lorg/joda/time/chrono/GJChronology;

    invoke-static {p3}, Lorg/joda/time/chrono/GJChronology;->access$000(Lorg/joda/time/chrono/GJChronology;)J

    move-result-wide v0

    add-long v2, p1, v0

    iget-wide v0, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iCutover:J

    cmp-long p3, v2, v0

    if-gez p3, :cond_3

    .line 999
    iget-boolean p3, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iConvertByWeekyear:Z

    const/4 v0, -0x1

    if-eqz p3, :cond_0

    .line 1000
    iget-object p3, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->this$0:Lorg/joda/time/chrono/GJChronology;

    invoke-static {p3}, Lorg/joda/time/chrono/GJChronology;->access$100(Lorg/joda/time/chrono/GJChronology;)Lorg/joda/time/chrono/GregorianChronology;

    move-result-object p3

    invoke-virtual {p3}, Lorg/joda/time/chrono/GregorianChronology;->weekyear()Lorg/joda/time/DateTimeField;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, Lorg/joda/time/DateTimeField;->get(J)I

    move-result p3

    if-gtz p3, :cond_1

    .line 1002
    iget-object p3, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->this$0:Lorg/joda/time/chrono/GJChronology;

    invoke-static {p3}, Lorg/joda/time/chrono/GJChronology;->access$100(Lorg/joda/time/chrono/GJChronology;)Lorg/joda/time/chrono/GregorianChronology;

    move-result-object p3

    invoke-virtual {p3}, Lorg/joda/time/chrono/GregorianChronology;->weekyear()Lorg/joda/time/DateTimeField;

    move-result-object p3

    invoke-virtual {p3, p1, p2, v0}, Lorg/joda/time/DateTimeField;->add(JI)J

    move-result-wide p1

    goto :goto_0

    .line 1005
    :cond_0
    iget-object p3, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->this$0:Lorg/joda/time/chrono/GJChronology;

    invoke-static {p3}, Lorg/joda/time/chrono/GJChronology;->access$100(Lorg/joda/time/chrono/GJChronology;)Lorg/joda/time/chrono/GregorianChronology;

    move-result-object p3

    invoke-virtual {p3}, Lorg/joda/time/chrono/GregorianChronology;->year()Lorg/joda/time/DateTimeField;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, Lorg/joda/time/DateTimeField;->get(J)I

    move-result p3

    if-gtz p3, :cond_1

    .line 1007
    iget-object p3, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->this$0:Lorg/joda/time/chrono/GJChronology;

    invoke-static {p3}, Lorg/joda/time/chrono/GJChronology;->access$100(Lorg/joda/time/chrono/GJChronology;)Lorg/joda/time/chrono/GregorianChronology;

    move-result-object p3

    invoke-virtual {p3}, Lorg/joda/time/chrono/GregorianChronology;->year()Lorg/joda/time/DateTimeField;

    move-result-object p3

    invoke-virtual {p3, p1, p2, v0}, Lorg/joda/time/DateTimeField;->add(JI)J

    move-result-wide p1

    .line 1010
    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2}, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->gregorianToJulian(J)J

    move-result-wide p1

    goto :goto_1

    .line 1014
    :cond_2
    iget-object v0, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iJulianField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2, p3}, Lorg/joda/time/DateTimeField;->add(JI)J

    move-result-wide p1

    .line 1015
    iget-wide v0, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iCutover:J

    cmp-long p3, p1, v0

    if-ltz p3, :cond_3

    .line 1017
    iget-object p3, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->this$0:Lorg/joda/time/chrono/GJChronology;

    invoke-static {p3}, Lorg/joda/time/chrono/GJChronology;->access$000(Lorg/joda/time/chrono/GJChronology;)J

    move-result-wide v0

    sub-long v2, p1, v0

    iget-wide v0, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iCutover:J

    cmp-long p3, v2, v0

    if-ltz p3, :cond_3

    .line 1019
    invoke-virtual {p0, p1, p2}, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->julianToGregorian(J)J

    move-result-wide p1

    :cond_3
    :goto_1
    return-wide p1
.end method

.method public add(JJ)J
    .locals 3

    .line 1027
    iget-wide v0, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iCutover:J

    cmp-long v2, p1, v0

    if-ltz v2, :cond_2

    .line 1028
    iget-object v0, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iGregorianField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/joda/time/DateTimeField;->add(JJ)J

    move-result-wide p1

    .line 1029
    iget-wide p3, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iCutover:J

    cmp-long v0, p1, p3

    if-gez v0, :cond_3

    .line 1031
    iget-object p3, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->this$0:Lorg/joda/time/chrono/GJChronology;

    invoke-static {p3}, Lorg/joda/time/chrono/GJChronology;->access$000(Lorg/joda/time/chrono/GJChronology;)J

    move-result-wide p3

    add-long v0, p1, p3

    iget-wide p3, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iCutover:J

    cmp-long v2, v0, p3

    if-gez v2, :cond_3

    .line 1032
    iget-boolean p3, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iConvertByWeekyear:Z

    const/4 p4, -0x1

    if-eqz p3, :cond_0

    .line 1033
    iget-object p3, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->this$0:Lorg/joda/time/chrono/GJChronology;

    invoke-static {p3}, Lorg/joda/time/chrono/GJChronology;->access$100(Lorg/joda/time/chrono/GJChronology;)Lorg/joda/time/chrono/GregorianChronology;

    move-result-object p3

    invoke-virtual {p3}, Lorg/joda/time/chrono/GregorianChronology;->weekyear()Lorg/joda/time/DateTimeField;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, Lorg/joda/time/DateTimeField;->get(J)I

    move-result p3

    if-gtz p3, :cond_1

    .line 1035
    iget-object p3, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->this$0:Lorg/joda/time/chrono/GJChronology;

    invoke-static {p3}, Lorg/joda/time/chrono/GJChronology;->access$100(Lorg/joda/time/chrono/GJChronology;)Lorg/joda/time/chrono/GregorianChronology;

    move-result-object p3

    invoke-virtual {p3}, Lorg/joda/time/chrono/GregorianChronology;->weekyear()Lorg/joda/time/DateTimeField;

    move-result-object p3

    invoke-virtual {p3, p1, p2, p4}, Lorg/joda/time/DateTimeField;->add(JI)J

    move-result-wide p1

    goto :goto_0

    .line 1038
    :cond_0
    iget-object p3, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->this$0:Lorg/joda/time/chrono/GJChronology;

    invoke-static {p3}, Lorg/joda/time/chrono/GJChronology;->access$100(Lorg/joda/time/chrono/GJChronology;)Lorg/joda/time/chrono/GregorianChronology;

    move-result-object p3

    invoke-virtual {p3}, Lorg/joda/time/chrono/GregorianChronology;->year()Lorg/joda/time/DateTimeField;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, Lorg/joda/time/DateTimeField;->get(J)I

    move-result p3

    if-gtz p3, :cond_1

    .line 1040
    iget-object p3, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->this$0:Lorg/joda/time/chrono/GJChronology;

    invoke-static {p3}, Lorg/joda/time/chrono/GJChronology;->access$100(Lorg/joda/time/chrono/GJChronology;)Lorg/joda/time/chrono/GregorianChronology;

    move-result-object p3

    invoke-virtual {p3}, Lorg/joda/time/chrono/GregorianChronology;->year()Lorg/joda/time/DateTimeField;

    move-result-object p3

    invoke-virtual {p3, p1, p2, p4}, Lorg/joda/time/DateTimeField;->add(JI)J

    move-result-wide p1

    .line 1043
    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2}, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->gregorianToJulian(J)J

    move-result-wide p1

    goto :goto_1

    .line 1047
    :cond_2
    iget-object v0, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iJulianField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/joda/time/DateTimeField;->add(JJ)J

    move-result-wide p1

    .line 1048
    iget-wide p3, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iCutover:J

    cmp-long v0, p1, p3

    if-ltz v0, :cond_3

    .line 1050
    iget-object p3, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->this$0:Lorg/joda/time/chrono/GJChronology;

    invoke-static {p3}, Lorg/joda/time/chrono/GJChronology;->access$000(Lorg/joda/time/chrono/GJChronology;)J

    move-result-wide p3

    sub-long v0, p1, p3

    iget-wide p3, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iCutover:J

    cmp-long v2, v0, p3

    if-ltz v2, :cond_3

    .line 1052
    invoke-virtual {p0, p1, p2}, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->julianToGregorian(J)J

    move-result-wide p1

    :cond_3
    :goto_1
    return-wide p1
.end method

.method public getDifference(JJ)I
    .locals 3

    .line 1060
    iget-wide v0, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iCutover:J

    cmp-long v2, p1, v0

    if-ltz v2, :cond_1

    .line 1061
    iget-wide v0, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iCutover:J

    cmp-long v2, p3, v0

    if-ltz v2, :cond_0

    .line 1062
    iget-object v0, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iGregorianField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/joda/time/DateTimeField;->getDifference(JJ)I

    move-result p1

    return p1

    .line 1066
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->gregorianToJulian(J)J

    move-result-wide p1

    .line 1067
    iget-object v0, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iJulianField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/joda/time/DateTimeField;->getDifference(JJ)I

    move-result p1

    return p1

    .line 1069
    :cond_1
    iget-wide v0, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iCutover:J

    cmp-long v2, p3, v0

    if-gez v2, :cond_2

    .line 1070
    iget-object v0, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iJulianField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/joda/time/DateTimeField;->getDifference(JJ)I

    move-result p1

    return p1

    .line 1074
    :cond_2
    invoke-virtual {p0, p1, p2}, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->julianToGregorian(J)J

    move-result-wide p1

    .line 1075
    iget-object v0, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iGregorianField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/joda/time/DateTimeField;->getDifference(JJ)I

    move-result p1

    return p1
.end method

.method public getDifferenceAsLong(JJ)J
    .locals 3

    .line 1080
    iget-wide v0, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iCutover:J

    cmp-long v2, p1, v0

    if-ltz v2, :cond_1

    .line 1081
    iget-wide v0, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iCutover:J

    cmp-long v2, p3, v0

    if-ltz v2, :cond_0

    .line 1082
    iget-object v0, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iGregorianField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/joda/time/DateTimeField;->getDifferenceAsLong(JJ)J

    move-result-wide p1

    return-wide p1

    .line 1086
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->gregorianToJulian(J)J

    move-result-wide p1

    .line 1087
    iget-object v0, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iJulianField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/joda/time/DateTimeField;->getDifferenceAsLong(JJ)J

    move-result-wide p1

    return-wide p1

    .line 1089
    :cond_1
    iget-wide v0, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iCutover:J

    cmp-long v2, p3, v0

    if-gez v2, :cond_2

    .line 1090
    iget-object v0, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iJulianField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/joda/time/DateTimeField;->getDifferenceAsLong(JJ)J

    move-result-wide p1

    return-wide p1

    .line 1094
    :cond_2
    invoke-virtual {p0, p1, p2}, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->julianToGregorian(J)J

    move-result-wide p1

    .line 1095
    iget-object v0, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iGregorianField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/joda/time/DateTimeField;->getDifferenceAsLong(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public getMaximumValue(J)I
    .locals 3

    .line 1118
    iget-wide v0, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iCutover:J

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    .line 1119
    iget-object v0, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iGregorianField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2}, Lorg/joda/time/DateTimeField;->getMaximumValue(J)I

    move-result p1

    return p1

    .line 1121
    :cond_0
    iget-object v0, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iJulianField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2}, Lorg/joda/time/DateTimeField;->getMaximumValue(J)I

    move-result p1

    return p1
.end method

.method public getMinimumValue(J)I
    .locals 3

    .line 1110
    iget-wide v0, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iCutover:J

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    .line 1111
    iget-object v0, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iGregorianField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2}, Lorg/joda/time/DateTimeField;->getMinimumValue(J)I

    move-result p1

    return p1

    .line 1113
    :cond_0
    iget-object v0, p0, Lorg/joda/time/chrono/GJChronology$ImpreciseCutoverField;->iJulianField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2}, Lorg/joda/time/DateTimeField;->getMinimumValue(J)I

    move-result p1

    return p1
.end method
