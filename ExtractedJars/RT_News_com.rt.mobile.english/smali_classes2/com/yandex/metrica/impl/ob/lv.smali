.class public final Lcom/yandex/metrica/impl/ob/lv;
.super Lcom/yandex/metrica/impl/ob/ll;
.source "SourceFile"


# static fields
.field private static final a:[I

.field private static final b:Lcom/yandex/metrica/impl/ob/lv;

.field private static c:Ljava/lang/String; = ""


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    .line 25
    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/yandex/metrica/impl/ob/lv;->a:[I

    .line 29
    new-instance v0, Lcom/yandex/metrica/impl/ob/lv;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/lv;-><init>()V

    sput-object v0, Lcom/yandex/metrica/impl/ob/lv;->b:Lcom/yandex/metrica/impl/ob/lv;

    return-void

    :array_0
    .array-data 4
        0x3
        0x6
        0x4
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 34
    invoke-direct {p0, v0}, Lcom/yandex/metrica/impl/ob/ll;-><init>(Z)V

    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 3

    const-string v0, "[%s] : "

    const/4 v1, 0x1

    .line 42
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/yandex/metrica/impl/ob/lv;->c:Ljava/lang/String;

    return-void
.end method

.method public static f()Lcom/yandex/metrica/impl/ob/lv;
    .locals 1

    .line 38
    sget-object v0, Lcom/yandex/metrica/impl/ob/lv;->b:Lcom/yandex/metrica/impl/ob/lv;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/h;Ljava/lang/String;)V
    .locals 1

    .line 61
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->d()I

    move-result v0

    invoke-static {v0}, Lcom/yandex/metrica/impl/q;->b(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 62
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string p2, ": "

    .line 63
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->d()I

    move-result p2

    invoke-static {p2}, Lcom/yandex/metrica/impl/q;->c(I)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 66
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->b()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_0

    const-string p2, " with value "

    .line 67
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/lv;->a(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public a(Lcom/yandex/metrica/impl/ob/jc$c$e$a;Ljava/lang/String;)V
    .locals 6

    .line 1081
    sget-object v0, Lcom/yandex/metrica/impl/ob/lv;->a:[I

    const/4 v1, 0x0

    array-length v2, v0

    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_1

    aget v4, v0, v3

    .line 1082
    iget v5, p1, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->d:I

    if-ne v5, v4, :cond_0

    const/4 v1, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz v1, :cond_5

    .line 76
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ": "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1088
    iget p2, p1, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->d:I

    const/4 v1, 0x3

    if-ne p2, v1, :cond_2

    iget-object p2, p1, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->e:Ljava/lang/String;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 1089
    sget-object p1, Lcom/yandex/metrica/impl/q$a;->n:Lcom/yandex/metrica/impl/q$a;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/q$a;->b()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    .line 1090
    :cond_2
    iget p2, p1, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->d:I

    const/4 v1, 0x4

    if-ne p2, v1, :cond_4

    .line 1091
    new-instance p2, Ljava/lang/StringBuilder;

    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->e:Ljava/lang/String;

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1092
    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->f:[B

    if-eqz v1, :cond_3

    .line 1093
    new-instance v1, Ljava/lang/String;

    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->f:[B

    invoke-direct {v1, p1}, Ljava/lang/String;-><init>([B)V

    .line 1094
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_3

    const-string p1, " with value "

    .line 1095
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1096
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1099
    :cond_3
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    .line 1101
    :cond_4
    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/jc$c$e$a;->e:Ljava/lang/String;

    .line 76
    :goto_2
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/lv;->a(Ljava/lang/String;)V

    :cond_5
    return-void
.end method

.method public a(Lcom/yandex/metrica/impl/ob/jc$c$e;Ljava/lang/String;)V
    .locals 3

    .line 106
    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/jc$c$e;->d:[Lcom/yandex/metrica/impl/ob/jc$c$e$a;

    const/4 v0, 0x0

    array-length v1, p1

    :goto_0
    if-ge v0, v1, :cond_0

    aget-object v2, p1, v0

    .line 107
    invoke-virtual {p0, v2, p2}, Lcom/yandex/metrica/impl/ob/lv;->a(Lcom/yandex/metrica/impl/ob/jc$c$e$a;Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 52
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v0, p1, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "AppMetrica"

    return-object v0
.end method

.method e()Ljava/lang/String;
    .locals 2

    .line 57
    sget-object v0, Lcom/yandex/metrica/impl/ob/lv;->c:Ljava/lang/String;

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/yandex/metrica/impl/bp;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
