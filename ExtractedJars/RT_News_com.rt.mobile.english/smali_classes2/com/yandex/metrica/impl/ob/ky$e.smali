.class Lcom/yandex/metrica/impl/ob/ky$e;
.super Lcom/yandex/metrica/impl/ob/ky$b;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x12
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/ky;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 117
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/ky$b;-><init>()V

    return-void
.end method


# virtual methods
.method a(Landroid/telephony/CellInfo;)Lcom/yandex/metrica/impl/ob/ky;
    .locals 11

    .line 121
    check-cast p1, Landroid/telephony/CellInfoWcdma;

    .line 122
    invoke-virtual {p1}, Landroid/telephony/CellInfoWcdma;->getCellIdentity()Landroid/telephony/CellIdentityWcdma;

    move-result-object v0

    .line 123
    invoke-virtual {v0}, Landroid/telephony/CellIdentityWcdma;->getCid()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 124
    invoke-virtual {v0}, Landroid/telephony/CellIdentityWcdma;->getLac()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p1}, Landroid/telephony/CellInfoWcdma;->getCellSignalStrength()Landroid/telephony/CellSignalStrengthWcdma;

    move-result-object v5

    invoke-virtual {v0}, Landroid/telephony/CellIdentityWcdma;->getMnc()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    .line 125
    invoke-virtual {v0}, Landroid/telephony/CellIdentityWcdma;->getMcc()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {p1}, Landroid/telephony/CellInfoWcdma;->isRegistered()Z

    move-result v8

    invoke-virtual {v0}, Landroid/telephony/CellIdentityWcdma;->getPsc()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/4 v9, 0x3

    move-object v2, p0

    .line 123
    invoke-virtual/range {v2 .. v10}, Lcom/yandex/metrica/impl/ob/ky$e;->a(Ljava/lang/Integer;Ljava/lang/Integer;Landroid/telephony/CellSignalStrength;Ljava/lang/Integer;Ljava/lang/Integer;ZILjava/lang/Integer;)Lcom/yandex/metrica/impl/ob/ky;

    move-result-object p1

    return-object p1
.end method
