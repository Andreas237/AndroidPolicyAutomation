.class Lcom/yandex/metrica/impl/bm$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/bm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a([B[B)Lcom/yandex/metrica/impl/ob/mg;
    .locals 2

    .line 34
    new-instance v0, Lcom/yandex/metrica/impl/ob/mg;

    const-string v1, "AES/CBC/PKCS5Padding"

    invoke-direct {v0, v1, p1, p2}, Lcom/yandex/metrica/impl/ob/mg;-><init>(Ljava/lang/String;[B[B)V

    return-object v0
.end method
