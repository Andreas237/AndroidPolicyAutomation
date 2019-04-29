.class Lcom/yandex/metrica/impl/av$f;
.super Lcom/yandex/metrica/impl/av$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/av;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "f"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 698
    invoke-direct {p0}, Lcom/yandex/metrica/impl/av$c;-><init>()V

    return-void
.end method


# virtual methods
.method protected a()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method protected b()[B
    .locals 1

    const/4 v0, 0x0

    .line 707
    new-array v0, v0, [B

    return-object v0
.end method
