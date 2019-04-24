.class public Lorg/apache/commons/cli/PatternOptionBuilder;
.super Ljava/lang/Object;
.source "PatternOptionBuilder.java"


# static fields
.field public static final CLASS_VALUE:Ljava/lang/Class;

.field public static final DATE_VALUE:Ljava/lang/Class;

.field public static final EXISTING_FILE_VALUE:Ljava/lang/Class;

.field public static final FILES_VALUE:Ljava/lang/Class;

.field public static final FILE_VALUE:Ljava/lang/Class;

.field public static final NUMBER_VALUE:Ljava/lang/Class;

.field public static final OBJECT_VALUE:Ljava/lang/Class;

.field public static final STRING_VALUE:Ljava/lang/Class;

.field public static final URL_VALUE:Ljava/lang/Class;

.field static synthetic array$Ljava$io$File:Ljava/lang/Class;

.field static synthetic class$java$io$File:Ljava/lang/Class;

.field static synthetic class$java$io$FileInputStream:Ljava/lang/Class;

.field static synthetic class$java$lang$Class:Ljava/lang/Class;

.field static synthetic class$java$lang$Number:Ljava/lang/Class;

.field static synthetic class$java$lang$Object:Ljava/lang/Class;

.field static synthetic class$java$lang$String:Ljava/lang/Class;

.field static synthetic class$java$net$URL:Ljava/lang/Class;

