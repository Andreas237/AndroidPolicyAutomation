.class public Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;
.super Ljava/lang/Object;
.source "TiffOutputField.java"

# interfaces
.implements Lorg/apache/sanselan/formats/tiff/constants/TiffConstants;


# static fields
.field private static final newline:Ljava/lang/String;


# instance fields
.field private bytes:[B

.field public final count:I

.field public final fieldType:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field private final separateValueItem:Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;

.field private sortHint:I

.field public final tag:I

.field public final tagInfo:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "line.separator"

    .line 177
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->newline:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ILorg/apache/sanselan/formats/tiff/constants/TagInfo;Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;I[B)V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 63
    iput v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->sortHint:I

    .line 47
    iput p1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->tag:I

    .line 48
    iput-object p2, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->tagInfo:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    .line 49
    iput-object p3, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->fieldType:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    .line 50
    iput p4, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->count:I

    .line 51
    iput-object p5, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->bytes:[B

    .line 53
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->isLocalValue()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 54
    iput-object p1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->separateValueItem:Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;

    goto :goto_0

    .line 57
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Field Seperate value ("

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->getDescription()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ")"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 59
    new-instance p2, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;

    invoke-direct {p2, p1, p5}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;-><init>(Ljava/lang/String;[B)V

    iput-object p2, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->separateValueItem:Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;

    :goto_0
    return-void
.end method

.method public constructor <init>(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;I[B)V
    .locals 6

    .line 41
    iget v1, p1, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->tag:I

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;-><init>(ILorg/apache/sanselan/formats/tiff/constants/TagInfo;Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;I[B)V

    return-void
.end method

.method public static create(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;ILjava/lang/Number;)Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 68
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->dataTypes:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->dataTypes:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    array-length v0, v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_1

    .line 70
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->dataTypes:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/4 v2, 0x0

    aget-object v6, v0, v2

    .line 72
    iget v0, p0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->length:I

    if-ne v0, v1, :cond_0

    .line 75
    invoke-virtual {v6, p2, p1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->writeData(Ljava/lang/Object;I)[B

    move-result-object v8

    .line 77
    new-instance p1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    iget v4, p0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->tag:I

    const/4 v7, 0x1

    move-object v3, p1

    move-object v5, p0

    invoke-direct/range {v3 .. v8}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;-><init>(ILorg/apache/sanselan/formats/tiff/constants/TagInfo;Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;I[B)V

    return-object p1

    .line 73
    :cond_0
    new-instance p0, Lorg/apache/sanselan/ImageWriteException;

    const-string p1, "Tag does not expect a single value."

    invoke-direct {p0, p1}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 69
    :cond_1
    new-instance p0, Lorg/apache/sanselan/ImageWriteException;

    const-string p1, "Tag has no default data type."

    invoke-direct {p0, p1}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static create(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;ILjava/lang/String;)Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 100
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->dataTypes:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    if-nez v0, :cond_0

    .line 101
    sget-object v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->FIELD_TYPE_ASCII:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeASCII;

    move-object v4, v0

    goto :goto_0

    .line 102
    :cond_0
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->dataTypes:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    sget-object v1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->FIELD_TYPE_DESCRIPTION_ASCII:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    if-ne v0, v1, :cond_1

    .line 103
    sget-object v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->FIELD_TYPE_ASCII:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeASCII;

    move-object v4, v0

    goto :goto_0

    .line 104
    :cond_1
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->dataTypes:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    sget-object v1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->FIELD_TYPE_ASCII:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeASCII;

    if-ne v0, v1, :cond_2

    .line 105
    sget-object v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->FIELD_TYPE_ASCII:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeASCII;

    move-object v4, v0

    .line 109
    :goto_0
    invoke-virtual {v4, p2, p1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->writeData(Ljava/lang/Object;I)[B

    move-result-object v6

    .line 111
    new-instance p1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    iget v2, p0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->tag:I

    array-length v5, v6

    move-object v1, p1

    move-object v3, p0

    invoke-direct/range {v1 .. v6}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;-><init>(ILorg/apache/sanselan/formats/tiff/constants/TagInfo;Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;I[B)V

    return-object p1

    .line 107
    :cond_2
    new-instance p0, Lorg/apache/sanselan/ImageWriteException;

    const-string p1, "Tag has unexpected data type."

    invoke-direct {p0, p1}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static create(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;I[Ljava/lang/Number;)Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 83
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->dataTypes:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->dataTypes:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    array-length v0, v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_1

    .line 85
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->dataTypes:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/4 v1, 0x0

    aget-object v5, v0, v1

    .line 87
    iget v0, p0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->length:I

    array-length v1, p2

    if-ne v0, v1, :cond_0

    .line 90
    invoke-virtual {v5, p2, p1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->writeData(Ljava/lang/Object;I)[B

    move-result-object v7

    .line 92
    new-instance p1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    iget v3, p0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;->tag:I

    array-length v6, p2

    move-object v2, p1

    move-object v4, p0

    invoke-direct/range {v2 .. v7}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;-><init>(ILorg/apache/sanselan/formats/tiff/constants/TagInfo;Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;I[B)V

    return-object p1

    .line 88
    :cond_0
    new-instance p0, Lorg/apache/sanselan/ImageWriteException;

    const-string p1, "Tag does not expect a single value."

    invoke-direct {p0, p1}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 84
    :cond_1
    new-instance p0, Lorg/apache/sanselan/ImageWriteException;

    const-string p1, "Tag has no default data type."

    invoke-direct {p0, p1}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method protected static final createOffsetField(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;I)Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 117
    new-instance v0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;

    sget-object v1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->FIELD_TYPE_LONG:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;

    sget-object v2, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->FIELD_TYPE_LONG:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;

    const/4 v3, 0x1

    new-array v4, v3, [I

    const/4 v5, 0x0

    aput v5, v4, v5

    .line 118
    invoke-virtual {v2, v4, p1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;->writeData(Ljava/lang/Object;I)[B

    move-result-object p1

    invoke-direct {v0, p0, v1, v3, p1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;-><init>(Lorg/apache/sanselan/formats/tiff/constants/TagInfo;Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;I[B)V

    return-object v0
.end method


# virtual methods
.method protected getSeperateValue()Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem;
    .locals 1

    .line 151
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->separateValueItem:Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;

    return-object v0
.end method

.method public getSortHint()I
    .locals 1

    .line 207
    iget v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->sortHint:I

    return v0
.end method

.method protected isLocalValue()Z
    .locals 2

    .line 156
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->bytes:[B

    array-length v0, v0

    const/4 v1, 0x4

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected setData([B)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 165
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->bytes:[B

    array-length v0, v0

    array-length v1, p1

    if-ne v0, v1, :cond_1

    .line 169
    iput-object p1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->bytes:[B

    .line 170
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->separateValueItem:Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;

    if-eqz v0, :cond_0

    .line 171
    invoke-virtual {v0, p1}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;->updateValue([B)V

    :cond_0
    return-void

    .line 166
    :cond_1
    new-instance p1, Lorg/apache/sanselan/ImageWriteException;

    const-string v0, "Cannot change size of value."

    invoke-direct {p1, v0}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setSortHint(I)V
    .locals 0

    .line 212
    iput p1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->sortHint:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 181
    invoke-virtual {p0, v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    if-nez p1, :cond_0

    const-string p1, ""

    .line 188
    :cond_0
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 190
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 191
    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->tagInfo:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 192
    sget-object v1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->newline:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 194
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 195
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "count: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->count:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 196
    sget-object v1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->newline:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 198
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 199
    iget-object p1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->fieldType:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 200
    sget-object p1, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->newline:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 202
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected writeField(Lorg/apache/sanselan/common/BinaryOutputStream;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/apache/sanselan/ImageWriteException;
        }
    .end annotation

    .line 124
    iget v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->tag:I

    invoke-virtual {p1, v0}, Lorg/apache/sanselan/common/BinaryOutputStream;->write2Bytes(I)V

    .line 125
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->fieldType:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    iget v0, v0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;->type:I

    invoke-virtual {p1, v0}, Lorg/apache/sanselan/common/BinaryOutputStream;->write2Bytes(I)V

    .line 126
    iget v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->count:I

    invoke-virtual {p1, v0}, Lorg/apache/sanselan/common/BinaryOutputStream;->write4Bytes(I)V

    .line 128
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->isLocalValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 130
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->separateValueItem:Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;

    if-nez v0, :cond_1

    .line 132
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->bytes:[B

    array-length v1, v0

    const/4 v2, 0x4

    if-gt v1, v2, :cond_0

    .line 136
    invoke-virtual {p1, v0}, Lorg/apache/sanselan/common/BinaryOutputStream;->writeByteArray([B)V

    .line 137
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->bytes:[B

    array-length v0, v0

    sub-int/2addr v2, v0

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_3

    .line 139
    invoke-virtual {p1, v0}, Lorg/apache/sanselan/common/BinaryOutputStream;->write(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 133
    :cond_0
    new-instance p1, Lorg/apache/sanselan/ImageWriteException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Local value has invalid length: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->bytes:[B

    array-length v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 131
    :cond_1
    new-instance p1, Lorg/apache/sanselan/ImageWriteException;

    const-string v0, "Unexpected separate value item."

    invoke-direct {p1, v0}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 142
    :cond_2
    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/write/TiffOutputField;->separateValueItem:Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;

    if-eqz v0, :cond_4

    .line 145
    invoke-virtual {v0}, Lorg/apache/sanselan/formats/tiff/write/TiffOutputItem$Value;->getOffset()I

    move-result v0

    invoke-virtual {p1, v0}, Lorg/apache/sanselan/common/BinaryOutputStream;->write4Bytes(I)V

    :cond_3
    return-void

    .line 143
    :cond_4
    new-instance p1, Lorg/apache/sanselan/ImageWriteException;

    const-string v0, "Missing separate value item."

    invoke-direct {p1, v0}, Lorg/apache/sanselan/ImageWriteException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
