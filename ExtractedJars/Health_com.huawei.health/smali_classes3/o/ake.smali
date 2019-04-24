.class public Lo/ake;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 2

    .line 218
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 219
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v1

    .line 220
    invoke-static {v1}, Lo/ake;->d(Lo/afj;)Z

    move-result v0

    return v0

    .line 222
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static d(Lo/afj;)Z
    .locals 2

    .line 208
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 209
    invoke-virtual {p0}, Lo/afj;->i()Lo/acf;

    move-result-object v0

    invoke-virtual {v0}, Lo/acf;->e()I

    move-result v1

    .line 210
    const/16 v0, 0x8

    if-ne v1, v0, :cond_0

    .line 211
    const/4 v0, 0x1

    return v0

    .line 214
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
