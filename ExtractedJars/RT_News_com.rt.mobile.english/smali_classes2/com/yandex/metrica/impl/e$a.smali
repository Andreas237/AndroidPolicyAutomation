.class Lcom/yandex/metrica/impl/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ak$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/yandex/metrica/impl/ob/fg;


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/fg;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Lcom/yandex/metrica/impl/e$a;->a:Lcom/yandex/metrica/impl/ob/fg;

    return-void
.end method

.method private static a(JJJ)Z
    .locals 1

    cmp-long v0, p0, p4

    if-eqz v0, :cond_0

    cmp-long p0, p2, p4

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    .line 87
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 11

    .line 63
    new-instance v0, Lcom/yandex/metrica/impl/ob/ia;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/ia;-><init>(Landroid/content/Context;)V

    .line 64
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ia;->c()Ljava/util/Map;

    move-result-object p1

    invoke-static {p1}, Lcom/yandex/metrica/impl/br;->a(Ljava/util/Map;)Z

    move-result p1

    if-nez p1, :cond_9

    iget-object p1, p0, Lcom/yandex/metrica/impl/e$a;->a:Lcom/yandex/metrica/impl/ob/fg;

    const/4 v1, 0x0

    .line 65
    invoke-virtual {p1, v1}, Lcom/yandex/metrica/impl/ob/fg;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/yandex/metrica/impl/e$a;->a:Lcom/yandex/metrica/impl/ob/fg;

    .line 66
    invoke-virtual {p1, v1}, Lcom/yandex/metrica/impl/ob/fg;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_9

    .line 1091
    :cond_0
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ia;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1092
    iget-object v2, p0, Lcom/yandex/metrica/impl/e$a;->a:Lcom/yandex/metrica/impl/ob/fg;

    invoke-virtual {v2, v1}, Lcom/yandex/metrica/impl/ob/fg;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/yandex/metrica/impl/e$a;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1093
    iget-object v2, p0, Lcom/yandex/metrica/impl/e$a;->a:Lcom/yandex/metrica/impl/ob/fg;

    invoke-virtual {v2, p1}, Lcom/yandex/metrica/impl/ob/fg;->g(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fg;

    .line 1098
    :cond_1
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ia;->a()Ljava/lang/String;

    move-result-object p1

    .line 1099
    iget-object v2, p0, Lcom/yandex/metrica/impl/e$a;->a:Lcom/yandex/metrica/impl/ob/fg;

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/fg;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/yandex/metrica/impl/e$a;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1100
    iget-object v2, p0, Lcom/yandex/metrica/impl/e$a;->a:Lcom/yandex/metrica/impl/ob/fg;

    invoke-virtual {v2, p1}, Lcom/yandex/metrica/impl/ob/fg;->k(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fg;

    .line 1105
    :cond_2
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ia;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1106
    iget-object v2, p0, Lcom/yandex/metrica/impl/e$a;->a:Lcom/yandex/metrica/impl/ob/fg;

    invoke-virtual {v2, v1}, Lcom/yandex/metrica/impl/ob/fg;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/yandex/metrica/impl/e$a;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 1107
    iget-object v2, p0, Lcom/yandex/metrica/impl/e$a;->a:Lcom/yandex/metrica/impl/ob/fg;

    invoke-virtual {v2, p1}, Lcom/yandex/metrica/impl/ob/fg;->f(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fg;

    .line 1112
    :cond_3
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ia;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1113
    iget-object v2, p0, Lcom/yandex/metrica/impl/e$a;->a:Lcom/yandex/metrica/impl/ob/fg;

    invoke-virtual {v2, v1}, Lcom/yandex/metrica/impl/ob/fg;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/yandex/metrica/impl/e$a;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 1114
    iget-object v2, p0, Lcom/yandex/metrica/impl/e$a;->a:Lcom/yandex/metrica/impl/ob/fg;

    invoke-virtual {v2, p1}, Lcom/yandex/metrica/impl/ob/fg;->h(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fg;

    .line 1119
    :cond_4
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ia;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1120
    iget-object v2, p0, Lcom/yandex/metrica/impl/e$a;->a:Lcom/yandex/metrica/impl/ob/fg;

    invoke-virtual {v2, v1}, Lcom/yandex/metrica/impl/ob/fg;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lcom/yandex/metrica/impl/e$a;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 1121
    iget-object v2, p0, Lcom/yandex/metrica/impl/e$a;->a:Lcom/yandex/metrica/impl/ob/fg;

    invoke-virtual {v2, p1}, Lcom/yandex/metrica/impl/ob/fg;->i(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fg;

    .line 1126
    :cond_5
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ia;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1127
    iget-object v2, p0, Lcom/yandex/metrica/impl/e$a;->a:Lcom/yandex/metrica/impl/ob/fg;

    invoke-virtual {v2, v1}, Lcom/yandex/metrica/impl/ob/fg;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/yandex/metrica/impl/e$a;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 1128
    iget-object v1, p0, Lcom/yandex/metrica/impl/e$a;->a:Lcom/yandex/metrica/impl/ob/fg;

    invoke-virtual {v1, p1}, Lcom/yandex/metrica/impl/ob/fg;->j(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/fg;

    :cond_6
    const-wide/16 v1, -0x1

    .line 1134
    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/ia;->a(J)J

    move-result-wide v9

    .line 1135
    iget-object p1, p0, Lcom/yandex/metrica/impl/e$a;->a:Lcom/yandex/metrica/impl/ob/fg;

    invoke-virtual {p1, v1, v2}, Lcom/yandex/metrica/impl/ob/fg;->a(J)J

    move-result-wide v5

    const-wide/16 v7, -0x1

    move-wide v3, v9

    invoke-static/range {v3 .. v8}, Lcom/yandex/metrica/impl/e$a;->a(JJJ)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 1136
    iget-object p1, p0, Lcom/yandex/metrica/impl/e$a;->a:Lcom/yandex/metrica/impl/ob/fg;

    invoke-virtual {p1, v9, v10}, Lcom/yandex/metrica/impl/ob/fg;->d(J)Lcom/yandex/metrica/impl/ob/fg;

    .line 1142
    :cond_7
    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/ia;->b(J)J

    move-result-wide v9

    .line 1143
    iget-object p1, p0, Lcom/yandex/metrica/impl/e$a;->a:Lcom/yandex/metrica/impl/ob/fg;

    invoke-virtual {p1, v1, v2}, Lcom/yandex/metrica/impl/ob/fg;->b(J)J

    move-result-wide v5

    const-wide/16 v7, -0x1

    move-wide v3, v9

    invoke-static/range {v3 .. v8}, Lcom/yandex/metrica/impl/e$a;->a(JJJ)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 1144
    iget-object p1, p0, Lcom/yandex/metrica/impl/e$a;->a:Lcom/yandex/metrica/impl/ob/fg;

    invoke-virtual {p1, v9, v10}, Lcom/yandex/metrica/impl/ob/fg;->e(J)Lcom/yandex/metrica/impl/ob/fg;

    .line 77
    :cond_8
    iget-object p1, p0, Lcom/yandex/metrica/impl/e$a;->a:Lcom/yandex/metrica/impl/ob/fg;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/fg;->i()V

    .line 78
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ia;->b()Lcom/yandex/metrica/impl/ob/ia;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ia;->j()V

    :cond_9
    return-void
.end method
