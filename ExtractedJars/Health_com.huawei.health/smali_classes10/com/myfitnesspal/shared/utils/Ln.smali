.class public Lcom/myfitnesspal/shared/utils/Ln;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/myfitnesspal/shared/utils/Ln$Print;,
        Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;,
        Lcom/myfitnesspal/shared/utils/Ln$Config;
    }
.end annotation


# static fields
.field protected static config:Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;

.field protected static print:Lcom/myfitnesspal/shared/utils/Ln$Print;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    new-instance v0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;

    invoke-direct {v0}, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;-><init>()V

    sput-object v0, Lcom/myfitnesspal/shared/utils/Ln;->config:Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;

    .line 31
    new-instance v0, Lcom/myfitnesspal/shared/utils/Ln$Print;

    invoke-direct {v0}, Lcom/myfitnesspal/shared/utils/Ln$Print;-><init>()V

    sput-object v0, Lcom/myfitnesspal/shared/utils/Ln;->print:Lcom/myfitnesspal/shared/utils/Ln$Print;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static varargs d(Ljava/lang/Object;[Ljava/lang/Object;)I
    .locals 4

    .line 66
    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->config:Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;

    iget v0, v0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->minimumLogLevel:I

    const/4 v1, 0x3

    if-le v0, v1, :cond_0

    .line 67
    const/4 v0, 0x0

    return v0

    .line 69
    :cond_0
    invoke-static {p0}, Lcom/myfitnesspal/shared/utils/Strings;->toString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 70
    array-length v0, p1

    if-lez v0, :cond_1

    invoke-static {v2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_1
    move-object v3, v2

    .line 71
    :goto_0
    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->print:Lcom/myfitnesspal/shared/utils/Ln$Print;

    const/4 v1, 0x3

    invoke-virtual {v0, v1, v3}, Lcom/myfitnesspal/shared/utils/Ln$Print;->println(ILjava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static d(Ljava/lang/Throwable;)I
    .locals 3

    .line 62
    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->config:Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;

    iget v0, v0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->minimumLogLevel:I

    const/4 v1, 0x3

    if-gt v0, v1, :cond_0

    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->print:Lcom/myfitnesspal/shared/utils/Ln$Print;

    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v0, v2, v1}, Lcom/myfitnesspal/shared/utils/Ln$Print;->println(ILjava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static varargs d(Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I
    .locals 4

    .line 75
    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->config:Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;

    iget v0, v0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->minimumLogLevel:I

    const/4 v1, 0x3

    if-le v0, v1, :cond_0

    .line 76
    const/4 v0, 0x0

    return v0

    .line 78
    :cond_0
    invoke-static {p1}, Lcom/myfitnesspal/shared/utils/Strings;->toString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 79
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    array-length v1, p2

    if-lez v1, :cond_1

    invoke-static {v2, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 80
    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->print:Lcom/myfitnesspal/shared/utils/Ln$Print;

    const/4 v1, 0x3

    invoke-virtual {v0, v1, v3}, Lcom/myfitnesspal/shared/utils/Ln$Print;->println(ILjava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static varargs e(Ljava/lang/Object;[Ljava/lang/Object;)I
    .locals 4

    .line 132
    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->config:Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;

    iget v0, v0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->minimumLogLevel:I

    const/4 v1, 0x6

    if-le v0, v1, :cond_0

    .line 133
    const/4 v0, 0x0

    return v0

    .line 135
    :cond_0
    invoke-static {p0}, Lcom/myfitnesspal/shared/utils/Strings;->toString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 136
    array-length v0, p1

    if-lez v0, :cond_1

    invoke-static {v2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_1
    move-object v3, v2

    .line 137
    :goto_0
    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->print:Lcom/myfitnesspal/shared/utils/Ln$Print;

    const/4 v1, 0x6

    invoke-virtual {v0, v1, v3}, Lcom/myfitnesspal/shared/utils/Ln$Print;->println(ILjava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static e(Ljava/lang/Throwable;)I
    .locals 3

    .line 128
    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->config:Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;

    iget v0, v0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->minimumLogLevel:I

    const/4 v1, 0x6

    if-gt v0, v1, :cond_0

    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->print:Lcom/myfitnesspal/shared/utils/Ln$Print;

    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x6

    invoke-virtual {v0, v2, v1}, Lcom/myfitnesspal/shared/utils/Ln$Print;->println(ILjava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static varargs e(Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I
    .locals 4

    .line 141
    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->config:Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;

    iget v0, v0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->minimumLogLevel:I

    const/4 v1, 0x6

    if-le v0, v1, :cond_0

    .line 142
    const/4 v0, 0x0

    return v0

    .line 144
    :cond_0
    invoke-static {p1}, Lcom/myfitnesspal/shared/utils/Strings;->toString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 145
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    array-length v1, p2

    if-lez v1, :cond_1

    invoke-static {v2, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 146
    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->print:Lcom/myfitnesspal/shared/utils/Ln$Print;

    const/4 v1, 0x6

    invoke-virtual {v0, v1, v3}, Lcom/myfitnesspal/shared/utils/Ln$Print;->println(ILjava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static getConfig()Lcom/myfitnesspal/shared/utils/Ln$Config;
    .locals 1

    .line 158
    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->config:Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;

    return-object v0
.end method

.method public static varargs i(Ljava/lang/Object;[Ljava/lang/Object;)I
    .locals 4

    .line 88
    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->config:Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;

    iget v0, v0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->minimumLogLevel:I

    const/4 v1, 0x4

    if-le v0, v1, :cond_0

    .line 89
    const/4 v0, 0x0

    return v0

    .line 91
    :cond_0
    invoke-static {p0}, Lcom/myfitnesspal/shared/utils/Strings;->toString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 92
    array-length v0, p1

    if-lez v0, :cond_1

    invoke-static {v2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_1
    move-object v3, v2

    .line 93
    :goto_0
    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->print:Lcom/myfitnesspal/shared/utils/Ln$Print;

    const/4 v1, 0x4

    invoke-virtual {v0, v1, v3}, Lcom/myfitnesspal/shared/utils/Ln$Print;->println(ILjava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static i(Ljava/lang/Throwable;)I
    .locals 3

    .line 84
    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->config:Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;

    iget v0, v0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->minimumLogLevel:I

    const/4 v1, 0x4

    if-gt v0, v1, :cond_0

    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->print:Lcom/myfitnesspal/shared/utils/Ln$Print;

    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {v0, v2, v1}, Lcom/myfitnesspal/shared/utils/Ln$Print;->println(ILjava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static varargs i(Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I
    .locals 4

    .line 97
    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->config:Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;

    iget v0, v0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->minimumLogLevel:I

    const/4 v1, 0x4

    if-le v0, v1, :cond_0

    .line 98
    const/4 v0, 0x0

    return v0

    .line 100
    :cond_0
    invoke-static {p1}, Lcom/myfitnesspal/shared/utils/Strings;->toString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 101
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    array-length v1, p2

    if-lez v1, :cond_1

    invoke-static {v2, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 102
    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->print:Lcom/myfitnesspal/shared/utils/Ln$Print;

    const/4 v1, 0x4

    invoke-virtual {v0, v1, v3}, Lcom/myfitnesspal/shared/utils/Ln$Print;->println(ILjava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static isDebugEnabled()Z
    .locals 2

    .line 150
    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->config:Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;

    iget v0, v0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->minimumLogLevel:I

    const/4 v1, 0x3

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static isVerboseEnabled()Z
    .locals 2

    .line 154
    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->config:Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;

    iget v0, v0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->minimumLogLevel:I

    const/4 v1, 0x2

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static logLevelToString(I)Ljava/lang/String;
    .locals 1

    .line 202
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 204
    :pswitch_0
    const-string v0, "VERBOSE"

    return-object v0

    .line 206
    :pswitch_1
    const-string v0, "DEBUG"

    return-object v0

    .line 208
    :pswitch_2
    const-string v0, "INFO"

    return-object v0

    .line 210
    :pswitch_3
    const-string v0, "WARN"

    return-object v0

    .line 212
    :pswitch_4
    const-string v0, "ERROR"

    return-object v0

    .line 214
    :pswitch_5
    const-string v0, "ASSERT"

    return-object v0

    .line 217
    :goto_0
    const-string v0, "UNKNOWN"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public static varargs v(Ljava/lang/Object;[Ljava/lang/Object;)I
    .locals 4

    .line 44
    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->config:Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;

    iget v0, v0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->minimumLogLevel:I

    const/4 v1, 0x2

    if-le v0, v1, :cond_0

    .line 45
    const/4 v0, 0x0

    return v0

    .line 47
    :cond_0
    invoke-static {p0}, Lcom/myfitnesspal/shared/utils/Strings;->toString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 48
    array-length v0, p1

    if-lez v0, :cond_1

    invoke-static {v2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_1
    move-object v3, v2

    .line 49
    :goto_0
    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->print:Lcom/myfitnesspal/shared/utils/Ln$Print;

    const/4 v1, 0x2

    invoke-virtual {v0, v1, v3}, Lcom/myfitnesspal/shared/utils/Ln$Print;->println(ILjava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static v(Ljava/lang/Throwable;)I
    .locals 3

    .line 40
    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->config:Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;

    iget v0, v0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->minimumLogLevel:I

    const/4 v1, 0x2

    if-gt v0, v1, :cond_0

    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->print:Lcom/myfitnesspal/shared/utils/Ln$Print;

    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Lcom/myfitnesspal/shared/utils/Ln$Print;->println(ILjava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static varargs v(Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I
    .locals 4

    .line 53
    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->config:Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;

    iget v0, v0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->minimumLogLevel:I

    const/4 v1, 0x2

    if-le v0, v1, :cond_0

    .line 54
    const/4 v0, 0x0

    return v0

    .line 56
    :cond_0
    invoke-static {p1}, Lcom/myfitnesspal/shared/utils/Strings;->toString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    array-length v1, p2

    if-lez v1, :cond_1

    invoke-static {v2, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 58
    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->print:Lcom/myfitnesspal/shared/utils/Ln$Print;

    const/4 v1, 0x2

    invoke-virtual {v0, v1, v3}, Lcom/myfitnesspal/shared/utils/Ln$Print;->println(ILjava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static varargs w(Ljava/lang/Object;[Ljava/lang/Object;)I
    .locals 4

    .line 110
    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->config:Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;

    iget v0, v0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->minimumLogLevel:I

    const/4 v1, 0x5

    if-le v0, v1, :cond_0

    .line 111
    const/4 v0, 0x0

    return v0

    .line 113
    :cond_0
    invoke-static {p0}, Lcom/myfitnesspal/shared/utils/Strings;->toString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 114
    array-length v0, p1

    if-lez v0, :cond_1

    invoke-static {v2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_1
    move-object v3, v2

    .line 115
    :goto_0
    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->print:Lcom/myfitnesspal/shared/utils/Ln$Print;

    const/4 v1, 0x5

    invoke-virtual {v0, v1, v3}, Lcom/myfitnesspal/shared/utils/Ln$Print;->println(ILjava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static w(Ljava/lang/Throwable;)I
    .locals 3

    .line 106
    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->config:Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;

    iget v0, v0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->minimumLogLevel:I

    const/4 v1, 0x5

    if-gt v0, v1, :cond_0

    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->print:Lcom/myfitnesspal/shared/utils/Ln$Print;

    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x5

    invoke-virtual {v0, v2, v1}, Lcom/myfitnesspal/shared/utils/Ln$Print;->println(ILjava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static varargs w(Ljava/lang/Throwable;Ljava/lang/Object;[Ljava/lang/Object;)I
    .locals 4

    .line 119
    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->config:Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;

    iget v0, v0, Lcom/myfitnesspal/shared/utils/Ln$BaseConfig;->minimumLogLevel:I

    const/4 v1, 0x5

    if-le v0, v1, :cond_0

    .line 120
    const/4 v0, 0x0

    return v0

    .line 122
    :cond_0
    invoke-static {p1}, Lcom/myfitnesspal/shared/utils/Strings;->toString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 123
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    array-length v1, p2

    if-lez v1, :cond_1

    invoke-static {v2, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 124
    sget-object v0, Lcom/myfitnesspal/shared/utils/Ln;->print:Lcom/myfitnesspal/shared/utils/Ln$Print;

    const/4 v1, 0x5

    invoke-virtual {v0, v1, v3}, Lcom/myfitnesspal/shared/utils/Ln$Print;->println(ILjava/lang/String;)I

    move-result v0

    return v0
.end method
