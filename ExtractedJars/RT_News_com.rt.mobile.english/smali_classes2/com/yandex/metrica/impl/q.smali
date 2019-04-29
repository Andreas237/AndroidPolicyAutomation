.class public final Lcom/yandex/metrica/impl/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/q$a;
    }
.end annotation


# static fields
.field public static final a:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet<",
            "Lcom/yandex/metrica/impl/q$a;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet<",
            "Lcom/yandex/metrica/impl/q$a;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet<",
            "Lcom/yandex/metrica/impl/q$a;",
            ">;"
        }
    .end annotation
.end field

.field private static final d:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet<",
            "Lcom/yandex/metrica/impl/q$a;",
            ">;"
        }
    .end annotation
.end field

.field private static final e:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet<",
            "Lcom/yandex/metrica/impl/q$a;",
            ">;"
        }
    .end annotation
.end field

.field private static final f:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet<",
            "Lcom/yandex/metrica/impl/q$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 103
    sget-object v0, Lcom/yandex/metrica/impl/q$a;->a:Lcom/yandex/metrica/impl/q$a;

    const/4 v1, 0x7

    new-array v2, v1, [Lcom/yandex/metrica/impl/q$a;

    sget-object v3, Lcom/yandex/metrica/impl/q$a;->m:Lcom/yandex/metrica/impl/q$a;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    sget-object v3, Lcom/yandex/metrica/impl/q$a;->g:Lcom/yandex/metrica/impl/q$a;

    const/4 v5, 0x1

    aput-object v3, v2, v5

    sget-object v3, Lcom/yandex/metrica/impl/q$a;->r:Lcom/yandex/metrica/impl/q$a;

    const/4 v6, 0x2

    aput-object v3, v2, v6

    sget-object v3, Lcom/yandex/metrica/impl/q$a;->s:Lcom/yandex/metrica/impl/q$a;

    const/4 v7, 0x3

    aput-object v3, v2, v7

    sget-object v3, Lcom/yandex/metrica/impl/q$a;->u:Lcom/yandex/metrica/impl/q$a;

    const/4 v8, 0x4

    aput-object v3, v2, v8

    sget-object v3, Lcom/yandex/metrica/impl/q$a;->v:Lcom/yandex/metrica/impl/q$a;

    const/4 v9, 0x5

    aput-object v3, v2, v9

    sget-object v3, Lcom/yandex/metrica/impl/q$a;->x:Lcom/yandex/metrica/impl/q$a;

    const/4 v10, 0x6

    aput-object v3, v2, v10

    .line 104
    invoke-static {v0, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    sput-object v0, Lcom/yandex/metrica/impl/q;->b:Ljava/util/EnumSet;

    .line 115
    sget-object v0, Lcom/yandex/metrica/impl/q$a;->h:Lcom/yandex/metrica/impl/q$a;

    const/16 v2, 0xc

    new-array v2, v2, [Lcom/yandex/metrica/impl/q$a;

    sget-object v3, Lcom/yandex/metrica/impl/q$a;->i:Lcom/yandex/metrica/impl/q$a;

    aput-object v3, v2, v4

    sget-object v3, Lcom/yandex/metrica/impl/q$a;->p:Lcom/yandex/metrica/impl/q$a;

    aput-object v3, v2, v5

    sget-object v3, Lcom/yandex/metrica/impl/q$a;->g:Lcom/yandex/metrica/impl/q$a;

    aput-object v3, v2, v6

    sget-object v3, Lcom/yandex/metrica/impl/q$a;->a:Lcom/yandex/metrica/impl/q$a;

    aput-object v3, v2, v7

    sget-object v3, Lcom/yandex/metrica/impl/q$a;->b:Lcom/yandex/metrica/impl/q$a;

    aput-object v3, v2, v8

    sget-object v3, Lcom/yandex/metrica/impl/q$a;->C:Lcom/yandex/metrica/impl/q$a;

    aput-object v3, v2, v9

    sget-object v3, Lcom/yandex/metrica/impl/q$a;->s:Lcom/yandex/metrica/impl/q$a;

    aput-object v3, v2, v10

    sget-object v3, Lcom/yandex/metrica/impl/q$a;->f:Lcom/yandex/metrica/impl/q$a;

    aput-object v3, v2, v1

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->o:Lcom/yandex/metrica/impl/q$a;

    const/16 v3, 0x8

    aput-object v1, v2, v3

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->u:Lcom/yandex/metrica/impl/q$a;

    const/16 v3, 0x9

    aput-object v1, v2, v3

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->v:Lcom/yandex/metrica/impl/q$a;

    const/16 v3, 0xa

    aput-object v1, v2, v3

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->x:Lcom/yandex/metrica/impl/q$a;

    const/16 v3, 0xb

    aput-object v1, v2, v3

    .line 116
    invoke-static {v0, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    sput-object v0, Lcom/yandex/metrica/impl/q;->c:Ljava/util/EnumSet;

    .line 132
    sget-object v0, Lcom/yandex/metrica/impl/q$a;->d:Lcom/yandex/metrica/impl/q$a;

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->h:Lcom/yandex/metrica/impl/q$a;

    sget-object v2, Lcom/yandex/metrica/impl/q$a;->i:Lcom/yandex/metrica/impl/q$a;

    .line 133
    invoke-static {v0, v1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    sput-object v0, Lcom/yandex/metrica/impl/q;->d:Ljava/util/EnumSet;

    .line 139
    sget-object v0, Lcom/yandex/metrica/impl/q$a;->b:Lcom/yandex/metrica/impl/q$a;

    new-array v1, v9, [Lcom/yandex/metrica/impl/q$a;

    sget-object v2, Lcom/yandex/metrica/impl/q$a;->A:Lcom/yandex/metrica/impl/q$a;

    aput-object v2, v1, v4

    sget-object v2, Lcom/yandex/metrica/impl/q$a;->y:Lcom/yandex/metrica/impl/q$a;

    aput-object v2, v1, v5

    sget-object v2, Lcom/yandex/metrica/impl/q$a;->r:Lcom/yandex/metrica/impl/q$a;

    aput-object v2, v1, v6

    sget-object v2, Lcom/yandex/metrica/impl/q$a;->s:Lcom/yandex/metrica/impl/q$a;

    aput-object v2, v1, v7

    sget-object v2, Lcom/yandex/metrica/impl/q$a;->C:Lcom/yandex/metrica/impl/q$a;

    aput-object v2, v1, v8

    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    sput-object v0, Lcom/yandex/metrica/impl/q;->a:Ljava/util/EnumSet;

    .line 148
    sget-object v0, Lcom/yandex/metrica/impl/q$a;->w:Lcom/yandex/metrica/impl/q$a;

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->e:Lcom/yandex/metrica/impl/q$a;

    sget-object v2, Lcom/yandex/metrica/impl/q$a;->n:Lcom/yandex/metrica/impl/q$a;

    sget-object v3, Lcom/yandex/metrica/impl/q$a;->c:Lcom/yandex/metrica/impl/q$a;

    invoke-static {v0, v1, v2, v3}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    sput-object v0, Lcom/yandex/metrica/impl/q;->e:Ljava/util/EnumSet;

    .line 155
    sget-object v0, Lcom/yandex/metrica/impl/q$a;->c:Lcom/yandex/metrica/impl/q$a;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    sput-object v0, Lcom/yandex/metrica/impl/q;->f:Ljava/util/EnumSet;

    return-void
.end method

.method static a(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/yandex/metrica/impl/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/yandex/metrica/impl/h;"
        }
    .end annotation

    .line 283
    new-instance v0, Lcom/yandex/metrica/impl/d;

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->A:Lcom/yandex/metrica/impl/q$a;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/q$a;->a()I

    move-result v1

    invoke-direct {v0, p2, p1, v1, p0}, Lcom/yandex/metrica/impl/d;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    .line 284
    invoke-static {p3}, Lcom/yandex/metrica/impl/ob/lp;->a(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/yandex/metrica/impl/d;->f(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object p0

    return-object p0
.end method

.method public static a(Lcom/yandex/metrica/impl/at;)Lcom/yandex/metrica/impl/h;
    .locals 3

    if-nez p0, :cond_0

    const-string p0, ""

    goto :goto_0

    .line 255
    :cond_0
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/at;->a()Ljava/lang/String;

    move-result-object p0

    .line 256
    :goto_0
    new-instance v0, Lcom/yandex/metrica/impl/d;

    const-string v1, ""

    sget-object v2, Lcom/yandex/metrica/impl/q$a;->x:Lcom/yandex/metrica/impl/q$a;

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/q$a;->a()I

    move-result v2

    invoke-direct {v0, p0, v1, v2}, Lcom/yandex/metrica/impl/d;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method

.method public static a(Lcom/yandex/metrica/impl/ob/jn;)Lcom/yandex/metrica/impl/h;
    .locals 3
    .param p0    # Lcom/yandex/metrica/impl/ob/jn;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-nez p0, :cond_0

    .line 228
    new-instance p0, Lcom/yandex/metrica/impl/d;

    const-string v0, ""

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->t:Lcom/yandex/metrica/impl/q$a;

    .line 229
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/q$a;->a()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/yandex/metrica/impl/d;-><init>(Ljava/lang/String;I)V

    return-object p0

    .line 231
    :cond_0
    new-instance v0, Lcom/yandex/metrica/impl/d;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/jn;->a:Ljava/lang/String;

    sget-object v2, Lcom/yandex/metrica/impl/q$a;->t:Lcom/yandex/metrica/impl/q$a;

    .line 233
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/q$a;->a()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/yandex/metrica/impl/d;-><init>(Ljava/lang/String;I)V

    .line 234
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/jn;->a()[B

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/yandex/metrica/impl/d;->a([B)Lcom/yandex/metrica/impl/h;

    move-result-object p0

    return-object p0
.end method

.method static a(Lcom/yandex/metrica/impl/q$a;Ljava/lang/String;)Lcom/yandex/metrica/impl/h;
    .locals 2

    .line 186
    new-instance v0, Lcom/yandex/metrica/impl/d;

    const-string v1, ""

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/q$a;->a()I

    move-result p0

    invoke-direct {v0, p1, v1, p0}, Lcom/yandex/metrica/impl/d;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method

.method public static a(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;
    .locals 2

    .line 194
    new-instance v0, Lcom/yandex/metrica/impl/d;

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->c:Lcom/yandex/metrica/impl/q$a;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/q$a;->a()I

    move-result v1

    invoke-direct {v0, p0, v1}, Lcom/yandex/metrica/impl/d;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method

.method static a(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/metrica/impl/h;
    .locals 2

    .line 198
    new-instance v0, Lcom/yandex/metrica/impl/d;

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->c:Lcom/yandex/metrica/impl/q$a;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/q$a;->a()I

    move-result v1

    invoke-direct {v0, p1, p0, v1}, Lcom/yandex/metrica/impl/d;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method

.method public static a(I)Z
    .locals 1

    .line 174
    sget-object v0, Lcom/yandex/metrica/impl/q;->d:Ljava/util/EnumSet;

    invoke-static {p0}, Lcom/yandex/metrica/impl/q$a;->a(I)Lcom/yandex/metrica/impl/q$a;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/EnumSet;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static a(Lcom/yandex/metrica/impl/q$a;)Z
    .locals 1

    .line 166
    sget-object v0, Lcom/yandex/metrica/impl/q;->b:Ljava/util/EnumSet;

    invoke-virtual {v0, p0}, Ljava/util/EnumSet;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method static b(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;
    .locals 2

    .line 210
    new-instance v0, Lcom/yandex/metrica/impl/d;

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->z:Lcom/yandex/metrica/impl/q$a;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/q$a;->a()I

    move-result v1

    invoke-direct {v0, p0, v1}, Lcom/yandex/metrica/impl/d;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method

.method static b(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/metrica/impl/h;
    .locals 2

    .line 202
    new-instance v0, Lcom/yandex/metrica/impl/d;

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->q:Lcom/yandex/metrica/impl/q$a;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/q$a;->a()I

    move-result v1

    invoke-direct {v0, p1, p0, v1}, Lcom/yandex/metrica/impl/d;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method

.method public static b(I)Z
    .locals 1

    .line 178
    sget-object v0, Lcom/yandex/metrica/impl/q;->e:Ljava/util/EnumSet;

    invoke-static {p0}, Lcom/yandex/metrica/impl/q$a;->a(I)Lcom/yandex/metrica/impl/q$a;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/EnumSet;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static b(Lcom/yandex/metrica/impl/q$a;)Z
    .locals 1

    .line 170
    sget-object v0, Lcom/yandex/metrica/impl/q;->c:Ljava/util/EnumSet;

    invoke-virtual {v0, p0}, Ljava/util/EnumSet;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static c(Lcom/yandex/metrica/impl/q$a;)Lcom/yandex/metrica/impl/h;
    .locals 2

    .line 190
    new-instance v0, Lcom/yandex/metrica/impl/d;

    const-string v1, ""

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/q$a;->a()I

    move-result p0

    invoke-direct {v0, v1, p0}, Lcom/yandex/metrica/impl/d;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method

.method static c(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;
    .locals 2

    .line 214
    new-instance v0, Lcom/yandex/metrica/impl/d;

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->d:Lcom/yandex/metrica/impl/q$a;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/q$a;->a()I

    move-result v1

    invoke-direct {v0, p0, v1}, Lcom/yandex/metrica/impl/d;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method

.method static c(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/metrica/impl/h;
    .locals 2

    .line 206
    new-instance v0, Lcom/yandex/metrica/impl/d;

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->e:Lcom/yandex/metrica/impl/q$a;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/q$a;->a()I

    move-result v1

    invoke-direct {v0, p1, p0, v1}, Lcom/yandex/metrica/impl/d;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method

.method public static c(I)Z
    .locals 1

    .line 182
    sget-object v0, Lcom/yandex/metrica/impl/q;->f:Ljava/util/EnumSet;

    invoke-static {p0}, Lcom/yandex/metrica/impl/q$a;->a(I)Lcom/yandex/metrica/impl/q$a;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/EnumSet;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static d(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;
    .locals 3

    .line 222
    new-instance v0, Lcom/yandex/metrica/impl/d;

    const-string v1, ""

    sget-object v2, Lcom/yandex/metrica/impl/q$a;->r:Lcom/yandex/metrica/impl/q$a;

    .line 223
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/q$a;->a()I

    move-result v2

    invoke-direct {v0, v1, p0, v2}, Lcom/yandex/metrica/impl/d;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method

.method static d(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/metrica/impl/h;
    .locals 2

    .line 218
    new-instance v0, Lcom/yandex/metrica/impl/d;

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->w:Lcom/yandex/metrica/impl/q$a;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/q$a;->a()I

    move-result v1

    invoke-direct {v0, p1, p0, v1}, Lcom/yandex/metrica/impl/d;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method

.method static e(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;
    .locals 1

    const-string v0, "open"

    .line 239
    invoke-static {v0, p0}, Lcom/yandex/metrica/impl/q;->e(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object p0

    return-object p0
.end method

.method static e(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/metrica/impl/h;
    .locals 2

    .line 247
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "type"

    .line 248
    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p0, "link"

    .line 249
    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    new-instance p0, Lcom/yandex/metrica/impl/d;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/lp;->a(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    const-string v0, ""

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->B:Lcom/yandex/metrica/impl/q$a;

    .line 251
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/q$a;->a()I

    move-result v1

    invoke-direct {p0, p1, v0, v1}, Lcom/yandex/metrica/impl/d;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    return-object p0
.end method

.method static f(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;
    .locals 1

    const-string v0, "referral"

    .line 243
    invoke-static {v0, p0}, Lcom/yandex/metrica/impl/q;->e(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object p0

    return-object p0
.end method
