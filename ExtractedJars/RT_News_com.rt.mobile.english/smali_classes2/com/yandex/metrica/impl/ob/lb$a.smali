.class Lcom/yandex/metrica/impl/ob/lb$a;
.super Landroid/telephony/PhoneStateListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/lb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/ob/lb;


# direct methods
.method private constructor <init>(Lcom/yandex/metrica/impl/ob/lb;)V
    .locals 0

    .line 155
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/lb$a;->a:Lcom/yandex/metrica/impl/ob/lb;

    invoke-direct {p0}, Landroid/telephony/PhoneStateListener;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/yandex/metrica/impl/ob/lb;B)V
    .locals 0

    .line 155
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/lb$a;-><init>(Lcom/yandex/metrica/impl/ob/lb;)V

    return-void
.end method


# virtual methods
.method public onSignalStrengthsChanged(Landroid/telephony/SignalStrength;)V
    .locals 1

    .line 159
    invoke-super {p0, p1}, Landroid/telephony/PhoneStateListener;->onSignalStrengthsChanged(Landroid/telephony/SignalStrength;)V

    .line 160
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/lb$a;->a:Lcom/yandex/metrica/impl/ob/lb;

    invoke-static {v0, p1}, Lcom/yandex/metrica/impl/ob/lb;->a(Lcom/yandex/metrica/impl/ob/lb;Landroid/telephony/SignalStrength;)V

    return-void
.end method
