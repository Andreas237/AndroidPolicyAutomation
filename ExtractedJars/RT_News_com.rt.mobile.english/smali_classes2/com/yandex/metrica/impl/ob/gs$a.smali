.class public final enum Lcom/yandex/metrica/impl/ob/gs$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/gs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/yandex/metrica/impl/ob/gs$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/yandex/metrica/impl/ob/gs$a;

.field public static final enum b:Lcom/yandex/metrica/impl/ob/gs$a;

.field private static final synthetic d:[Lcom/yandex/metrica/impl/ob/gs$a;


# instance fields
.field private final c:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 17
    new-instance v0, Lcom/yandex/metrica/impl/ob/gs$a;

    const-string v1, "FOREGROUND"

    const-string v2, "fg"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/yandex/metrica/impl/ob/gs$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/gs$a;->a:Lcom/yandex/metrica/impl/ob/gs$a;

    new-instance v0, Lcom/yandex/metrica/impl/ob/gs$a;

    const-string v1, "BACKGROUND"

    const-string v2, "bg"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/yandex/metrica/impl/ob/gs$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/yandex/metrica/impl/ob/gs$a;->b:Lcom/yandex/metrica/impl/ob/gs$a;

    const/4 v0, 0x2

    .line 16
    new-array v0, v0, [Lcom/yandex/metrica/impl/ob/gs$a;

    sget-object v1, Lcom/yandex/metrica/impl/ob/gs$a;->a:Lcom/yandex/metrica/impl/ob/gs$a;

    aput-object v1, v0, v3

    sget-object v1, Lcom/yandex/metrica/impl/ob/gs$a;->b:Lcom/yandex/metrica/impl/ob/gs$a;

    aput-object v1, v0, v4

    sput-object v0, Lcom/yandex/metrica/impl/ob/gs$a;->d:[Lcom/yandex/metrica/impl/ob/gs$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 22
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 23
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/gs$a;->c:Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/gs$a;
    .locals 6
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 34
    sget-object v0, Lcom/yandex/metrica/impl/ob/gs$a;->a:Lcom/yandex/metrica/impl/ob/gs$a;

    .line 35
    invoke-static {}, Lcom/yandex/metrica/impl/ob/gs$a;->values()[Lcom/yandex/metrica/impl/ob/gs$a;

    move-result-object v1

    const/4 v2, 0x0

    array-length v3, v1

    :goto_0
    if-ge v2, v3, :cond_1

    aget-object v4, v1, v2

    .line 36
    iget-object v5, v4, Lcom/yandex/metrica/impl/ob/gs$a;->c:Ljava/lang/String;

    invoke-virtual {v5, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    move-object v0, v4

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/gs$a;
    .locals 1

    .line 16
    const-class v0, Lcom/yandex/metrica/impl/ob/gs$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/yandex/metrica/impl/ob/gs$a;

    return-object p0
.end method

.method public static values()[Lcom/yandex/metrica/impl/ob/gs$a;
    .locals 1

    .line 16
    sget-object v0, Lcom/yandex/metrica/impl/ob/gs$a;->d:[Lcom/yandex/metrica/impl/ob/gs$a;

    invoke-virtual {v0}, [Lcom/yandex/metrica/impl/ob/gs$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/yandex/metrica/impl/ob/gs$a;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 29
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gs$a;->c:Ljava/lang/String;

    return-object v0
.end method
