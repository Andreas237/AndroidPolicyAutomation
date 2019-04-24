.class public Lcom/shopkick/logging/LogCatAppender;
.super Lcom/shopkick/logging/AppenderBase;
.source "LogCatAppender.java"


# static fields
.field public static final APPENDER_TAG:Ljava/lang/String;

.field private static final LogCatLogTag:Ljava/lang/String; = "SHOPKICK"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 11
    const-class v0, Lcom/shopkick/logging/LogCatAppender;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/shopkick/logging/LogCatAppender;->APPENDER_TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Lcom/shopkick/logging/AppenderBase;-><init>()V

    return-void
.end method


# virtual methods
.method public getAppenderConfig(Lcom/shopkick/logging/ConfigurationProvider;)Lcom/shopkick/logging/AppenderConfig;
    .locals 1

    .line 67
    sget-object v0, Lcom/shopkick/logging/LogCatAppender;->APPENDER_TAG:Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/shopkick/logging/ConfigurationProvider;->getAppenderConfig(Ljava/lang/String;)Lcom/shopkick/logging/AppenderConfig;

    move-result-object p1

    return-object p1
.end method

.method public log(Lcom/shopkick/logging/Message;Lcom/shopkick/logging/ConfigurationProvider;)V
    .locals 4

    if-eqz p1, :cond_7

    const-string v0, "LEVEL"

    .line 22
    const-class v1, Lcom/shopkick/logging/Level;

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/logging/Message;->safelyExtract(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/logging/Level;

    const-string v1, "THROWABLE"

    .line 23
    const-class v2, Ljava/lang/Throwable;

    invoke-virtual {p1, v1, v2}, Lcom/shopkick/logging/Message;->safelyExtract(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    if-nez v0, :cond_0

    return-void

    .line 28
    :cond_0
    invoke-virtual {p0, p2}, Lcom/shopkick/logging/LogCatAppender;->isEnabled(Lcom/shopkick/logging/ConfigurationProvider;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {p1}, Lcom/shopkick/logging/Message;->getAreas()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3, p2}, Lcom/shopkick/logging/LogCatAppender;->isAreaActive(JLcom/shopkick/logging/ConfigurationProvider;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 29
    invoke-virtual {p0, p2}, Lcom/shopkick/logging/LogCatAppender;->getAppenderConfig(Lcom/shopkick/logging/ConfigurationProvider;)Lcom/shopkick/logging/AppenderConfig;

    move-result-object v2

    invoke-interface {v2, v0}, Lcom/shopkick/logging/AppenderConfig;->isLevelActive(Lcom/shopkick/logging/Level;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/logging/LogCatAppender;->shouldLog(Lcom/shopkick/logging/Message;Lcom/shopkick/logging/ConfigurationProvider;)Z

    move-result p2

    if-eqz p2, :cond_6

    .line 30
    invoke-static {p1}, Lcom/shopkick/logging/LogCatMessageFormatter;->formatMessage(Lcom/shopkick/logging/Message;)Ljava/lang/String;

    move-result-object p1

    .line 31
    sget-object p2, Lcom/shopkick/logging/LogCatAppender$1;->$SwitchMap$com$shopkick$logging$Level:[I

    invoke-virtual {v0}, Lcom/shopkick/logging/Level;->ordinal()I

    move-result v2

    aget p2, p2, v2

    packed-switch p2, :pswitch_data_0

    .line 58
    new-instance p1, Ljava/lang/IllegalArgumentException;

    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    .line 60
    invoke-virtual {v0}, Lcom/shopkick/logging/Level;->name()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v1, v2

    const-string v0, "Unsupported log level [level:%1$s]"

    .line 58
    invoke-static {p2, v0, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    if-nez v1, :cond_1

    const-string p2, "SHOPKICK"

    .line 53
    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    const-string p2, "SHOPKICK"

    .line 54
    invoke-static {p2, p1, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :pswitch_1
    if-nez v1, :cond_2

    const-string p2, "SHOPKICK"

    .line 48
    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_2
    const-string p2, "SHOPKICK"

    .line 49
    invoke-static {p2, p1, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :pswitch_2
    if-nez v1, :cond_3

    const-string p2, "SHOPKICK"

    .line 43
    invoke-static {p2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_3
    const-string p2, "SHOPKICK"

    .line 44
    invoke-static {p2, p1, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :pswitch_3
    if-nez v1, :cond_4

    const-string p2, "SHOPKICK"

    .line 38
    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_4
    const-string p2, "SHOPKICK"

    .line 39
    invoke-static {p2, p1, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :pswitch_4
    if-nez v1, :cond_5

    const-string p2, "SHOPKICK"

    .line 33
    invoke-static {p2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_5
    const-string p2, "SHOPKICK"

    .line 34
    invoke-static {p2, p1, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_6
    :goto_0
    return-void

    .line 21
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'message\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
