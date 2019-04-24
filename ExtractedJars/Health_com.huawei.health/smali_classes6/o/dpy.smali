.class public Lo/dpy;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dpy$c;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method protected static b(Lo/dpv$b$d;Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/String;
    .locals 5

    .line 45
    if-eqz p0, :cond_0

    .line 46
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object p1, v0

    .line 50
    :cond_0
    goto :goto_0

    .line 48
    :catch_0
    move-exception v4

    .line 49
    const-string v0, "AppPullChangeLogThreadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "buildChangeLogXML, Exception : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    :goto_0
    return-object p1
.end method

.method protected static b(Lorg/xmlpull/v1/XmlPullParser;Lo/dpv$b$d;Lo/dpv$b;)Lo/dpv$b$d;
    .locals 3

    .line 106
    if-eqz p2, :cond_0

    .line 107
    new-instance p1, Lo/dpv$b$d;

    invoke-direct {p1}, Lo/dpv$b$d;-><init>()V

    .line 108
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p1, Lo/dpv$b$d;->d:Ljava/util/List;

    .line 110
    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    move-result v0

    if-ge v2, v0, :cond_3

    .line 111
    const-string v0, "name"

    invoke-interface {p0, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 112
    if-eqz p1, :cond_2

    .line 113
    invoke-interface {p0, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lo/dpv$b$d;->b:Ljava/lang/String;

    goto :goto_1

    .line 115
    :cond_1
    const-string v0, "code"

    invoke-interface {p0, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 116
    if-eqz p1, :cond_2

    .line 117
    invoke-interface {p0, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p1, Lo/dpv$b$d;->a:I

    .line 110
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 121
    :cond_3
    return-object p1
.end method

.method protected static b(Ljava/lang/String;Lo/dpv$b;)Lo/dpv$b;
    .locals 4

    .line 24
    const-string v0, "root"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 25
    new-instance p1, Lo/dpv$b;

    invoke-direct {p1}, Lo/dpv$b;-><init>()V

    .line 26
    const-string v0, "AppPullChangeLogThreadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "root"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 28
    :cond_0
    return-object p1
.end method

.method protected static b(Lo/dpv$b$d;Lo/dpv$b$c;Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/dpv$b$d;Lo/dpv$b$c;Ljava/util/List<Ljava/lang/String;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 62
    if-eqz p0, :cond_1

    .line 63
    iget-object v0, p0, Lo/dpv$b$d;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    if-eqz p2, :cond_0

    .line 65
    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 67
    :cond_0
    if-eqz p1, :cond_1

    .line 68
    iput-object p2, p1, Lo/dpv$b$c;->c:Ljava/util/List;

    .line 71
    :cond_1
    return-void
.end method

.method protected static c(Ljava/lang/String;Lo/dpv$b;Ljava/lang/String;ILo/dpv$b$d;Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lo/dpv$b;Ljava/lang/String;ILo/dpv$b$d;Ljava/util/List<Lo/dpv$b$d;>;)Ljava/util/List<Lo/dpv$b$d;>;"
        }
    .end annotation

    .line 74
    if-nez p5, :cond_0

    .line 75
    new-instance p5, Ljava/util/ArrayList;

    invoke-direct {p5}, Ljava/util/ArrayList;-><init>()V

    .line 77
    :cond_0
    invoke-interface {p5, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 78
    if-eqz p4, :cond_2

    if-eqz p1, :cond_2

    .line 79
    iget-object v0, p4, Lo/dpv$b$d;->b:Ljava/lang/String;

    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p4, Lo/dpv$b$d;->a:I

    if-ne v0, p3, :cond_1

    .line 80
    invoke-interface {p5}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p1, Lo/dpv$b;->b:I

    .line 82
    :cond_1
    iget-object v0, p4, Lo/dpv$b$d;->b:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 83
    invoke-interface {p5}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p1, Lo/dpv$b;->e:I

    .line 86
    :cond_2
    return-object p5
.end method

.method protected static d(Lorg/xmlpull/v1/XmlPullParser;)Ljava/lang/String;
    .locals 4

    .line 125
    const-string v2, ""

    .line 126
    const/4 v3, 0x0

    :goto_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 127
    const-string v0, "name"

    invoke-interface {p0, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 128
    invoke-interface {p0, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v2

    .line 126
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 131
    :cond_1
    return-object v2
.end method

.method protected static d(Lo/dpv$b;Ljava/util/List;)Lo/dpv$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/dpv$b;Ljava/util/List<Lo/dpv$b$d;>;)Lo/dpv$b;"
        }
    .end annotation

    .line 55
    if-eqz p0, :cond_0

    .line 56
    iput-object p1, p0, Lo/dpv$b;->c:Ljava/util/List;

    .line 58
    :cond_0
    return-object p0
.end method

.method protected static e(Lorg/xmlpull/v1/XmlPullParser;Lo/dpv$b$d;Lo/dpv$b$c;Lo/dpv$b;)Lo/dpv$b$c;
    .locals 2

    .line 90
    if-eqz p3, :cond_0

    .line 91
    new-instance p2, Lo/dpv$b$c;

    invoke-direct {p2}, Lo/dpv$b$c;-><init>()V

    .line 93
    :cond_0
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    move-result v0

    if-lez v0, :cond_1

    const-string v0, "module"

    const/4 v1, 0x0

    invoke-interface {p0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 94
    if-eqz p1, :cond_2

    if-eqz p2, :cond_2

    .line 95
    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lo/dpv$b$c;->b:Ljava/lang/String;

    goto :goto_0

    .line 98
    :cond_1
    if-eqz p2, :cond_2

    .line 99
    const-string v0, ""

    iput-object v0, p2, Lo/dpv$b$c;->b:Ljava/lang/String;

    .line 102
    :cond_2
    :goto_0
    return-object p2
.end method

.method protected static e(Lo/dpv$b;ZLjava/lang/String;Lo/dpv$b$d;Lo/dpv$b$c;Ljava/util/List;Ljava/lang/String;)Lo/dpv$b;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/dpv$b;ZLjava/lang/String;Lo/dpv$b$d;Lo/dpv$b$c;Ljava/util/List<Ljava/lang/String;>;Ljava/lang/String;)Lo/dpv$b;"
        }
    .end annotation

    .line 32
    const-string v0, "features"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 33
    invoke-static {p3, p4, p5, p6}, Lo/dpy;->b(Lo/dpv$b$d;Lo/dpv$b$c;Ljava/util/List;Ljava/lang/String;)V

    goto :goto_0

    .line 34
    :cond_0
    const-string v0, "cleardata-flag"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 35
    if-eqz p0, :cond_1

    .line 36
    iput-boolean p1, p0, Lo/dpv$b;->d:Z

    .line 37
    const-string v0, "AppPullChangeLogThreadUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "cleardata-flag end,changeLog.CLEAR_DATA_FLAG="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/dpv$b;->d:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    :cond_1
    :goto_0
    return-object p0
.end method
