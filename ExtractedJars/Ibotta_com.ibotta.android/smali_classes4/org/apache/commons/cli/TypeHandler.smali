.class public Lorg/apache/commons/cli/TypeHandler;
.super Ljava/lang/Object;
.source "TypeHandler.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static createClass(Ljava/lang/String;)Ljava/lang/Class;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/commons/cli/ParseException;
        }
    .end annotation

    .line 180
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 184
    :catch_0
    new-instance v0, Lorg/apache/commons/cli/ParseException;

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Unable to find the class: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/apache/commons/cli/ParseException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static createDate(Ljava/lang/String;)Ljava/util/Date;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/commons/cli/ParseException;
        }
    .end annotation

    .line 198
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Not yet implemented"

    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static createFile(Ljava/lang/String;)Ljava/io/File;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/commons/cli/ParseException;
        }
    .end annotation

    .line 230
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static createFiles(Ljava/lang/String;)[Ljava/io/File;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/commons/cli/ParseException;
        }
    .end annotation

    .line 244
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Not yet implemented"

    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static createNumber(Ljava/lang/String;)Ljava/lang/Number;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/commons/cli/ParseException;
        }
    .end annotation

    const/16 v0, 0x2e

    .line 154
    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 156
    invoke-static {p0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object p0

    return-object p0

    .line 160
    :cond_0
    invoke-static {p0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 165
    new-instance v0, Lorg/apache/commons/cli/ParseException;

    invoke-virtual {p0}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/apache/commons/cli/ParseException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static createObject(Ljava/lang/String;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/commons/cli/ParseException;
        }
    .end annotation

    .line 120
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    .line 131
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    .line 135
    new-instance v1, Lorg/apache/commons/cli/ParseException;

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v0, "; Unable to create an instance of: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Lorg/apache/commons/cli/ParseException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 124
    :catch_1
    new-instance v0, Lorg/apache/commons/cli/ParseException;

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Unable to find the class: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/apache/commons/cli/ParseException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static createURL(Ljava/lang/String;)Ljava/net/URL;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/commons/cli/ParseException;
        }
    .end annotation

    .line 213
    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 217
    :catch_0
    new-instance v0, Lorg/apache/commons/cli/ParseException;

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Unable to parse the URL: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/apache/commons/cli/ParseException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static createValue(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/commons/cli/ParseException;
        }
    .end annotation

    .line 64
    sget-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->STRING_VALUE:Ljava/lang/Class;

    if-ne v0, p1, :cond_0

    return-object p0

    .line 68
    :cond_0
    sget-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->OBJECT_VALUE:Ljava/lang/Class;

    if-ne v0, p1, :cond_1

    .line 70
    invoke-static {p0}, Lorg/apache/commons/cli/TypeHandler;->createObject(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 72
    :cond_1
    sget-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->NUMBER_VALUE:Ljava/lang/Class;

    if-ne v0, p1, :cond_2

    .line 74
    invoke-static {p0}, Lorg/apache/commons/cli/TypeHandler;->createNumber(Ljava/lang/String;)Ljava/lang/Number;

    move-result-object p0

    return-object p0

    .line 76
    :cond_2
    sget-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->DATE_VALUE:Ljava/lang/Class;

    if-ne v0, p1, :cond_3

    .line 78
    invoke-static {p0}, Lorg/apache/commons/cli/TypeHandler;->createDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0

    return-object p0

    .line 80
    :cond_3
    sget-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->CLASS_VALUE:Ljava/lang/Class;

    if-ne v0, p1, :cond_4

    .line 82
    invoke-static {p0}, Lorg/apache/commons/cli/TypeHandler;->createClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    return-object p0

    .line 84
    :cond_4
    sget-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->FILE_VALUE:Ljava/lang/Class;

    if-ne v0, p1, :cond_5

    .line 86
    invoke-static {p0}, Lorg/apache/commons/cli/TypeHandler;->createFile(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0

    .line 88
    :cond_5
    sget-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->EXISTING_FILE_VALUE:Ljava/lang/Class;

    if-ne v0, p1, :cond_6

    .line 90
    invoke-static {p0}, Lorg/apache/commons/cli/TypeHandler;->createFile(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0

    .line 92
    :cond_6
    sget-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->FILES_VALUE:Ljava/lang/Class;

    if-ne v0, p1, :cond_7

    .line 94
    invoke-static {p0}, Lorg/apache/commons/cli/TypeHandler;->createFiles(Ljava/lang/String;)[Ljava/io/File;

    move-result-object p0

    return-object p0

    .line 96
    :cond_7
    sget-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->URL_VALUE:Ljava/lang/Class;

    if-ne v0, p1, :cond_8

    .line 98
    invoke-static {p0}, Lorg/apache/commons/cli/TypeHandler;->createURL(Ljava/lang/String;)Ljava/net/URL;

    move-result-object p0

    return-object p0

    :cond_8
    const/4 p0, 0x0

    return-object p0
.end method

.method public static createValue(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/apache/commons/cli/ParseException;
        }
    .end annotation

    .line 49
    check-cast p1, Ljava/lang/Class;

    invoke-static {p0, p1}, Lorg/apache/commons/cli/TypeHandler;->createValue(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
