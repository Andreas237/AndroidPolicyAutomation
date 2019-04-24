.class Lcom/usebutton/sdk/internal/util/SafeSimpleDateFormat;
.super Ljava/lang/Object;
.source "SafeSimpleDateFormat.java"


# static fields
.field static final ISO_8601:Ljava/lang/String; = "yyyy-MM-dd\'T\'HH:mm:ss.SSSZZZ"


# instance fields
.field private formatter:Ljava/text/SimpleDateFormat;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    :try_start_0
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/util/SafeSimpleDateFormat;->init()V
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "Unable to create date formatter; reverting to UTC offset."

    .line 27
    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visible(Ljava/lang/String;)V

    :goto_0
    return-void
.end method


# virtual methods
.method format(Ljava/util/Date;)Ljava/lang/String;
    .locals 2

    .line 38
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/SafeSimpleDateFormat;->formatter:Ljava/text/SimpleDateFormat;

    if-eqz v0, :cond_0

    .line 39
    invoke-virtual {v0, p1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 41
    :cond_0
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected init()V
    .locals 3
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/UnsupportedOperationException;
        }
    .end annotation

    .line 80
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string/jumbo v1, "yyyy-MM-dd\'T\'HH:mm:ss.SSSZZZ"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/util/SafeSimpleDateFormat;->formatter:Ljava/text/SimpleDateFormat;

    return-void
.end method

.method parse(Ljava/lang/String;)Ljava/util/Date;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/text/ParseException;
        }
    .end annotation

    .line 65
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/SafeSimpleDateFormat;->formatter:Ljava/text/SimpleDateFormat;

    if-eqz v0, :cond_0

    .line 66
    invoke-virtual {v0, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    return-object p1

    .line 69
    :cond_0
    new-instance v0, Ljava/text/ParseException;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v0
.end method

.method setTimeZone(Ljava/util/TimeZone;)V
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/SafeSimpleDateFormat;->formatter:Ljava/text/SimpleDateFormat;

    if-eqz v0, :cond_0

    .line 52
    invoke-virtual {v0, p1}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    :cond_0
    return-void
.end method
