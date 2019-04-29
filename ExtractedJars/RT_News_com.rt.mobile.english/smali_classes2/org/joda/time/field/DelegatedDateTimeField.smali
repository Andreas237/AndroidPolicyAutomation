.class public Lorg/joda/time/field/DelegatedDateTimeField;
.super Lorg/joda/time/DateTimeField;
.source "DelegatedDateTimeField.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x41a4eb7f342b7c67L


# instance fields
.field private final iField:Lorg/joda/time/DateTimeField;

.field private final iRangeDurationField:Lorg/joda/time/DurationField;

.field private final iType:Lorg/joda/time/DateTimeFieldType;


# direct methods
.method public constructor <init>(Lorg/joda/time/DateTimeField;)V
    .locals 1

    const/4 v0, 0x0

    .line 54
    invoke-direct {p0, p1, v0}, Lorg/joda/time/field/DelegatedDateTimeField;-><init>(Lorg/joda/time/DateTimeField;Lorg/joda/time/DateTimeFieldType;)V

    return-void
.end method

.method public constructor <init>(Lorg/joda/time/DateTimeField;Lorg/joda/time/DateTimeFieldType;)V
    .locals 1

    const/4 v0, 0x0

    .line 64
    invoke-direct {p0, p1, v0, p2}, Lorg/joda/time/field/DelegatedDateTimeField;-><init>(Lorg/joda/time/DateTimeField;Lorg/joda/time/DurationField;Lorg/joda/time/DateTimeFieldType;)V

    return-void
.end method

.method public constructor <init>(Lorg/joda/time/DateTimeField;Lorg/joda/time/DurationField;Lorg/joda/time/DateTimeFieldType;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Lorg/joda/time/DateTimeField;-><init>()V

    if-nez p1, :cond_0

    .line 77
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The field must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 79
    :cond_0
    iput-object p1, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    .line 80
    iput-object p2, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iRangeDurationField:Lorg/joda/time/DurationField;

    if-nez p3, :cond_1

    .line 81
    invoke-virtual {p1}, Lorg/joda/time/DateTimeField;->getType()Lorg/joda/time/DateTimeFieldType;

    move-result-object p3

    :cond_1
    iput-object p3, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iType:Lorg/joda/time/DateTimeFieldType;

    return-void
.end method


# virtual methods
.method public add(JI)J
    .locals 1

    .line 154
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2, p3}, Lorg/joda/time/DateTimeField;->add(JI)J

    move-result-wide p1

    return-wide p1
.end method