.field static synthetic class$java$util$Date:Ljava/lang/Class;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 58
    sget-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->class$java$lang$String:Ljava/lang/Class;

    if-nez v0, :cond_0

    const-string v0, "java.lang.String"

    invoke-static {v0}, Lorg/apache/commons/cli/PatternOptionBuilder;->class$(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->class$java$lang$String:Ljava/lang/Class;

    :cond_0
    sput-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->STRING_VALUE:Ljava/lang/Class;

    .line 61
    sget-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->class$java$lang$Object:Ljava/lang/Class;

    if-nez v0, :cond_1

    const-string v0, "java.lang.Object"

    invoke-static {v0}, Lorg/apache/commons/cli/PatternOptionBuilder;->class$(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->class$java$lang$Object:Ljava/lang/Class;

    :cond_1
    sput-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->OBJECT_VALUE:Ljava/lang/Class;

    .line 64
    sget-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->class$java$lang$Number:Ljava/lang/Class;

    if-nez v0, :cond_2

    const-string v0, "java.lang.Number"

    invoke-static {v0}, Lorg/apache/commons/cli/PatternOptionBuilder;->class$(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->class$java$lang$Number:Ljava/lang/Class;

    :cond_2
    sput-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->NUMBER_VALUE:Ljava/lang/Class;

    .line 67
    sget-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->class$java$util$Date:Ljava/lang/Class;

    if-nez v0, :cond_3

    const-string v0, "java.util.Date"

    invoke-static {v0}, Lorg/apache/commons/cli/PatternOptionBuilder;->class$(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->class$java$util$Date:Ljava/lang/Class;

    :cond_3
    sput-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->DATE_VALUE:Ljava/lang/Class;

    .line 70
    sget-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->class$java$lang$Class:Ljava/lang/Class;

    if-nez v0, :cond_4

    const-string v0, "java.lang.Class"

    invoke-static {v0}, Lorg/apache/commons/cli/PatternOptionBuilder;->class$(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->class$java$lang$Class:Ljava/lang/Class;

    :cond_4
    sput-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->CLASS_VALUE:Ljava/lang/Class;

    .line 77
    sget-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->class$java$io$FileInputStream:Ljava/lang/Class;

    if-nez v0, :cond_5

    const-string v0, "java.io.FileInputStream"

    invoke-static {v0}, Lorg/apache/commons/cli/PatternOptionBuilder;->class$(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->class$java$io$FileInputStream:Ljava/lang/Class;

    :cond_5
    sput-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->EXISTING_FILE_VALUE:Ljava/lang/Class;

    .line 80
    sget-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->class$java$io$File:Ljava/lang/Class;

    if-nez v0, :cond_6

    const-string v0, "java.io.File"

    invoke-static {v0}, Lorg/apache/commons/cli/PatternOptionBuilder;->class$(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->class$java$io$File:Ljava/lang/Class;

    :cond_6
    sput-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->FILE_VALUE:Ljava/lang/Class;

    .line 83
    sget-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->array$Ljava$io$File:Ljava/lang/Class;

    if-nez v0, :cond_7

    const-string v0, "[Ljava.io.File;"

    invoke-static {v0}, Lorg/apache/commons/cli/PatternOptionBuilder;->class$(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->array$Ljava$io$File:Ljava/lang/Class;

    :cond_7
    sput-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->FILES_VALUE:Ljava/lang/Class;

    .line 86
    sget-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->class$java$net$URL:Ljava/lang/Class;

    if-nez v0, :cond_8

    const-string v0, "java.net.URL"

    invoke-static {v0}, Lorg/apache/commons/cli/PatternOptionBuilder;->class$(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->class$java$net$URL:Ljava/lang/Class;

    :cond_8
    sput-object v0, Lorg/apache/commons/cli/PatternOptionBuilder;->URL_VALUE:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic class$(Ljava/lang/String;)Ljava/lang/Class;
    .locals 1

    .line 58
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/NoClassDefFoundError;

    invoke-direct {v0}, Ljava/lang/NoClassDefFoundError;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/NoClassDefFoundError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    throw p0
.end method

.method public static getValueClass(C)Ljava/lang/Object;
    .locals 1

    const/16 v0, 0x23

    if-eq p0, v0, :cond_6

    const/16 v0, 0x25

    if-eq p0, v0, :cond_5

    const/16 v0, 0x2f

    if-eq p0, v0, :cond_4

    const/16 v0, 0x3a

    if-eq p0, v0, :cond_3

    const/16 v0, 0x3c

    if-eq p0, v0, :cond_2

    const/16 v0, 0x3e

    if-eq p0, v0, :cond_1

    const/16 v0, 0x40

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    .line 105
    :pswitch_0
    sget-object p0, Lorg/apache/commons/cli/PatternOptionBuilder;->CLASS_VALUE:Ljava/lang/Class;

    return-object p0

    .line 113
    :pswitch_1
    sget-object p0, Lorg/apache/commons/cli/PatternOptionBuilder;->FILES_VALUE:Ljava/lang/Class;

    return-object p0

    .line 99
    :cond_0
    sget-object p0, Lorg/apache/commons/cli/PatternOptionBuilder;->OBJECT_VALUE:Ljava/lang/Class;

    return-object p0

    .line 111
    :cond_1
    sget-object p0, Lorg/apache/commons/cli/PatternOptionBuilder;->FILE_VALUE:Ljava/lang/Class;

    return-object p0

    .line 109
    :cond_2
    sget-object p0, Lorg/apache/commons/cli/PatternOptionBuilder;->EXISTING_FILE_VALUE:Ljava/lang/Class;

    return-object p0

    .line 101
    :cond_3
    sget-object p0, Lorg/apache/commons/cli/PatternOptionBuilder;->STRING_VALUE:Ljava/lang/Class;

    return-object p0

    .line 115
    :cond_4
    sget-object p0, Lorg/apache/commons/cli/PatternOptionBuilder;->URL_VALUE:Ljava/lang/Class;

    return-object p0

    .line 103
    :cond_5
    sget-object p0, Lorg/apache/commons/cli/PatternOptionBuilder;->NUMBER_VALUE:Ljava/lang/Class;

    return-object p0

    .line 107
    :cond_6
    sget-object p0, Lorg/apache/commons/cli/PatternOptionBuilder;->DATE_VALUE:Ljava/lang/Class;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x2a
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static isValueCode(C)Z
    .locals 1

    const/16 v0, 0x40

    if-eq p0, v0, :cond_1

    const/16 v0, 0x3a

    if-eq p0, v0, :cond_1

    const/16 v0, 0x25

    if-eq p0, v0, :cond_1

    const/16 v0, 0x2b

    if-eq p0, v0, :cond_1

    const/16 v0, 0x23

    if-eq p0, v0, :cond_1

    const/16 v0, 0x3c

    if-eq p0, v0, :cond_1

    const/16 v0, 0x3e

    if-eq p0, v0, :cond_1

    const/16 v0, 0x2a

    if-eq p0, v0, :cond_1

    const/16 v0, 0x2f

    if-eq p0, v0, :cond_1

    const/16 v0, 0x21

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static parsePattern(Ljava/lang/String;)Lorg/apache/commons/cli/Options;
    .locals 11

    .line 154
    new-instance v0, Lorg/apache/commons/cli/Options;

    invoke-direct {v0}, Lorg/apache/commons/cli/Options;-><init>()V

    const/4 v1, 0x0

    const/16 v2, 0x20

    const/4 v3, 0x0

    move-object v6, v1

    const/4 v4, 0x0

    const/16 v5, 0x20

    const/4 v7, 0x0

    .line 156
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v8

    const/4 v9, 0x1

    if-ge v4, v8, :cond_4

    .line 158
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v8

    .line 162
    invoke-static {v8}, Lorg/apache/commons/cli/PatternOptionBuilder;->isValueCode(C)Z

    move-result v10

    if-nez v10, :cond_2

    if-eq v5, v2, :cond_1

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    const/4 v9, 0x0

    .line 166
    :goto_1
    invoke-static {v9}, Lorg/apache/commons/cli/OptionBuilder;->hasArg(Z)Lorg/apache/commons/cli/OptionBuilder;

    .line 167
    invoke-static {v7}, Lorg/apache/commons/cli/OptionBuilder;->isRequired(Z)Lorg/apache/commons/cli/OptionBuilder;

    .line 168
    invoke-static {v6}, Lorg/apache/commons/cli/OptionBuilder;->withType(Ljava/lang/Object;)Lorg/apache/commons/cli/OptionBuilder;

    .line 171
    invoke-static {v5}, Lorg/apache/commons/cli/OptionBuilder;->create(C)Lorg/apache/commons/cli/Option;

    move-result-object v5

    invoke-virtual {v0, v5}, Lorg/apache/commons/cli/Options;->addOption(Lorg/apache/commons/cli/Option;)Lorg/apache/commons/cli/Options;

    move-object v6, v1

    const/4 v7, 0x0

    :cond_1
    move v5, v8

    goto :goto_2

    :cond_2
    const/16 v10, 0x21

    if-ne v8, v10, :cond_3

    const/4 v7, 0x1

    goto :goto_2

    .line 185
    :cond_3
    invoke-static {v8}, Lorg/apache/commons/cli/PatternOptionBuilder;->getValueClass(C)Ljava/lang/Object;

    move-result-object v6

    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    if-eq v5, v2, :cond_6

    if-eqz v6, :cond_5

    const/4 v3, 0x1

    .line 191
    :cond_5
    invoke-static {v3}, Lorg/apache/commons/cli/OptionBuilder;->hasArg(Z)Lorg/apache/commons/cli/OptionBuilder;

    .line 192
    invoke-static {v7}, Lorg/apache/commons/cli/OptionBuilder;->isRequired(Z)Lorg/apache/commons/cli/OptionBuilder;

    .line 193
    invoke-static {v6}, Lorg/apache/commons/cli/OptionBuilder;->withType(Ljava/lang/Object;)Lorg/apache/commons/cli/OptionBuilder;

    .line 196
    invoke-static {v5}, Lorg/apache/commons/cli/OptionBuilder;->create(C)Lorg/apache/commons/cli/Option;

    move-result-object p0

    invoke-virtual {v0, p0}, Lorg/apache/commons/cli/Options;->addOption(Lorg/apache/commons/cli/Option;)Lorg/apache/commons/cli/Options;

    :cond_6
    return-object v0
.end method
