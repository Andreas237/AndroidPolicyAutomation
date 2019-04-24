.class public final Lo/anw;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Landroid/content/ContentValues;Ljava/lang/String;J)J
    .locals 3

    .line 45
    invoke-virtual {p0, p1}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    .line 46
    if-eqz v2, :cond_0

    .line 48
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    .line 50
    :cond_0
    return-wide p2
.end method

.method public static c(Ljava/lang/String;J)J
    .locals 5

    .line 62
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 64
    return-wide p1

    .line 66
    :cond_0
    move-wide v2, p1

    .line 69
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v2, v0

    .line 74
    goto :goto_0

    .line 71
    :catch_0
    move-exception v4

    .line 73
    const-string v0, "SNS_BAK"

    const-string v1, "parse Long value meet NumberFormatException!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    :goto_0
    return-wide v2
.end method

.method public static e(Landroid/content/ContentValues;Ljava/lang/String;Z)Z
    .locals 3

    .line 24
    invoke-virtual {p0, p1}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    .line 25
    if-eqz v2, :cond_1

    .line 27
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 31
    :cond_1
    return p2
.end method
