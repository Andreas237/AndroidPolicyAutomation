.class public Lo/aug;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:I

.field private static b:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 44
    const/4 v0, 0x0

    sput v0, Lo/aug;->a:I

    .line 49
    const-wide/16 v0, 0x0

    sput-wide v0, Lo/aug;->b:J

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lo/axr;)Z
    .locals 3

    .line 59
    const/4 v2, 0x1

    .line 60
    invoke-virtual {p0}, Lo/axr;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 62
    const-string v0, "AccountManager"

    const-string v1, "isAccountValidate accountInfo deviceId is null."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    const/4 v2, 0x0

    .line 66
    :cond_0
    return v2
.end method

.method public static c(Lo/axr;)Z
    .locals 3

    .line 77
    const/4 v2, 0x1

    .line 80
    invoke-static {}, Lo/awn;->e()Lo/awn;

    move-result-object v0

    invoke-virtual {p0}, Lo/axr;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/awn;->d(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 82
    const-string v0, "AccountManager"

    const-string v1, "isSnsAvailable service not available"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    const/4 v2, 0x0

    .line 85
    :cond_0
    return v2
.end method

.method public static d(Lo/aue;Lo/aud;)V
    .locals 6

    .line 96
    invoke-static {}, Lo/aza;->b()Lo/aza;

    move-result-object v0

    invoke-virtual {v0}, Lo/aza;->c()Landroid/app/Activity;

    move-result-object v3

    .line 97
    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    .line 99
    const/16 v0, 0x3ea

    const v1, 0x14ff1

    invoke-interface {p1, v0, v1}, Lo/aud;->e(II)V

    .line 100
    const-string v0, "AccountManager"

    const-string v1, "no ForegroundActivity when login hwAccount!"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    return-void

    .line 103
    :cond_0
    invoke-static {}, Lo/aug;->d()Z

    move-result v4

    .line 106
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/bpl;->d(Landroid/content/Context;)Z

    move-result v5

    .line 108
    if-eqz v4, :cond_1

    if-nez v5, :cond_2

    .line 110
    :cond_1
    const/16 v0, 0x3ea

    const v1, 0x14ff1

    invoke-interface {p1, v0, v1}, Lo/aud;->e(II)V

    .line 111
    const-string v0, "AccountManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "st error. isAllowedLogin="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",NetWork isConn="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    return-void

    .line 115
    :cond_2
    invoke-static {}, Lo/aor;->d()Lo/aor;

    move-result-object v0

    new-instance v1, Lo/aug$4;

    invoke-direct {v1, p0, p1}, Lo/aug$4;-><init>(Lo/aue;Lo/aud;)V

    const/4 v2, 0x0

    invoke-virtual {v0, v3, v1, v2}, Lo/aor;->d(Landroid/app/Activity;Lo/aoo;Z)V

    .line 132
    return-void
.end method

.method private static d()Z
    .locals 8

    .line 141
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 142
    sget-wide v0, Lo/aug;->b:J

    sub-long v0, v4, v0

    const-wide/16 v2, 0x3e8

    div-long v6, v0, v2

    .line 145
    const-wide/16 v0, 0x12c

    cmp-long v0, v6, v0

    if-lez v0, :cond_0

    .line 147
    sput-wide v4, Lo/aug;->b:J

    .line 148
    const/4 v0, 0x0

    sput v0, Lo/aug;->a:I

    .line 149
    const/4 v0, 0x1

    return v0

    .line 153
    :cond_0
    sget v0, Lo/aug;->a:I

    const/4 v1, 0x3

    if-le v0, v1, :cond_1

    .line 155
    const/4 v0, 0x0

    return v0

    .line 157
    :cond_1
    sget v0, Lo/aug;->a:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lo/aug;->a:I

    .line 159
    const/4 v0, 0x1

    return v0
.end method
