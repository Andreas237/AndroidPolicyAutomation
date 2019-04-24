.class public abstract Lo/ftn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fte;


# instance fields
.field protected c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 53
    instance-of v0, p0, Lo/fti;

    return v0
.end method

.method public final a(Ljava/lang/String;)Z
    .locals 1

    .line 209
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final b(Lo/fte;)I
    .locals 3

    .line 214
    invoke-interface {p1}, Lo/fte;->toString()Ljava/lang/String;

    move-result-object v1

    .line 215
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 216
    invoke-virtual {v2, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public final b()Z
    .locals 1

    .line 48
    instance-of v0, p0, Lo/fth;

    return v0
.end method

.method public charAt(I)C
    .locals 1

    .line 92
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    return v0
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 29
    move-object v0, p1

    check-cast v0, Lo/fte;

    invoke-virtual {p0, v0}, Lo/ftn;->b(Lo/fte;)I

    move-result v0

    return v0
.end method

.method public final d()Z
    .locals 1

    .line 43
    invoke-virtual {p0}, Lo/ftn;->b()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lo/ftn;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final e(Ljava/lang/CharSequence;)Z
    .locals 1

    .line 201
    if-nez p1, :cond_0

    .line 202
    const/4 v0, 0x0

    return v0

    .line 204
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/ftn;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 187
    if-nez p1, :cond_0

    .line 188
    const/4 v0, 0x0

    return v0

    .line 190
    :cond_0
    if-ne p0, p1, :cond_1

    .line 191
    const/4 v0, 0x1

    return v0

    .line 193
    :cond_1
    instance-of v0, p1, Ljava/lang/CharSequence;

    if-eqz v0, :cond_2

    .line 194
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {p0, v0}, Lo/ftn;->e(Ljava/lang/CharSequence;)Z

    move-result v0

    return v0

    .line 196
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public final f()Z
    .locals 1

    .line 63
    instance-of v0, p0, Lo/ftc;

    return v0
.end method

.method public final g()Z
    .locals 1

    .line 71
    instance-of v0, p0, Lo/ftg;

    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 182
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final i()Z
    .locals 1

    .line 58
    instance-of v0, p0, Lo/fsz;

    return v0
.end method

.method public final k()Z
    .locals 1

    .line 76
    instance-of v0, p0, Lo/ftf;

    return v0
.end method

.method public length()I
    .locals 1

    .line 87
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    return v0
.end method

.method public subSequence(II)Ljava/lang/CharSequence;
    .locals 1

    .line 97
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method
