.class public Lorg/jivesoftware/smack/packet/AnReport;
.super Lorg/jivesoftware/smack/packet/Stanza;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/jivesoftware/smack/packet/AnReport$ReportType;
    }
.end annotation


# static fields
.field public static final ELEMENT:Ljava/lang/String; = "a"


# instance fields
.field private errCode:I

.field private reportType:Lorg/jivesoftware/smack/packet/AnReport$ReportType;

.field private seq:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 48
    invoke-direct {p0}, Lorg/jivesoftware/smack/packet/Stanza;-><init>()V

    .line 32
    sget-object v0, Lorg/jivesoftware/smack/packet/AnReport$ReportType;->FromServer:Lorg/jivesoftware/smack/packet/AnReport$ReportType;

    iput-object v0, p0, Lorg/jivesoftware/smack/packet/AnReport;->reportType:Lorg/jivesoftware/smack/packet/AnReport$ReportType;

    .line 50
    return-void
.end method


# virtual methods
.method public getErrCode()I
    .locals 1

    .line 64
    iget v0, p0, Lorg/jivesoftware/smack/packet/AnReport;->errCode:I

    return v0
.end method

.method public getReportType()Lorg/jivesoftware/smack/packet/AnReport$ReportType;
    .locals 1

    .line 41
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/AnReport;->reportType:Lorg/jivesoftware/smack/packet/AnReport$ReportType;

    return-object v0
.end method

.method public getSeq()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/AnReport;->seq:Ljava/lang/String;

    return-object v0
.end method

.method public setErrCode(I)V
    .locals 0

    .line 69
    iput p1, p0, Lorg/jivesoftware/smack/packet/AnReport;->errCode:I

    .line 70
    return-void
.end method

.method public setReportType(Lorg/jivesoftware/smack/packet/AnReport$ReportType;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lorg/jivesoftware/smack/packet/AnReport;->reportType:Lorg/jivesoftware/smack/packet/AnReport$ReportType;

    .line 37
    return-void
.end method

.method public setSeq(Ljava/lang/String;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lorg/jivesoftware/smack/packet/AnReport;->seq:Ljava/lang/String;

    .line 55
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 101
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "(AnReport;id:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/AnReport;->getStanzaId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toXML()Ljava/lang/CharSequence;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/AnReport;->toXML()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toXML()Ljava/lang/String;
    .locals 3

    .line 74
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    const-string v0, "<a"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    const-string v0, " xmlns=\"urn:xmpp:sm:hw_ext\""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/AnReport;->getStanzaId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 79
    const-string v0, " id=\""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/AnReport;->getStanzaId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    :cond_0
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/AnReport;->getFrom()Lo/fte;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 84
    const-string v0, " from=\""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/AnReport;->getFrom()Lo/fte;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    :cond_1
    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/AnReport;->getTo()Lo/fte;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 89
    const-string v0, " to=\""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lorg/jivesoftware/smack/packet/AnReport;->getTo()Lo/fte;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    :cond_2
    iget-object v0, p0, Lorg/jivesoftware/smack/packet/AnReport;->seq:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 93
    const-string v0, " seq=\""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/jivesoftware/smack/packet/AnReport;->seq:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    :cond_3
    const-string v0, " />"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
