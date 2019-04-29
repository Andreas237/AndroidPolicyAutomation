.class final Lorg/joda/time/tz/DateTimeZoneBuilder$Rule;
.super Ljava/lang/Object;
.source "DateTimeZoneBuilder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/joda/time/tz/DateTimeZoneBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Rule"
.end annotation


# instance fields
.field final iFromYear:I

.field final iRecurrence:Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;

.field final iToYear:I


# direct methods
.method constructor <init>(Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;II)V
    .locals 0

    .line 816
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 817
    iput-object p1, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$Rule;->iRecurrence:Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;

    .line 818
    iput p2, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$Rule;->iFromYear:I

    .line 819
    iput p3, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$Rule;->iToYear:I

    return-void
.end method


# virtual methods
.method public getFromYear()I
    .locals 1

    .line 824
    iget v0, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$Rule;->iFromYear:I

    return v0
.end method

.method public getNameKey()Ljava/lang/String;
    .locals 1

    .line 837
    iget-object v0, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$Rule;->iRecurrence:Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;

    invoke-virtual {v0}, Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;->getNameKey()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getOfYear()Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;
    .locals 1

    .line 833
    iget-object v0, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$Rule;->iRecurrence:Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;

    invoke-virtual {v0}, Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;->getOfYear()Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;

    move-result-object v0

    return-object v0
.end method

.method public getSaveMillis()I
    .locals 1

    .line 841
    iget-object v0, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$Rule;->iRecurrence:Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;

    invoke-virtual {v0}, Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;->getSaveMillis()I

    move-result v0

    return v0
.end method

.method public getToYear()I
    .locals 1

    .line 828
    iget v0, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$Rule;->iToYear:I

    return v0
.end method

.method public next(JII)J
    .locals 8

    .line 845
    invoke-static {}, Lorg/joda/time/chrono/ISOChronology;->getInstanceUTC()Lorg/joda/time/chrono/ISOChronology;

    move-result-object v0

    add-int v1, p3, p4

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, p1, v2

    if-nez v4, :cond_0

    const/high16 v2, -0x80000000

    goto :goto_0

    .line 854
    :cond_0
    invoke-virtual {v0}, Lorg/joda/time/Chronology;->year()Lorg/joda/time/DateTimeField;

    move-result-object v2

    int-to-long v3, v1

    add-long v5, p1, v3

    invoke-virtual {v2, v5, v6}, Lorg/joda/time/DateTimeField;->get(J)I

    move-result v2

    .line 857
    :goto_0
    iget v3, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$Rule;->iFromYear:I

    if-ge v2, v3, :cond_1

    .line 859
    invoke-virtual {v0}, Lorg/joda/time/Chronology;->year()Lorg/joda/time/DateTimeField;

    move-result-object v2

    const-wide/16 v3, 0x0

    iget v5, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$Rule;->iFromYear:I

    invoke-virtual {v2, v3, v4, v5}, Lorg/joda/time/DateTimeField;->set(JI)J

    move-result-wide v2

    int-to-long v4, v1

    sub-long v6, v2, v4

    const-wide/16 v2, 0x1

    sub-long v4, v6, v2

    goto :goto_1

    :cond_1
    move-wide v4, p1

    .line 865
    :goto_1
    iget-object v2, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$Rule;->iRecurrence:Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;

    invoke-virtual {v2, v4, v5, p3, p4}, Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;->next(JII)J

    move-result-wide p3

    cmp-long v2, p3, p1

    if-lez v2, :cond_2

    .line 868
    invoke-virtual {v0}, Lorg/joda/time/Chronology;->year()Lorg/joda/time/DateTimeField;

    move-result-object v0

    int-to-long v1, v1

    add-long v3, p3, v1

    invoke-virtual {v0, v3, v4}, Lorg/joda/time/DateTimeField;->get(J)I

    move-result v0

    .line 869
    iget v1, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$Rule;->iToYear:I

    if-le v0, v1, :cond_2

    goto :goto_2

    :cond_2
    move-wide p1, p3

    :goto_2
    return-wide p1
.end method
