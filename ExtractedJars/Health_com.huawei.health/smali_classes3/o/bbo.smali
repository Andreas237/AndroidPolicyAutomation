.class public final Lo/bbo;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lo/bbi;Lo/bbp;Landroid/content/Context;Z)Z
    .locals 6

    .line 89
    const/4 v4, 0x1

    .line 91
    instance-of v0, p0, Lo/bbf;

    if-eqz v0, :cond_2

    .line 93
    move-object v5, p0

    check-cast v5, Lo/bbf;

    .line 95
    invoke-virtual {v5}, Lo/bbf;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 97
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v5}, Lo/bbf;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/atc;->e(J)Z

    move-result v4

    goto :goto_0

    .line 101
    :cond_0
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v5}, Lo/bbf;->c()J

    move-result-wide v1

    .line 102
    invoke-virtual {v5}, Lo/bbf;->d()Ljava/lang/String;

    move-result-object v3

    .line 101
    invoke-virtual {v0, v1, v2, v3}, Lo/axa;->a(JLjava/lang/String;)Z

    move-result v4

    .line 105
    :goto_0
    if-eqz v4, :cond_1

    .line 108
    invoke-static {v5, p1}, Lo/bbo;->c(Lo/bbf;Lo/bbp;)V

    .line 110
    invoke-static {v5, p2}, Lo/bbs;->b(Lo/bbf;Landroid/content/Context;)V

    .line 113
    :cond_1
    if-eqz p3, :cond_2

    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 115
    invoke-static {}, Lo/asj;->a()Lo/asj;

    move-result-object v0

    invoke-virtual {v5}, Lo/bbf;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/asj;->d(J)V

    .line 119
    :cond_2
    return v4
.end method

.method public static b(Lo/bbi;ZLo/bbp;Landroid/content/Context;)Landroid/graphics/Bitmap;
    .locals 5

    .line 155
    const/4 v1, 0x0

    .line 157
    invoke-virtual {p2, p0}, Lo/bbp;->e(Ljava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 158
    if-nez v2, :cond_0

    .line 160
    invoke-static {p0, p1, p2, p3}, Lo/bbo;->c(Lo/bbi;ZLo/bbp;Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 161
    if-nez p1, :cond_0

    .line 164
    const/4 v1, 0x1

    .line 167
    :cond_0
    invoke-static {p0}, Lo/bbs;->c(Lo/bbi;)Ljava/lang/String;

    move-result-object v3

    .line 169
    invoke-virtual {p2, v3, v2}, Lo/bbp;->b(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 172
    if-eqz v4, :cond_1

    .line 174
    invoke-static {p0, p2, p3, v1}, Lo/bbo;->a(Lo/bbi;Lo/bbp;Landroid/content/Context;Z)Z

    .line 177
    :cond_1
    return-object v2
.end method

.method public static b(Lo/bbf;Lo/bbp;Landroid/content/Context;)V
    .locals 3

    .line 187
    new-instance v0, Lo/bbo$2;

    invoke-direct {v0, p0, p1, p2}, Lo/bbo$2;-><init>(Lo/bbf;Lo/bbp;Landroid/content/Context;)V

    sget-object v1, Lo/bbp;->c:Ljava/util/concurrent/Executor;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Void;

    .line 205
    invoke-virtual {v0, v1, v2}, Lo/bbo$2;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 206
    return-void
.end method

.method public static c(Lo/bbi;ZLo/bbp;Landroid/content/Context;)Landroid/graphics/Bitmap;
    .locals 4

    .line 30
    if-eqz p1, :cond_0

    .line 33
    new-instance v3, Lo/bbp$c;

    new-instance v0, Landroid/widget/ImageView;

    invoke-direct {v0, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    invoke-direct {v3, v0, p2, p3}, Lo/bbp$c;-><init>(Landroid/widget/ImageView;Lo/bbp;Landroid/content/Context;)V

    .line 34
    sget-object v0, Lo/bbp;->c:Ljava/util/concurrent/Executor;

    const/4 v1, 0x1

    new-array v1, v1, [Lo/bbi;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-virtual {v3, v0, v1}, Lo/bbp$c;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 35
    const/4 v0, 0x0

    return-object v0

    .line 38
    :cond_0
    invoke-virtual {p2, p0}, Lo/bbp;->d(Ljava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 39
    return-object v3
.end method

.method public static c(Lo/bbf;Lo/bbp;)V
    .locals 4

    .line 129
    invoke-virtual {p0}, Lo/bbf;->b()Ljava/lang/String;

    move-result-object v2

    .line 130
    invoke-virtual {p0}, Lo/bbf;->d()Ljava/lang/String;

    move-result-object v3

    .line 131
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 134
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 136
    invoke-virtual {p0}, Lo/bbf;->p()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v2}, Lo/bbp;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    invoke-virtual {p1, v2}, Lo/bbp;->c(Ljava/lang/String;)V

    .line 139
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bbh;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v2, v1}, Lo/bbk;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 140
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bbh;->c()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v2, v1}, Lo/bbk;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 143
    :cond_0
    return-void
.end method

.method public static d(Lo/bbi;ZLo/bbp;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 5

    .line 52
    const/4 v1, 0x0

    .line 54
    invoke-virtual {p2, p0}, Lo/bbp;->e(Ljava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 55
    if-nez v2, :cond_0

    .line 57
    invoke-static {p0, p1, p2, p3}, Lo/bbo;->c(Lo/bbi;ZLo/bbp;Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 58
    if-nez p1, :cond_0

    .line 61
    const/4 v1, 0x1

    .line 64
    :cond_0
    invoke-static {p0}, Lo/bbs;->c(Lo/bbi;)Ljava/lang/String;

    move-result-object v3

    .line 66
    invoke-virtual {p2, v3, v2}, Lo/bbp;->b(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 69
    if-eqz v4, :cond_1

    .line 71
    invoke-static {p0, p2, p3, v1}, Lo/bbo;->a(Lo/bbi;Lo/bbp;Landroid/content/Context;Z)Z

    .line 74
    :cond_1
    return-object v4
.end method
