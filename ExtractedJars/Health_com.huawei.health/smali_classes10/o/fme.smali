.class public Lo/fme;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fme$2;,
        Lo/fme$c;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    return-void
.end method

.method public static d(Lo/fov;Lo/fmw;)Lo/foz;
    .locals 6

    .line 59
    const/4 v0, 0x0

    if-eq v0, p0, :cond_2

    .line 60
    invoke-interface {p0}, Lo/fov;->c()Ljava/lang/String;

    move-result-object v3

    .line 61
    const-string v0, "UDP"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 62
    new-instance v0, Lo/fpm;

    invoke-direct {v0}, Lo/fpm;-><init>()V

    return-object v0

    .line 64
    :cond_0
    const-string v0, "TCP"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 65
    new-instance v0, Lo/fpk;

    invoke-direct {v0}, Lo/fpk;-><init>()V

    return-object v0

    .line 67
    :cond_1
    const-string v0, "TLS"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 68
    new-instance v0, Lo/fpl;

    invoke-direct {v0}, Lo/fpl;-><init>()V

    return-object v0

    .line 71
    :cond_2
    const-string v3, "???"

    .line 72
    sget-object v4, Lo/fme$c;->a:Lo/fme$c;

    .line 74
    const-string v0, "DTLS_RESPONSE_MATCHING"

    :try_start_0
    invoke-virtual {p1, v0}, Lo/fmw;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v3, v0

    .line 75
    invoke-static {v3}, Lo/fme$c;->valueOf(Ljava/lang/String;)Lo/fme$c;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v4

    .line 80
    goto :goto_0

    .line 76
    :catch_0
    move-exception v5

    .line 77
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "DTLS response matching mode \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\' not supported!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 78
    :catch_1
    move-exception v5

    .line 79
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "DTLS response matching mode not provided/configured!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 81
    :goto_0
    sget-object v0, Lo/fme$2;->d:[I

    invoke-virtual {v4}, Lo/fme$c;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 83
    :pswitch_0
    goto :goto_1

    .line 85
    :pswitch_1
    new-instance v0, Lo/fph;

    invoke-direct {v0}, Lo/fph;-><init>()V

    return-object v0

    .line 87
    :pswitch_2
    new-instance v0, Lo/fpe;

    invoke-direct {v0}, Lo/fpe;-><init>()V

    return-object v0

    .line 89
    :goto_1
    new-instance v0, Lo/fpi;

    invoke-direct {v0}, Lo/fpi;-><init>()V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