.method public add(JJ)J
    .locals 1

    .line 158
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/joda/time/DateTimeField;->add(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public add(Lorg/joda/time/ReadablePartial;I[II)[I
    .locals 1

    .line 162
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/joda/time/DateTimeField;->add(Lorg/joda/time/ReadablePartial;I[II)[I

    move-result-object p1

    return-object p1
.end method

.method public addWrapField(JI)J
    .locals 1

    .line 170
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2, p3}, Lorg/joda/time/DateTimeField;->addWrapField(JI)J

    move-result-wide p1

    return-wide p1
.end method

.method public addWrapField(Lorg/joda/time/ReadablePartial;I[II)[I
    .locals 1

    .line 174
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/joda/time/DateTimeField;->addWrapField(Lorg/joda/time/ReadablePartial;I[II)[I

    move-result-object p1

    return-object p1
.end method

.method public addWrapPartial(Lorg/joda/time/ReadablePartial;I[II)[I
    .locals 1

    .line 166
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/joda/time/DateTimeField;->addWrapPartial(Lorg/joda/time/ReadablePartial;I[II)[I

    move-result-object p1

    return-object p1
.end method

.method public get(J)I
    .locals 1

    .line 110
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2}, Lorg/joda/time/DateTimeField;->get(J)I

    move-result p1

    return p1
.end method

.method public getAsShortText(ILjava/util/Locale;)Ljava/lang/String;
    .locals 1

    .line 150
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2}, Lorg/joda/time/DateTimeField;->getAsShortText(ILjava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getAsShortText(J)Ljava/lang/String;
    .locals 1

    .line 138
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2}, Lorg/joda/time/DateTimeField;->getAsShortText(J)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getAsShortText(JLjava/util/Locale;)Ljava/lang/String;
    .locals 1

    .line 134
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2, p3}, Lorg/joda/time/DateTimeField;->getAsShortText(JLjava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getAsShortText(Lorg/joda/time/ReadablePartial;ILjava/util/Locale;)Ljava/lang/String;
    .locals 1

    .line 142
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2, p3}, Lorg/joda/time/DateTimeField;->getAsShortText(Lorg/joda/time/ReadablePartial;ILjava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getAsShortText(Lorg/joda/time/ReadablePartial;Ljava/util/Locale;)Ljava/lang/String;
    .locals 1

    .line 146
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2}, Lorg/joda/time/DateTimeField;->getAsShortText(Lorg/joda/time/ReadablePartial;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getAsText(ILjava/util/Locale;)Ljava/lang/String;
    .locals 1

    .line 130
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2}, Lorg/joda/time/DateTimeField;->getAsText(ILjava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getAsText(J)Ljava/lang/String;
    .locals 1

    .line 118
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2}, Lorg/joda/time/DateTimeField;->getAsText(J)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getAsText(JLjava/util/Locale;)Ljava/lang/String;
    .locals 1

    .line 114
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2, p3}, Lorg/joda/time/DateTimeField;->getAsText(JLjava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getAsText(Lorg/joda/time/ReadablePartial;ILjava/util/Locale;)Ljava/lang/String;
    .locals 1

    .line 122
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2, p3}, Lorg/joda/time/DateTimeField;->getAsText(Lorg/joda/time/ReadablePartial;ILjava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getAsText(Lorg/joda/time/ReadablePartial;Ljava/util/Locale;)Ljava/lang/String;
    .locals 1

    .line 126
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2}, Lorg/joda/time/DateTimeField;->getAsText(Lorg/joda/time/ReadablePartial;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getDifference(JJ)I
    .locals 1

    .line 178
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/joda/time/DateTimeField;->getDifference(JJ)I

    move-result p1

    return p1
.end method

.method public getDifferenceAsLong(JJ)J
    .locals 1

    .line 182
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/joda/time/DateTimeField;->getDifferenceAsLong(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public getDurationField()Lorg/joda/time/DurationField;
    .locals 1

    .line 206
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0}, Lorg/joda/time/DateTimeField;->getDurationField()Lorg/joda/time/DurationField;

    move-result-object v0

    return-object v0
.end method

.method public getLeapAmount(J)I
    .locals 1

    .line 221
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2}, Lorg/joda/time/DateTimeField;->getLeapAmount(J)I

    move-result p1

    return p1
.end method

.method public getLeapDurationField()Lorg/joda/time/DurationField;
    .locals 1

    .line 225
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0}, Lorg/joda/time/DateTimeField;->getLeapDurationField()Lorg/joda/time/DurationField;

    move-result-object v0

    return-object v0
.end method

.method public getMaximumShortTextLength(Ljava/util/Locale;)I
    .locals 1

    .line 265
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1}, Lorg/joda/time/DateTimeField;->getMaximumShortTextLength(Ljava/util/Locale;)I

    move-result p1

    return p1
.end method

.method public getMaximumTextLength(Ljava/util/Locale;)I
    .locals 1

    .line 261
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1}, Lorg/joda/time/DateTimeField;->getMaximumTextLength(Ljava/util/Locale;)I

    move-result p1

    return p1
.end method

.method public getMaximumValue()I
    .locals 1

    .line 245
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0}, Lorg/joda/time/DateTimeField;->getMaximumValue()I

    move-result v0

    return v0
.end method

.method public getMaximumValue(J)I
    .locals 1

    .line 249
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2}, Lorg/joda/time/DateTimeField;->getMaximumValue(J)I

    move-result p1

    return p1
.end method

.method public getMaximumValue(Lorg/joda/time/ReadablePartial;)I
    .locals 1

    .line 253
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1}, Lorg/joda/time/DateTimeField;->getMaximumValue(Lorg/joda/time/ReadablePartial;)I

    move-result p1

    return p1
.end method

.method public getMaximumValue(Lorg/joda/time/ReadablePartial;[I)I
    .locals 1

    .line 257
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2}, Lorg/joda/time/DateTimeField;->getMaximumValue(Lorg/joda/time/ReadablePartial;[I)I

    move-result p1

    return p1
.end method

.method public getMinimumValue()I
    .locals 1

    .line 229
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0}, Lorg/joda/time/DateTimeField;->getMinimumValue()I

    move-result v0

    return v0
.end method

.method public getMinimumValue(J)I
    .locals 1

    .line 233
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2}, Lorg/joda/time/DateTimeField;->getMinimumValue(J)I

    move-result p1

    return p1
.end method

.method public getMinimumValue(Lorg/joda/time/ReadablePartial;)I
    .locals 1

    .line 237
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1}, Lorg/joda/time/DateTimeField;->getMinimumValue(Lorg/joda/time/ReadablePartial;)I

    move-result p1

    return p1
