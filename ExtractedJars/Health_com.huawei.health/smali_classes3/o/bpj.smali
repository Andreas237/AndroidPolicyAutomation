.class public final Lo/bpj;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bpj$d;,
        Lo/bpj$c;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(ILjava/lang/String;)V
    .locals 3

    .line 45
    invoke-static {p0}, Lo/bpi;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 48
    const v0, 0x3611c049

    invoke-static {v0, p0, p1}, Lo/bpj;->c(IILjava/lang/String;)V

    goto :goto_0

    .line 52
    :cond_0
    const-string v0, "SNS"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ignore report code "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    :goto_0
    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 0

    .line 240
    invoke-static {p0}, Lo/bpj;->f(Ljava/lang/String;)V

    .line 241
    return-void
.end method

.method public static b(ILjava/lang/String;)V
    .locals 3

    .line 117
    invoke-static {p0}, Lo/bpi;->c(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 120
    const v0, 0x3611c04b

    invoke-static {v0, p0, p1}, Lo/bpj;->c(IILjava/lang/String;)V

    goto :goto_0

    .line 124
    :cond_0
    const-string v0, "MTS"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ignore report code "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    :goto_0
    return-void
.end method

.method public static b(Ljava/lang/String;)V
    .locals 1

    .line 261
    const v0, 0x3611c054

    invoke-static {v0, p0}, Lo/bpj;->g(ILjava/lang/String;)V

    .line 262
    return-void
.end method

.method private static c(IILjava/lang/String;)V
    .locals 2

    .line 274
    new-instance v0, Lo/bpj$d;

    invoke-direct {v0, p0}, Lo/bpj$d;-><init>(I)V

    invoke-virtual {v0, p1}, Lo/bpj$d;->c(I)Lo/bpj$d;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/bpj$d;->c(Ljava/lang/String;)Lo/bpj$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/bpj$d;->d()Landroid/os/Bundle;

    move-result-object v1

    .line 277
    invoke-static {p0, v1}, Lo/bpj;->c(ILandroid/os/Bundle;)V

    .line 278
    return-void
.end method

.method private static c(ILandroid/os/Bundle;)V
    .locals 2

    .line 301
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/bpj$c;

    invoke-direct {v1, p0, p1}, Lo/bpj$c;-><init>(ILandroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Lo/brb;->d(Ljava/lang/Runnable;)V

    .line 303
    return-void
.end method

.method public static c(ILjava/lang/String;)V
    .locals 1

    .line 85
    const v0, 0x3611c04a

    invoke-static {v0, p0, p1}, Lo/bpj;->c(IILjava/lang/String;)V

    .line 86
    return-void
.end method

.method public static c(Ljava/lang/String;)V
    .locals 1

    .line 106
    const v0, 0x3611c059

    invoke-static {v0, p0}, Lo/bpj;->g(ILjava/lang/String;)V

    .line 107
    return-void
.end method

.method public static d(ILjava/lang/String;)V
    .locals 3

    .line 64
    invoke-static {p0}, Lo/bpi;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 67
    const v0, 0x3611c058

    invoke-static {v0, p0, p1}, Lo/bpj;->c(IILjava/lang/String;)V

    goto :goto_0

    .line 71
    :cond_0
    const-string v0, "CIS"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ignore report code "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    :goto_0
    return-void
.end method

.method public static d(Ljava/lang/String;)V
    .locals 1

    .line 215
    const v0, 0x3611c04f

    invoke-static {v0, p0}, Lo/bpj;->g(ILjava/lang/String;)V

    .line 216
    return-void
.end method

.method public static e(ILjava/lang/String;)V
    .locals 1

    .line 96
    const v0, 0x3611c057

    invoke-static {v0, p0, p1}, Lo/bpj;->c(IILjava/lang/String;)V

    .line 97
    return-void
.end method

.method public static e(Ljava/lang/String;)V
    .locals 1

    .line 193
    const v0, 0x3611c04e

    invoke-static {v0, p0}, Lo/bpj;->g(ILjava/lang/String;)V

    .line 194
    return-void
.end method

.method public static f(ILjava/lang/String;)V
    .locals 3

    .line 156
    invoke-static {p0}, Lo/bpi;->h(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 159
    const v0, 0x3611c04c

    invoke-static {v0, p0, p1}, Lo/bpj;->c(IILjava/lang/String;)V

    goto :goto_0

    .line 163
    :cond_0
    const-string v0, "TRS"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ignore report code "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    :goto_0
    return-void
.end method

.method private static f(Ljava/lang/String;)V
    .locals 1

    .line 34
    const v0, 0x3611c048

    invoke-static {v0, p0}, Lo/bpj;->g(ILjava/lang/String;)V

    .line 35
    return-void
.end method

.method private static g(ILjava/lang/String;)V
    .locals 2

    .line 286
    new-instance v0, Lo/bpj$d;

    invoke-direct {v0, p0}, Lo/bpj$d;-><init>(I)V

    invoke-virtual {v0, p1}, Lo/bpj$d;->c(Ljava/lang/String;)Lo/bpj$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/bpj$d;->d()Landroid/os/Bundle;

    move-result-object v1

    .line 289
    invoke-static {p0, v1}, Lo/bpj;->c(ILandroid/os/Bundle;)V

    .line 290
    return-void
.end method

.method public static h(ILjava/lang/String;)V
    .locals 3

    .line 137
    invoke-static {p0}, Lo/bpi;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 140
    const v0, 0x3611c04d

    invoke-static {v0, p0, p1}, Lo/bpj;->c(IILjava/lang/String;)V

    goto :goto_0

    .line 144
    :cond_0
    const-string v0, "MPS"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ignore report code "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    :goto_0
    return-void
.end method

.method public static i(ILjava/lang/String;)V
    .locals 3

    .line 175
    invoke-static {p0}, Lo/bpi;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 178
    const v0, 0x3611c053

    invoke-static {v0, p0, p1}, Lo/bpj;->c(IILjava/lang/String;)V

    goto :goto_0

    .line 182
    :cond_0
    const-string v0, "Sensitive"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ignore report code "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    :goto_0
    return-void
.end method
