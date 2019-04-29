.class Lcom/yandex/metrica/impl/ob/ky$a;
.super Lcom/yandex/metrica/impl/ob/ky$b;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x11
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/ky;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 93
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/ky$b;-><init>()V

    return-void
.end method


# virtual methods
.method a(Landroid/telephony/CellInfo;)Lcom/yandex/metrica/impl/ob/ky;
    .locals 9

    .line 97
    check-cast p1, Landroid/telephony/CellInfoCdma;

    .line 98
    invoke-virtual {p1}, Landroid/telephony/CellInfoCdma;->getCellSignalStrength()Landroid/telephony/CellSignalStrengthCdma;

    move-result-object v3

    .line 99
    invoke-virtual {p1}, Landroid/telephony/CellInfoCdma;->isRegistered()Z

    move-result v6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    move-object v0, p0

    .line 98
    invoke-virtual/range {v0 .. v8}, Lcom/yandex/metrica/impl/ob/ky$a;->a(Ljava/lang/Integer;Ljava/lang/Integer;Landroid/telephony/CellSignalStrength;Ljava/lang/Integer;Ljava/lang/Integer;ZILjava/lang/Integer;)Lcom/yandex/metrica/impl/ob/ky;

    move-result-object p1

    return-object p1
.end method
