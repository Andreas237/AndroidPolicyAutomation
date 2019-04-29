.class public final Lorg/joda/time/Partial;
.super Lorg/joda/time/base/AbstractPartial;
.source "Partial.java"

# interfaces
.implements Lorg/joda/time/ReadablePartial;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/joda/time/Partial$Property;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0xb356edd9a8aL


# instance fields
.field private final iChronology:Lorg/joda/time/Chronology;

.field private transient iFormatter:[Lorg/joda/time/format/DateTimeFormatter;

.field private final iTypes:[Lorg/joda/time/DateTimeFieldType;

.field private final iValues:[I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 103
    check-cast v0, Lorg/joda/time/Chronology;

    invoke-direct {p0, v0}, Lorg/joda/time/Partial;-><init>(Lorg/joda/time/Chronology;)V

    return-void
.end method

.method public constructor <init>(Lorg/joda/time/Chronology;)V
    .locals 1

    .line 123
    invoke-direct {p0}, Lorg/joda/time/base/AbstractPartial;-><init>()V

    .line 124
    invoke-static {p1}, Lorg/joda/time/DateTimeUtils;->getChronology(Lorg/joda/time/Chronology;)Lorg/joda/time/Chronology;

    move-result-object p1

    invoke-virtual {p1}, Lorg/joda/time/Chronology;->withUTC()Lorg/joda/time/Chronology;

    move-result-object p1

    iput-object p1, p0, Lorg/joda/time/Partial;->iChronology:Lorg/joda/time/Chronology;

    const/4 p1, 0x0

    .line 125
    new-array v0, p1, [Lorg/joda/time/DateTimeFieldType;

    iput-object v0, p0, Lorg/joda/time/Partial;->iTypes:[Lorg/joda/time/DateTimeFieldType;

    .line 126
    new-array p1, p1, [I

    iput-object p1, p0, Lorg/joda/time/Partial;->iValues:[I

    return-void
.end method

.method constructor <init>(Lorg/joda/time/Chronology;[Lorg/joda/time/DateTimeFieldType;[I)V
    .locals 0

    .line 321
    invoke-direct {p0}, Lorg/joda/time/base/AbstractPartial;-><init>()V

    .line 322
    iput-object p1, p0, Lorg/joda/time/Partial;->iChronology:Lorg/joda/time/Chronology;

    .line 323
    iput-object p2, p0, Lorg/joda/time/Partial;->iTypes:[Lorg/joda/time/DateTimeFieldType;

    .line 324
    iput-object p3, p0, Lorg/joda/time/Partial;->iValues:[I

    return-void
.end method

.method public constructor <init>(Lorg/joda/time/DateTimeFieldType;I)V
    .locals 1

    const/4 v0, 0x0

    .line 139
    invoke-direct {p0, p1, p2, v0}, Lorg/joda/time/Partial;-><init>(Lorg/joda/time/DateTimeFieldType;ILorg/joda/time/Chronology;)V

    return-void
.end method

.method public constructor <init>(Lorg/joda/time/DateTimeFieldType;ILorg/joda/time/Chronology;)V
    .locals 3

    .line 153
    invoke-direct {p0}, Lorg/joda/time/base/AbstractPartial;-><init>()V

    .line 154
    invoke-static {p3}, Lorg/joda/time/DateTimeUtils;->getChronology(Lorg/joda/time/Chronology;)Lorg/joda/time/Chronology;

    move-result-object p3

    invoke-virtual {p3}, Lorg/joda/time/Chronology;->withUTC()Lorg/joda/time/Chronology;

    move-result-object p3

    .line 155
    iput-object p3, p0, Lorg/joda/time/Partial;->iChronology:Lorg/joda/time/Chronology;

    if-nez p1, :cond_0

    .line 157
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The field type must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    const/4 v0, 0x1

    .line 159
    new-array v1, v0, [Lorg/joda/time/DateTimeFieldType;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    iput-object v1, p0, Lorg/joda/time/Partial;->iTypes:[Lorg/joda/time/DateTimeFieldType;

    .line 160
    new-array p1, v0, [I

    aput p2, p1, v2

    iput-object p1, p0, Lorg/joda/time/Partial;->iValues:[I

    .line 161
    iget-object p1, p0, Lorg/joda/time/Partial;->iValues:[I

    invoke-virtual {p3, p0, p1}, Lorg/joda/time/Chronology;->validate(Lorg/joda/time/ReadablePartial;[I)V

    return-void
.end method

.method constructor <init>(Lorg/joda/time/Partial;[I)V
    .locals 1

    .line 305
    invoke-direct {p0}, Lorg/joda/time/base/AbstractPartial;-><init>()V

    .line 306
    iget-object v0, p1, Lorg/joda/time/Partial;->iChronology:Lorg/joda/time/Chronology;

    iput-object v0, p0, Lorg/joda/time/Partial;->iChronology:Lorg/joda/time/Chronology;

    .line 307
    iget-object p1, p1, Lorg/joda/time/Partial;->iTypes:[Lorg/joda/time/DateTimeFieldType;

    iput-object p1, p0, Lorg/joda/time/Partial;->iTypes:[Lorg/joda/time/DateTimeFieldType;

    .line 308
    iput-object p2, p0, Lorg/joda/time/Partial;->iValues:[I

    return-void
.end method

.method public constructor <init>(Lorg/joda/time/ReadablePartial;)V
    .locals 3

    .line 283
    invoke-direct {p0}, Lorg/joda/time/base/AbstractPartial;-><init>()V

    if-nez p1, :cond_0

    .line 285
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The partial must not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 287
    :cond_0
    invoke-interface {p1}, Lorg/joda/time/ReadablePartial;->getChronology()Lorg/joda/time/Chronology;

    move-result-object v0

    invoke-static {v0}, Lorg/joda/time/DateTimeUtils;->getChronology(Lorg/joda/time/Chronology;)Lorg/joda/time/Chronology;

    move-result-object v0

    invoke-virtual {v0}, Lorg/joda/time/Chronology;->withUTC()Lorg/joda/time/Chronology;

    move-result-object v0

    iput-object v0, p0, Lorg/joda/time/Partial;->iChronology:Lorg/joda/time/Chronology;

    .line 288
    invoke-interface {p1}, Lorg/joda/time/ReadablePartial;->size()I

    move-result v0

    new-array v0, v0, [Lorg/joda/time/DateTimeFieldType;

    iput-object v0, p0, Lorg/joda/time/Partial;->iTypes:[Lorg/joda/time/DateTimeFieldType;

    .line 289
    invoke-interface {p1}, Lorg/joda/time/ReadablePartial;->size()I

    move-result v0

    new-array v0, v0, [I

    iput-object v0, p0, Lorg/joda/time/Partial;->iValues:[I

    const/4 v0, 0x0

    .line 290
    :goto_0
    invoke-interface {p1}, Lorg/joda/time/ReadablePartial;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 291
    iget-object v1, p0, Lorg/joda/time/Partial;->iTypes:[Lorg/joda/time/DateTimeFieldType;

    invoke-interface {p1, v0}, Lorg/joda/time/ReadablePartial;->getFieldType(I)Lorg/joda/time/DateTimeFieldType;

    move-result-object v2

    aput-object v2, v1, v0

    .line 292
    iget-object v1, p0, Lorg/joda/time/Partial;->iValues:[I

    invoke-interface {p1, v0}, Lorg/joda/time/ReadablePartial;->getValue(I)I

    move-result v2

    aput v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public constructor <init>([Lorg/joda/time/DateTimeFieldType;[I)V
    .locals 1

    const/4 v0, 0x0

    .line 177
    invoke-direct {p0, p1, p2, v0}, Lorg/joda/time/Partial;-><init>([Lorg/joda/time/DateTimeFieldType;[ILorg/joda/time/Chronology;)V

    return-void
.end method

.method public constructor <init>([Lorg/joda/time/DateTimeFieldType;[ILorg/joda/time/Chronology;)V
    .locals 7

    .line 194
    invoke-direct {p0}, Lorg/joda/time/base/AbstractPartial;-><init>()V

    .line 195
    invoke-static {p3}, Lorg/joda/time/DateTimeUtils;->getChronology(Lorg/joda/time/Chronology;)Lorg/joda/time/Chronology;

    move-result-object p3

    invoke-virtual {p3}, Lorg/joda/time/Chronology;->withUTC()Lorg/joda/time/Chronology;

    move-result-object p3

    .line 196
    iput-object p3, p0, Lorg/joda/time/Partial;->iChronology:Lorg/joda/time/Chronology;

    if-nez p1, :cond_0

    .line 198
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Types array must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    if-nez p2, :cond_1

    .line 201
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Values array must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 203
    :cond_1
    array-length v0, p2

    array-length v1, p1

    if-eq v0, v1, :cond_2

    .line 204
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Values array must be the same length as the types array"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 206
    :cond_2
    array-length v0, p1

    if-nez v0, :cond_3

    .line 207
    iput-object p1, p0, Lorg/joda/time/Partial;->iTypes:[Lorg/joda/time/DateTimeFieldType;

    .line 208
    iput-object p2, p0, Lorg/joda/time/Partial;->iValues:[I

    return-void

    :cond_3
    const/4 v0, 0x0

    move v1, v0

    .line 211
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_5

    .line 212
    aget-object v2, p1, v1

    if-nez v2, :cond_4

    .line 213
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Types array must not contain null: index "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    const/4 v1, 0x0

    .line 217
    :goto_1
    array-length v2, p1

    if-ge v0, v2, :cond_e

    .line 218
    aget-object v2, p1, v0

    .line 219
    invoke-virtual {v2}, Lorg/joda/time/DateTimeFieldType;->getDurationType()Lorg/joda/time/DurationFieldType;

    move-result-object v3

    iget-object v4, p0, Lorg/joda/time/Partial;->iChronology:Lorg/joda/time/Chronology;

    invoke-virtual {v3, v4}, Lorg/joda/time/DurationFieldType;->getField(Lorg/joda/time/Chronology;)Lorg/joda/time/DurationField;

    move-result-object v3

    if-lez v0, :cond_d

    .line 221
    invoke-virtual {v3}, Lorg/joda/time/DurationField;->isSupported()Z

    move-result v4

    if-nez v4, :cond_7

    .line 222
    invoke-virtual {v1}, Lorg/joda/time/DurationField;->isSupported()Z

    move-result p2

    if-eqz p2, :cond_6

    .line 223
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Types array must be in order largest-smallest: "

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, -0x1

    aget-object p1, p1, v0

    invoke-virtual {p1}, Lorg/joda/time/DateTimeFieldType;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " < "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lorg/joda/time/DateTimeFieldType;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 226
    :cond_6
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Types array must not contain duplicate unsupported: "

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, -0x1

    aget-object p1, p1, v0

    invoke-virtual {p1}, Lorg/joda/time/DateTimeFieldType;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " and "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lorg/joda/time/DateTimeFieldType;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 230
    :cond_7
    invoke-virtual {v1, v3}, Lorg/joda/time/DurationField;->compareTo(Ljava/lang/Object;)I

    move-result v4

    if-gez v4, :cond_8

    .line 232
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Types array must be in order largest-smallest: "

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, -0x1

    aget-object p1, p1, v0

    invoke-virtual {p1}, Lorg/joda/time/DateTimeFieldType;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " < "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lorg/joda/time/DateTimeFieldType;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_8
    if-nez v4, :cond_d

    .line 235
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    add-int/lit8 v1, v0, -0x1

    .line 236
    aget-object v4, p1, v1

    invoke-virtual {v4}, Lorg/joda/time/DateTimeFieldType;->getRangeDurationType()Lorg/joda/time/DurationFieldType;

    move-result-object v4

    .line 237
    invoke-virtual {v2}, Lorg/joda/time/DateTimeFieldType;->getRangeDurationType()Lorg/joda/time/DurationFieldType;

    move-result-object v5

    if-nez v4, :cond_9

    if-nez v5, :cond_d

    .line 240
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Types array must not contain duplicate: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object p1, p1, v1

    invoke-virtual {p1}, Lorg/joda/time/DateTimeFieldType;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " and "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lorg/joda/time/DateTimeFieldType;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_9
    if-nez v5, :cond_a

    .line 245
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Types array must be in order largest-smallest: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object p1, p1, v1

    invoke-virtual {p1}, Lorg/joda/time/DateTimeFieldType;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " < "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lorg/joda/time/DateTimeFieldType;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 248
    :cond_a
    iget-object v6, p0, Lorg/joda/time/Partial;->iChronology:Lorg/joda/time/Chronology;

    invoke-virtual {v4, v6}, Lorg/joda/time/DurationFieldType;->getField(Lorg/joda/time/Chronology;)Lorg/joda/time/DurationField;

    move-result-object v4

    .line 249
    iget-object v6, p0, Lorg/joda/time/Partial;->iChronology:Lorg/joda/time/Chronology;

    invoke-virtual {v5, v6}, Lorg/joda/time/DurationFieldType;->getField(Lorg/joda/time/Chronology;)Lorg/joda/time/DurationField;

    move-result-object v5

    .line 250
    invoke-virtual {v4, v5}, Lorg/joda/time/DurationField;->compareTo(Ljava/lang/Object;)I

    move-result v6

    if-gez v6, :cond_b

    .line 251
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Types array must be in order largest-smallest: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object p1, p1, v1

    invoke-virtual {p1}, Lorg/joda/time/DateTimeFieldType;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " < "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lorg/joda/time/DateTimeFieldType;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 254
    :cond_b
    invoke-virtual {v4, v5}, Lorg/joda/time/DurationField;->compareTo(Ljava/lang/Object;)I

    move-result v4

    if-nez v4, :cond_d

    .line 255
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Types array must not contain duplicate: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object p1, p1, v1

    invoke-virtual {p1}, Lorg/joda/time/DateTimeFieldType;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " and "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lorg/joda/time/DateTimeFieldType;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 260
    :cond_c
    invoke-virtual {v1}, Lorg/joda/time/DurationField;->isSupported()Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-virtual {v1}, Lorg/joda/time/DurationField;->getType()Lorg/joda/time/DurationFieldType;

    move-result-object v1

    sget-object v4, Lorg/joda/time/DurationFieldType;->YEARS_TYPE:Lorg/joda/time/DurationFieldType;

    if-eq v1, v4, :cond_d

    .line 261
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Types array must be in order largest-smallest, for year-based fields, years is defined as being largest: "

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, -0x1

    aget-object p1, p1, v0

    invoke-virtual {p1}, Lorg/joda/time/DateTimeFieldType;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " < "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lorg/joda/time/DateTimeFieldType;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_d
    add-int/lit8 v0, v0, 0x1

    move-object v1, v3

    goto/16 :goto_1

    .line 271
    :cond_e
    invoke-virtual {p1}, [Lorg/joda/time/DateTimeFieldType;->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lorg/joda/time/DateTimeFieldType;

    iput-object p1, p0, Lorg/joda/time/Partial;->iTypes:[Lorg/joda/time/DateTimeFieldType;

    .line 272
    invoke-virtual {p3, p0, p2}, Lorg/joda/time/Chronology;->validate(Lorg/joda/time/ReadablePartial;[I)V

    .line 273
    invoke-virtual {p2}, [I->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    iput-object p1, p0, Lorg/joda/time/Partial;->iValues:[I

    return-void
.end method


# virtual methods
.method public getChronology()Lorg/joda/time/Chronology;
    .locals 1

    .line 346
    iget-object v0, p0, Lorg/joda/time/Partial;->iChronology:Lorg/joda/time/Chronology;

    return-object v0
.end method

.method protected getField(ILorg/joda/time/Chronology;)Lorg/joda/time/DateTimeField;
    .locals 1

    .line 358
    iget-object v0, p0, Lorg/joda/time/Partial;->iTypes:[Lorg/joda/time/DateTimeFieldType;

    aget-object p1, v0, p1

    invoke-virtual {p1, p2}, Lorg/joda/time/DateTimeFieldType;->getField(Lorg/joda/time/Chronology;)Lorg/joda/time/DateTimeField;

    move-result-object p1

    return-object p1
.end method

.method public getFieldType(I)Lorg/joda/time/DateTimeFieldType;
    .locals 1

    .line 369
    iget-object v0, p0, Lorg/joda/time/Partial;->iTypes:[Lorg/joda/time/DateTimeFieldType;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public getFieldTypes()[Lorg/joda/time/DateTimeFieldType;
    .locals 1

    .line 381
    iget-object v0, p0, Lorg/joda/time/Partial;->iTypes:[Lorg/joda/time/DateTimeFieldType;

    invoke-virtual {v0}, [Lorg/joda/time/DateTimeFieldType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/joda/time/DateTimeFieldType;

    return-object v0
.end method

.method public getFormatter()Lorg/joda/time/format/DateTimeFormatter;
    .locals 5

    .line 736
    iget-object v0, p0, Lorg/joda/time/Partial;->iFormatter:[Lorg/joda/time/format/DateTimeFormatter;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    .line 738
    invoke-virtual {p0}, Lorg/joda/time/Partial;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v0, 0x2

    .line 741
    new-array v0, v0, [Lorg/joda/time/format/DateTimeFormatter;

    .line 743
    :try_start_0
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Lorg/joda/time/Partial;->iTypes:[Lorg/joda/time/DateTimeFieldType;

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v3, 0x1

    .line 744
    invoke-static {v2, v3, v1}, Lorg/joda/time/format/ISODateTimeFormat;->forFields(Ljava/util/Collection;ZZ)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v4

    aput-object v4, v0, v1

    .line 745
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_1

    .line 746
    aget-object v2, v0, v1

    aput-object v2, v0, v3
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 751
    :catch_0
    :cond_1
    iput-object v0, p0, Lorg/joda/time/Partial;->iFormatter:[Lorg/joda/time/format/DateTimeFormatter;

    .line 753
    :cond_2
    aget-object v0, v0, v1

    return-object v0
.end method

.method public getValue(I)I
    .locals 1

    .line 393
    iget-object v0, p0, Lorg/joda/time/Partial;->iValues:[I

    aget p1, v0, p1

    return p1
.end method

.method public getValues()[I
    .locals 1

    .line 406
    iget-object v0, p0, Lorg/joda/time/Partial;->iValues:[I

    invoke-virtual {v0}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    return-object v0
.end method

.method public isMatch(Lorg/joda/time/ReadableInstant;)Z
    .locals 6

    .line 687
    invoke-static {p1}, Lorg/joda/time/DateTimeUtils;->getInstantMillis(Lorg/joda/time/ReadableInstant;)J

    move-result-wide v0

    .line 688
    invoke-static {p1}, Lorg/joda/time/DateTimeUtils;->getInstantChronology(Lorg/joda/time/ReadableInstant;)Lorg/joda/time/Chronology;

    move-result-object p1

    const/4 v2, 0x0

    move v3, v2

    .line 689
    :goto_0
    iget-object v4, p0, Lorg/joda/time/Partial;->iTypes:[Lorg/joda/time/DateTimeFieldType;

    array-length v4, v4

    if-ge v3, v4, :cond_1

    .line 690
    iget-object v4, p0, Lorg/joda/time/Partial;->iTypes:[Lorg/joda/time/DateTimeFieldType;

    aget-object v4, v4, v3

    invoke-virtual {v4, p1}, Lorg/joda/time/DateTimeFieldType;->getField(Lorg/joda/time/Chronology;)Lorg/joda/time/DateTimeField;

    move-result-object v4

    invoke-virtual {v4, v0, v1}, Lorg/joda/time/DateTimeField;->get(J)I

    move-result v4

    .line 691
    iget-object v5, p0, Lorg/joda/time/Partial;->iValues:[I

    aget v5, v5, v3

    if-eq v4, v5, :cond_0

    return v2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public isMatch(Lorg/joda/time/ReadablePartial;)Z
    .locals 4

    if-nez p1, :cond_0

    .line 712
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The partial must not be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    .line 714
    :goto_0
    iget-object v2, p0, Lorg/joda/time/Partial;->iTypes:[Lorg/joda/time/DateTimeFieldType;

    array-length v2, v2

    if-ge v1, v2, :cond_2

    .line 715
    iget-object v2, p0, Lorg/joda/time/Partial;->iTypes:[Lorg/joda/time/DateTimeFieldType;

    aget-object v2, v2, v1

    invoke-interface {p1, v2}, Lorg/joda/time/ReadablePartial;->get(Lorg/joda/time/DateTimeFieldType;)I

    move-result v2

    .line 716
    iget-object v3, p0, Lorg/joda/time/Partial;->iValues:[I

    aget v3, v3, v1

    if-eq v2, v3, :cond_1

    return v0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public minus(Lorg/joda/time/ReadablePeriod;)Lorg/joda/time/Partial;
    .locals 1

    const/4 v0, -0x1

    .line 658
    invoke-virtual {p0, p1, v0}, Lorg/joda/time/Partial;->withPeriodAdded(Lorg/joda/time/ReadablePeriod;I)Lorg/joda/time/Partial;

    move-result-object p1

    return-object p1
.end method

.method public plus(Lorg/joda/time/ReadablePeriod;)Lorg/joda/time/Partial;
    .locals 1

    const/4 v0, 0x1

    .line 645
    invoke-virtual {p0, p1, v0}, Lorg/joda/time/Partial;->withPeriodAdded(Lorg/joda/time/ReadablePeriod;I)Lorg/joda/time/Partial;

    move-result-object p1

    return-object p1
.end method

.method public property(Lorg/joda/time/DateTimeFieldType;)Lorg/joda/time/Partial$Property;
    .locals 1

    .line 673
    new-instance v0, Lorg/joda/time/Partial$Property;

    invoke-virtual {p0, p1}, Lorg/joda/time/Partial;->indexOfSupported(Lorg/joda/time/DateTimeFieldType;)I

    move-result p1

    invoke-direct {v0, p0, p1}, Lorg/joda/time/Partial$Property;-><init>(Lorg/joda/time/Partial;I)V

    return-object v0
.end method

.method public size()I
    .locals 1

    .line 334
    iget-object v0, p0, Lorg/joda/time/Partial;->iTypes:[Lorg/joda/time/DateTimeFieldType;

    array-length v0, v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 769
    iget-object v0, p0, Lorg/joda/time/Partial;->iFormatter:[Lorg/joda/time/format/DateTimeFormatter;

    if-nez v0, :cond_0

    .line 771
    invoke-virtual {p0}, Lorg/joda/time/Partial;->getFormatter()Lorg/joda/time/format/DateTimeFormatter;

    .line 772
    iget-object v0, p0, Lorg/joda/time/Partial;->iFormatter:[Lorg/joda/time/format/DateTimeFormatter;

    if-nez v0, :cond_0

    .line 774
    invoke-virtual {p0}, Lorg/joda/time/Partial;->toStringList()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v1, 0x1

    .line 777
    aget-object v0, v0, v1

    if-nez v0, :cond_1

    .line 779
    invoke-virtual {p0}, Lorg/joda/time/Partial;->toStringList()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 781
    :cond_1
    invoke-virtual {v0, p0}, Lorg/joda/time/format/DateTimeFormatter;->print(Lorg/joda/time/ReadablePartial;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    if-nez p1, :cond_0

    .line 818
    invoke-virtual {p0}, Lorg/joda/time/Partial;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 820
    :cond_0
    invoke-static {p1}, Lorg/joda/time/format/DateTimeFormat;->forPattern(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object p1

    invoke-virtual {p1, p0}, Lorg/joda/time/format/DateTimeFormatter;->print(Lorg/joda/time/ReadablePartial;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public toString(Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;
    .locals 0

    if-nez p1, :cond_0

    .line 833
    invoke-virtual {p0}, Lorg/joda/time/Partial;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 835
    :cond_0
    invoke-static {p1}, Lorg/joda/time/format/DateTimeFormat;->forPattern(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object p1

    invoke-virtual {p1, p2}, Lorg/joda/time/format/DateTimeFormatter;->withLocale(Ljava/util/Locale;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object p1

    invoke-virtual {p1, p0}, Lorg/joda/time/format/DateTimeFormatter;->print(Lorg/joda/time/ReadablePartial;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public toStringList()Ljava/lang/String;
    .locals 4

    .line 794
    invoke-virtual {p0}, Lorg/joda/time/Partial;->size()I

    move-result v0

    .line 795
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x14

    mul-int/2addr v2, v0

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v2, 0x5b

    .line 796
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    if-lez v2, :cond_0

    const/16 v3, 0x2c

    .line 799
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v3, 0x20

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 801
    :cond_0
    iget-object v3, p0, Lorg/joda/time/Partial;->iTypes:[Lorg/joda/time/DateTimeFieldType;

    aget-object v3, v3, v2

    invoke-virtual {v3}, Lorg/joda/time/DateTimeFieldType;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x3d

    .line 802
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 803
    iget-object v3, p0, Lorg/joda/time/Partial;->iValues:[I

    aget v3, v3, v2

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/16 v0, 0x5d

    .line 805
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 806
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public with(Lorg/joda/time/DateTimeFieldType;I)Lorg/joda/time/Partial;
    .locals 8

    if-nez p1, :cond_0

    .line 453
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The field type must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 455
    :cond_0
    invoke-virtual {p0, p1}, Lorg/joda/time/Partial;->indexOf(Lorg/joda/time/DateTimeFieldType;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_7

    .line 457
    iget-object v0, p0, Lorg/joda/time/Partial;->iTypes:[Lorg/joda/time/DateTimeFieldType;

    const/4 v1, 0x0

    array-length v0, v0

    add-int/lit8 v0, v0, 0x1

    new-array v0, v0, [Lorg/joda/time/DateTimeFieldType;

    .line 458
    array-length v2, v0

    new-array v2, v2, [I

    .line 462
    invoke-virtual {p1}, Lorg/joda/time/DateTimeFieldType;->getDurationType()Lorg/joda/time/DurationFieldType;

    move-result-object v3

    iget-object v4, p0, Lorg/joda/time/Partial;->iChronology:Lorg/joda/time/Chronology;

    invoke-virtual {v3, v4}, Lorg/joda/time/DurationFieldType;->getField(Lorg/joda/time/Chronology;)Lorg/joda/time/DurationField;

    move-result-object v3

    .line 463
    invoke-virtual {v3}, Lorg/joda/time/DurationField;->isSupported()Z

    move-result v4

    if-eqz v4, :cond_5

    move v4, v1

    .line 464
    :goto_0
    iget-object v5, p0, Lorg/joda/time/Partial;->iTypes:[Lorg/joda/time/DateTimeFieldType;

    array-length v5, v5

    if-ge v4, v5, :cond_6

    .line 465
    iget-object v5, p0, Lorg/joda/time/Partial;->iTypes:[Lorg/joda/time/DateTimeFieldType;

    aget-object v5, v5, v4

    .line 466
    invoke-virtual {v5}, Lorg/joda/time/DateTimeFieldType;->getDurationType()Lorg/joda/time/DurationFieldType;

    move-result-object v6

    iget-object v7, p0, Lorg/joda/time/Partial;->iChronology:Lorg/joda/time/Chronology;

    invoke-virtual {v6, v7}, Lorg/joda/time/DurationFieldType;->getField(Lorg/joda/time/Chronology;)Lorg/joda/time/DurationField;

    move-result-object v6

    .line 467
    invoke-virtual {v6}, Lorg/joda/time/DurationField;->isSupported()Z

    move-result v7

    if-eqz v7, :cond_4

    .line 468
    invoke-virtual {v3, v6}, Lorg/joda/time/DurationField;->compareTo(Ljava/lang/Object;)I

    move-result v6

    if-lez v6, :cond_1

    goto :goto_2

    :cond_1
    if-nez v6, :cond_4

    .line 472
    invoke-virtual {p1}, Lorg/joda/time/DateTimeFieldType;->getRangeDurationType()Lorg/joda/time/DurationFieldType;

    move-result-object v6

    if-nez v6, :cond_2

    goto :goto_2

    .line 475
    :cond_2
    invoke-virtual {v5}, Lorg/joda/time/DateTimeFieldType;->getRangeDurationType()Lorg/joda/time/DurationFieldType;

    move-result-object v6

    if-nez v6, :cond_3

    goto :goto_1

    .line 478
    :cond_3
    invoke-virtual {p1}, Lorg/joda/time/DateTimeFieldType;->getRangeDurationType()Lorg/joda/time/DurationFieldType;

    move-result-object v6

    iget-object v7, p0, Lorg/joda/time/Partial;->iChronology:Lorg/joda/time/Chronology;

    invoke-virtual {v6, v7}, Lorg/joda/time/DurationFieldType;->getField(Lorg/joda/time/Chronology;)Lorg/joda/time/DurationField;

    move-result-object v6

    .line 479
    invoke-virtual {v5}, Lorg/joda/time/DateTimeFieldType;->getRangeDurationType()Lorg/joda/time/DurationFieldType;

    move-result-object v5

    iget-object v7, p0, Lorg/joda/time/Partial;->iChronology:Lorg/joda/time/Chronology;

    invoke-virtual {v5, v7}, Lorg/joda/time/DurationFieldType;->getField(Lorg/joda/time/Chronology;)Lorg/joda/time/DurationField;

    move-result-object v5

    .line 480
    invoke-virtual {v6, v5}, Lorg/joda/time/DurationField;->compareTo(Ljava/lang/Object;)I

    move-result v5

    if-lez v5, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_5
    move v4, v1

    .line 487
    :cond_6
    :goto_2
    iget-object v3, p0, Lorg/joda/time/Partial;->iTypes:[Lorg/joda/time/DateTimeFieldType;

    invoke-static {v3, v1, v0, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 488
    iget-object v3, p0, Lorg/joda/time/Partial;->iValues:[I

    invoke-static {v3, v1, v2, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 489
    aput-object p1, v0, v4

    .line 490
    aput p2, v2, v4

    .line 491
    iget-object p1, p0, Lorg/joda/time/Partial;->iTypes:[Lorg/joda/time/DateTimeFieldType;

    add-int/lit8 p2, v4, 0x1

    array-length v1, v0

    sub-int/2addr v1, v4

    add-int/lit8 v1, v1, -0x1

    invoke-static {p1, v4, v0, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 492
    iget-object p1, p0, Lorg/joda/time/Partial;->iValues:[I

    array-length v1, v2

    sub-int/2addr v1, v4

    add-int/lit8 v1, v1, -0x1

    invoke-static {p1, v4, v2, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 495
    new-instance p1, Lorg/joda/time/Partial;

    iget-object p2, p0, Lorg/joda/time/Partial;->iChronology:Lorg/joda/time/Chronology;

    invoke-direct {p1, v0, v2, p2}, Lorg/joda/time/Partial;-><init>([Lorg/joda/time/DateTimeFieldType;[ILorg/joda/time/Chronology;)V

    .line 496
    iget-object p2, p0, Lorg/joda/time/Partial;->iChronology:Lorg/joda/time/Chronology;

    invoke-virtual {p2, p1, v2}, Lorg/joda/time/Chronology;->validate(Lorg/joda/time/ReadablePartial;[I)V

    return-object p1

    .line 499
    :cond_7
    invoke-virtual {p0, v0}, Lorg/joda/time/Partial;->getValue(I)I

    move-result p1

    if-ne p2, p1, :cond_8

    return-object p0

    .line 502
    :cond_8
    invoke-virtual {p0}, Lorg/joda/time/Partial;->getValues()[I

    move-result-object p1

    .line 503
    invoke-virtual {p0, v0}, Lorg/joda/time/Partial;->getField(I)Lorg/joda/time/DateTimeField;

    move-result-object v1

    invoke-virtual {v1, p0, v0, p1, p2}, Lorg/joda/time/DateTimeField;->set(Lorg/joda/time/ReadablePartial;I[II)[I

    move-result-object p1

    .line 504
    new-instance p2, Lorg/joda/time/Partial;

    invoke-direct {p2, p0, p1}, Lorg/joda/time/Partial;-><init>(Lorg/joda/time/Partial;[I)V

    return-object p2
.end method

.method public withChronologyRetainFields(Lorg/joda/time/Chronology;)Lorg/joda/time/Partial;
    .locals 3

    .line 425
    invoke-static {p1}, Lorg/joda/time/DateTimeUtils;->getChronology(Lorg/joda/time/Chronology;)Lorg/joda/time/Chronology;

    move-result-object p1

    .line 426
    invoke-virtual {p1}, Lorg/joda/time/Chronology;->withUTC()Lorg/joda/time/Chronology;

    move-result-object p1

    .line 427
    invoke-virtual {p0}, Lorg/joda/time/Partial;->getChronology()Lorg/joda/time/Chronology;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 430
    :cond_0
    new-instance v0, Lorg/joda/time/Partial;

    iget-object v1, p0, Lorg/joda/time/Partial;->iTypes:[Lorg/joda/time/DateTimeFieldType;

    iget-object v2, p0, Lorg/joda/time/Partial;->iValues:[I

    invoke-direct {v0, p1, v1, v2}, Lorg/joda/time/Partial;-><init>(Lorg/joda/time/Chronology;[Lorg/joda/time/DateTimeFieldType;[I)V

    .line 431
    iget-object v1, p0, Lorg/joda/time/Partial;->iValues:[I

    invoke-virtual {p1, v0, v1}, Lorg/joda/time/Chronology;->validate(Lorg/joda/time/ReadablePartial;[I)V

    return-object v0
.end method

.method public withField(Lorg/joda/time/DateTimeFieldType;I)Lorg/joda/time/Partial;
    .locals 2

    .line 547
    invoke-virtual {p0, p1}, Lorg/joda/time/Partial;->indexOfSupported(Lorg/joda/time/DateTimeFieldType;)I

    move-result p1

    .line 548
    invoke-virtual {p0, p1}, Lorg/joda/time/Partial;->getValue(I)I

    move-result v0

    if-ne p2, v0, :cond_0

    return-object p0

    .line 551
    :cond_0
    invoke-virtual {p0}, Lorg/joda/time/Partial;->getValues()[I

    move-result-object v0

    .line 552
    invoke-virtual {p0, p1}, Lorg/joda/time/Partial;->getField(I)Lorg/joda/time/DateTimeField;

    move-result-object v1

    invoke-virtual {v1, p0, p1, v0, p2}, Lorg/joda/time/DateTimeField;->set(Lorg/joda/time/ReadablePartial;I[II)[I

    move-result-object p1

    .line 553
    new-instance p2, Lorg/joda/time/Partial;

    invoke-direct {p2, p0, p1}, Lorg/joda/time/Partial;-><init>(Lorg/joda/time/Partial;[I)V

    return-object p2
.end method

.method public withFieldAddWrapped(Lorg/joda/time/DurationFieldType;I)Lorg/joda/time/Partial;
    .locals 2

    .line 595
    invoke-virtual {p0, p1}, Lorg/joda/time/Partial;->indexOfSupported(Lorg/joda/time/DurationFieldType;)I

    move-result p1

    if-nez p2, :cond_0

    return-object p0

    .line 599
    :cond_0
    invoke-virtual {p0}, Lorg/joda/time/Partial;->getValues()[I

    move-result-object v0

    .line 600
    invoke-virtual {p0, p1}, Lorg/joda/time/Partial;->getField(I)Lorg/joda/time/DateTimeField;

    move-result-object v1

    invoke-virtual {v1, p0, p1, v0, p2}, Lorg/joda/time/DateTimeField;->addWrapPartial(Lorg/joda/time/ReadablePartial;I[II)[I

    move-result-object p1

    .line 601
    new-instance p2, Lorg/joda/time/Partial;

    invoke-direct {p2, p0, p1}, Lorg/joda/time/Partial;-><init>(Lorg/joda/time/Partial;[I)V

    return-object p2
.end method

.method public withFieldAdded(Lorg/joda/time/DurationFieldType;I)Lorg/joda/time/Partial;
    .locals 2

    .line 571
    invoke-virtual {p0, p1}, Lorg/joda/time/Partial;->indexOfSupported(Lorg/joda/time/DurationFieldType;)I

    move-result p1

    if-nez p2, :cond_0

    return-object p0

    .line 575
    :cond_0
    invoke-virtual {p0}, Lorg/joda/time/Partial;->getValues()[I

    move-result-object v0

    .line 576
    invoke-virtual {p0, p1}, Lorg/joda/time/Partial;->getField(I)Lorg/joda/time/DateTimeField;

    move-result-object v1

    invoke-virtual {v1, p0, p1, v0, p2}, Lorg/joda/time/DateTimeField;->add(Lorg/joda/time/ReadablePartial;I[II)[I

    move-result-object p1

    .line 577
    new-instance p2, Lorg/joda/time/Partial;

    invoke-direct {p2, p0, p1}, Lorg/joda/time/Partial;-><init>(Lorg/joda/time/Partial;[I)V

    return-object p2
.end method

.method public withPeriodAdded(Lorg/joda/time/ReadablePeriod;I)Lorg/joda/time/Partial;
    .locals 5

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    goto :goto_1

    .line 623
    :cond_0
    invoke-virtual {p0}, Lorg/joda/time/Partial;->getValues()[I

    move-result-object v0

    const/4 v1, 0x0

    .line 624
    :goto_0
    invoke-interface {p1}, Lorg/joda/time/ReadablePeriod;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 625
    invoke-interface {p1, v1}, Lorg/joda/time/ReadablePeriod;->getFieldType(I)Lorg/joda/time/DurationFieldType;

    move-result-object v2

    .line 626
    invoke-virtual {p0, v2}, Lorg/joda/time/Partial;->indexOf(Lorg/joda/time/DurationFieldType;)I

    move-result v2

    if-ltz v2, :cond_1

    .line 628
    invoke-virtual {p0, v2}, Lorg/joda/time/Partial;->getField(I)Lorg/joda/time/DateTimeField;

    move-result-object v3

    invoke-interface {p1, v1}, Lorg/joda/time/ReadablePeriod;->getValue(I)I

    move-result v4

    invoke-static {v4, p2}, Lorg/joda/time/field/FieldUtils;->safeMultiply(II)I

    move-result v4

    invoke-virtual {v3, p0, v2, v0, v4}, Lorg/joda/time/DateTimeField;->add(Lorg/joda/time/ReadablePartial;I[II)[I

    move-result-object v0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 632
    :cond_2
    new-instance p1, Lorg/joda/time/Partial;

    invoke-direct {p1, p0, v0}, Lorg/joda/time/Partial;-><init>(Lorg/joda/time/Partial;[I)V

    return-object p1

    :cond_3
    :goto_1
    return-object p0
.end method

.method public without(Lorg/joda/time/DateTimeFieldType;)Lorg/joda/time/Partial;
    .locals 6

    .line 516
    invoke-virtual {p0, p1}, Lorg/joda/time/Partial;->indexOf(Lorg/joda/time/DateTimeFieldType;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    .line 518
    invoke-virtual {p0}, Lorg/joda/time/Partial;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    new-array v0, v0, [Lorg/joda/time/DateTimeFieldType;

    .line 519
    invoke-virtual {p0}, Lorg/joda/time/Partial;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    new-array v1, v1, [I

    .line 520
    iget-object v2, p0, Lorg/joda/time/Partial;->iTypes:[Lorg/joda/time/DateTimeFieldType;

    const/4 v3, 0x0

    invoke-static {v2, v3, v0, v3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 521
    iget-object v2, p0, Lorg/joda/time/Partial;->iTypes:[Lorg/joda/time/DateTimeFieldType;

    add-int/lit8 v4, p1, 0x1

    array-length v5, v0

    sub-int/2addr v5, p1

    invoke-static {v2, v4, v0, p1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 522
    iget-object v2, p0, Lorg/joda/time/Partial;->iValues:[I

    invoke-static {v2, v3, v1, v3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 523
    iget-object v2, p0, Lorg/joda/time/Partial;->iValues:[I

    array-length v3, v1

    sub-int/2addr v3, p1

    invoke-static {v2, v4, v1, p1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 524
    new-instance p1, Lorg/joda/time/Partial;

    iget-object v2, p0, Lorg/joda/time/Partial;->iChronology:Lorg/joda/time/Chronology;

    invoke-direct {p1, v2, v0, v1}, Lorg/joda/time/Partial;-><init>(Lorg/joda/time/Chronology;[Lorg/joda/time/DateTimeFieldType;[I)V

    .line 525
    iget-object v0, p0, Lorg/joda/time/Partial;->iChronology:Lorg/joda/time/Chronology;

    invoke-virtual {v0, p1, v1}, Lorg/joda/time/Chronology;->validate(Lorg/joda/time/ReadablePartial;[I)V

    return-object p1

    :cond_0
    return-object p0
.end method
