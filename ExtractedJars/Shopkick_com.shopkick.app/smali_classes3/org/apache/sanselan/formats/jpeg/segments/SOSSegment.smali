.class public Lorg/apache/sanselan/formats/jpeg/segments/SOSSegment;
.super Lorg/apache/sanselan/formats/jpeg/segments/Segment;
.source "SOSSegment.java"


# direct methods
.method public constructor <init>(IILjava/io/InputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/sanselan/ImageReadException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 37
    invoke-direct {p0, p1, p2}, Lorg/apache/sanselan/formats/jpeg/segments/Segment;-><init>(II)V

    .line 39
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/jpeg/segments/SOSSegment;->getDebug()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 40
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SOSSegment marker_length: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_0
    const-string p1, "SOS"

    .line 42
    invoke-static {p1, p2}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/String;I)V

    const-string p1, "number_of_components_in_scan"

    const-string p2, "Not a Valid JPEG File"

    .line 44
    invoke-virtual {p0, p1, p3, p2}, Lorg/apache/sanselan/formats/jpeg/segments/SOSSegment;->readByte(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)B

    move-result p1

    const-string p2, "number_of_components_in_scan"

    .line 46
    invoke-static {p2, p1}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/String;I)V

    const/4 p2, 0x0

    :goto_0
    if-ge p2, p1, :cond_1

    const-string v0, "scan_component_selector"

    const-string v1, "Not a Valid JPEG File"

    .line 51
    invoke-virtual {p0, v0, p3, v1}, Lorg/apache/sanselan/formats/jpeg/segments/SOSSegment;->readByte(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)B

    move-result v0

    const-string v1, "scan_component_selector"

    .line 53
    invoke-static {v1, v0}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/String;I)V

    const-string v0, "ac_dc_entrooy_coding_table_selector"

    const-string v1, "Not a Valid JPEG File"

    .line 55
    invoke-virtual {p0, v0, p3, v1}, Lorg/apache/sanselan/formats/jpeg/segments/SOSSegment;->readByte(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)B

    move-result v0

    const-string v1, "ac_dc_entrooy_coding_table_selector"

    .line 58
    invoke-static {v1, v0}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/String;I)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    const-string p1, "start_of_spectral_selection"

    const-string p2, "Not a Valid JPEG File"

    .line 62
    invoke-virtual {p0, p1, p3, p2}, Lorg/apache/sanselan/formats/jpeg/segments/SOSSegment;->readByte(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)B

    move-result p1

    const-string p2, "start_of_spectral_selection"

    .line 64
    invoke-static {p2, p1}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/String;I)V

    const-string p1, "end_of_spectral_selection"

    const-string p2, "Not a Valid JPEG File"

    .line 65
    invoke-virtual {p0, p1, p3, p2}, Lorg/apache/sanselan/formats/jpeg/segments/SOSSegment;->readByte(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)B

    move-result p1

    const-string p2, "end_of_spectral_selection"

    .line 67
    invoke-static {p2, p1}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/String;I)V

    const-string p1, "successive_approximation_bit_position"

    const-string p2, "Not a Valid JPEG File"

    .line 68
    invoke-virtual {p0, p1, p3, p2}, Lorg/apache/sanselan/formats/jpeg/segments/SOSSegment;->readByte(Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;)B

    move-result p1

    const-string p2, "successive_approximation_bit_position"

    .line 71
    invoke-static {p2, p1}, Lorg/apache/sanselan/util/Debug;->debug(Ljava/lang/String;I)V

    .line 91
    invoke-virtual {p0}, Lorg/apache/sanselan/formats/jpeg/segments/SOSSegment;->getDebug()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 92
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string p2, ""

    invoke-virtual {p1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public getDescription()Ljava/lang/String;
    .locals 2

    .line 97
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SOS ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/apache/sanselan/formats/jpeg/segments/SOSSegment;->getSegmentType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
