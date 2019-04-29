.class final Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;
.super Ljava/lang/Object;
.source "DateTimeZoneBuilder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/joda/time/tz/DateTimeZoneBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Recurrence"
.end annotation


# instance fields
.field final iNameKey:Ljava/lang/String;

.field final iOfYear:Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;

.field final iSaveMillis:I


# direct methods
.method constructor <init>(Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;Ljava/lang/String;I)V
    .locals 0

    .line 747
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 748
    iput-object p1, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;->iOfYear:Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;

    .line 749
    iput-object p2, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;->iNameKey:Ljava/lang/String;

    .line 750
    iput p3, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;->iSaveMillis:I

    return-void
.end method

.method static readFrom(Ljava/io/DataInput;)Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 740
    new-instance v0, Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;

    invoke-static {p0}, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->readFrom(Ljava/io/DataInput;)Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;

    move-result-object v1

    invoke-interface {p0}, Ljava/io/DataInput;->readUTF()Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Lorg/joda/time/tz/DateTimeZoneBuilder;->readMillis(Ljava/io/DataInput;)J

    move-result-wide v3

    long-to-int p0, v3

    invoke-direct {v0, v1, v2, p0}, Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;-><init>(Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;Ljava/lang/String;I)V

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 783
    :cond_0
    instance-of v1, p1, Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 784
    check-cast p1, Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;

    .line 785
    iget v1, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;->iSaveMillis:I

    iget v3, p1, Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;->iSaveMillis:I

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;->iNameKey:Ljava/lang/String;

    iget-object v3, p1, Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;->iNameKey:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;->iOfYear:Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;

    iget-object p1, p1, Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;->iOfYear:Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;

    invoke-virtual {v1, p1}, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public getNameKey()Ljava/lang/String;
    .locals 1

    .line 772
    iget-object v0, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;->iNameKey:Ljava/lang/String;

    return-object v0
.end method

.method public getOfYear()Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;
    .locals 1

    .line 754
    iget-object v0, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;->iOfYear:Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;

    return-object v0
.end method

.method public getSaveMillis()I
    .locals 1

    .line 776
    iget v0, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;->iSaveMillis:I

    return v0
.end method

.method public next(JII)J
    .locals 1

    .line 761
    iget-object v0, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;->iOfYear:Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->next(JII)J

    move-result-wide p1

    return-wide p1
.end method

.method public previous(JII)J
    .locals 1

    .line 768
    iget-object v0, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;->iOfYear:Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->previous(JII)J

    move-result-wide p1

    return-wide p1
.end method

.method rename(Ljava/lang/String;)Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;
    .locals 3

    .line 800
    new-instance v0, Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;

    iget-object v1, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;->iOfYear:Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;

    iget v2, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;->iSaveMillis:I

    invoke-direct {v0, v1, p1, v2}, Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;-><init>(Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;Ljava/lang/String;I)V

    return-object v0
.end method

.method renameAppend(Ljava/lang/String;)Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;
    .locals 2

    .line 804
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;->iNameKey:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;->rename(Ljava/lang/String;)Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;

    move-result-object p1

    return-object p1
.end method

.method public writeTo(Ljava/io/DataOutput;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 794
    iget-object v0, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;->iOfYear:Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;

    invoke-virtual {v0, p1}, Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;->writeTo(Ljava/io/DataOutput;)V

    .line 795
    iget-object v0, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;->iNameKey:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/io/DataOutput;->writeUTF(Ljava/lang/String;)V

    .line 796
    iget v0, p0, Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;->iSaveMillis:I

    int-to-long v0, v0

    invoke-static {p1, v0, v1}, Lorg/joda/time/tz/DateTimeZoneBuilder;->writeMillis(Ljava/io/DataOutput;J)V

    return-void
.end method