.end method

.method public getMinimumValue(Lorg/joda/time/ReadablePartial;[I)I
    .locals 1

    .line 241
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2}, Lorg/joda/time/DateTimeField;->getMinimumValue(Lorg/joda/time/ReadablePartial;[I)I

    move-result p1

    return p1
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 98
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iType:Lorg/joda/time/DateTimeFieldType;

    invoke-virtual {v0}, Lorg/joda/time/DateTimeFieldType;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getRangeDurationField()Lorg/joda/time/DurationField;
    .locals 1

    .line 210
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iRangeDurationField:Lorg/joda/time/DurationField;

    if-eqz v0, :cond_0

    .line 211
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iRangeDurationField:Lorg/joda/time/DurationField;

    return-object v0

    .line 213
    :cond_0
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0}, Lorg/joda/time/DateTimeField;->getRangeDurationField()Lorg/joda/time/DurationField;

    move-result-object v0

    return-object v0
.end method

.method public getType()Lorg/joda/time/DateTimeFieldType;
    .locals 1

    .line 94
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iType:Lorg/joda/time/DateTimeFieldType;

    return-object v0
.end method

.method public final getWrappedField()Lorg/joda/time/DateTimeField;
    .locals 1

    .line 90
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    return-object v0
.end method

.method public isLeap(J)Z
    .locals 1

    .line 217
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2}, Lorg/joda/time/DateTimeField;->isLeap(J)Z

    move-result p1

    return p1
.end method

.method public isLenient()Z
    .locals 1

    .line 106
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0}, Lorg/joda/time/DateTimeField;->isLenient()Z

    move-result v0

    return v0
.end method

.method public isSupported()Z
    .locals 1

    .line 102
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0}, Lorg/joda/time/DateTimeField;->isSupported()Z

    move-result v0

    return v0
.end method

.method public remainder(J)J
    .locals 1

    .line 289
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2}, Lorg/joda/time/DateTimeField;->remainder(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public roundCeiling(J)J
    .locals 1

    .line 273
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2}, Lorg/joda/time/DateTimeField;->roundCeiling(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public roundFloor(J)J
    .locals 1

    .line 269
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2}, Lorg/joda/time/DateTimeField;->roundFloor(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public roundHalfCeiling(J)J
    .locals 1

    .line 281
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2}, Lorg/joda/time/DateTimeField;->roundHalfCeiling(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public roundHalfEven(J)J
    .locals 1

    .line 285
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2}, Lorg/joda/time/DateTimeField;->roundHalfEven(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public roundHalfFloor(J)J
    .locals 1

    .line 277
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2}, Lorg/joda/time/DateTimeField;->roundHalfFloor(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public set(JI)J
    .locals 1

    .line 186
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2, p3}, Lorg/joda/time/DateTimeField;->set(JI)J

    move-result-wide p1

    return-wide p1
.end method

.method public set(JLjava/lang/String;)J
    .locals 1

    .line 194
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2, p3}, Lorg/joda/time/DateTimeField;->set(JLjava/lang/String;)J

    move-result-wide p1

    return-wide p1
.end method

.method public set(JLjava/lang/String;Ljava/util/Locale;)J
    .locals 1

    .line 190
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/joda/time/DateTimeField;->set(JLjava/lang/String;Ljava/util/Locale;)J

    move-result-wide p1

    return-wide p1
.end method

.method public set(Lorg/joda/time/ReadablePartial;I[II)[I
    .locals 1

    .line 198
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/joda/time/DateTimeField;->set(Lorg/joda/time/ReadablePartial;I[II)[I

    move-result-object p1

    return-object p1
.end method

.method public set(Lorg/joda/time/ReadablePartial;I[ILjava/lang/String;Ljava/util/Locale;)[I
    .locals 6

    .line 202
    iget-object v0, p0, Lorg/joda/time/field/DelegatedDateTimeField;->iField:Lorg/joda/time/DateTimeField;

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lorg/joda/time/DateTimeField;->set(Lorg/joda/time/ReadablePartial;I[ILjava/lang/String;Ljava/util/Locale;)[I

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 293
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DateTimeField["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/joda/time/field/DelegatedDateTimeField;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
